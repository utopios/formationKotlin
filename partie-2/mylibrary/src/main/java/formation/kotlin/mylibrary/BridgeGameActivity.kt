package formation.kotlin.mylibrary

import android.content.DialogInterface
import android.icu.text.LocaleDisplayNames
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_bridge_game.*

open class BridgeGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bridge_game)
        bridge_game_webview.loadUrl("https://google.com")
        bridge_game_webview.settings.javaScriptEnabled = true
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