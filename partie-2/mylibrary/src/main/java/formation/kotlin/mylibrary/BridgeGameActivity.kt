package formation.kotlin.mylibrary

import android.content.Context
import android.content.DialogInterface
import android.icu.text.LocaleDisplayNames
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.JavascriptInterface
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_bridge_game.*
import org.json.JSONObject

open class BridgeGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bridge_game)
        bridge_game_webview.loadUrl("file:///android_asset/index.html")
        bridge_game_webview.settings.javaScriptEnabled = true
        bridge_game_webview.addJavascriptInterface(JavascriptInterface(this),"Bridge")

        bridge_game_webview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                view!!.loadUrl(request!!.url.toString())
                return true
            }
        }
    }
     class JavascriptInterface(val context: Context) {
        @android.webkit.JavascriptInterface
        fun sendDataFromWebView(data:String) {
            val dataObject = Person(JSONObject(data).getString("name"))
            println(dataObject)
            (context as BridgeGameActivity).runOnUiThread { context.bridge_game_webview.evaluateJavascript("javascript: getData('${dataObject.name}response')",null) }
        }
    }
    data class Person(val name:String);

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if(keyCode == KeyEvent.KEYCODE_BACK && bridge_game_webview.canGoBack()){
            //AlertDialog
                val dialog = AlertDialog.Builder(this)
                dialog.setMessage("Vous êtes sur de quitter ?").setPositiveButton("OK",DialogInterface.OnClickListener {dialog, id -> bridge_game_webview.goBack()})
                    .setNegativeButton("Non", DialogInterface.OnClickListener {dialog, id -> false})
                dialog.create().show()
        }
        return super.onKeyDown(keyCode, event)
    }
}