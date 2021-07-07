package formation.kotlin.androidapp

import android.Manifest
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class FormActivity : AppCompatActivity() {
    var principal_layout:LinearLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
    }

    override fun onStart() {
        super.onStart()
        addElementToPrincipalLayout()
    }

    fun addElementToPrincipalLayout() {
        principal_layout = findViewById<LinearLayout>(R.id.principal_layout)
        val button2 = Button(ContextThemeWrapper(this, R.style.redText))
        button2.text = "Register"
        //Ajouter une méthode à un événement en kotlin
        button2.setOnClickListener { onClickSubmit(it) }
        //Ajouter un style à notre button
        //button2.setTextAppearance(R.style.redText)
        //Ajouter notre view(Button) dans ViewGroup(LinearLayout)
        principal_layout?.addView(button2)



    }

    fun onClickSubmit(view: View) {
        if(view is Button) {
            var result = findViewById<TextView>(R.id.form_activity_result)
            //la méthode getResources renvoie un objet de type Resources permet d'acceder aux ressources de notre application
            result.text = view.text.toString() + " "+ getResources().getString(R.string.result_text)
            result.setTextAppearance(R.style.redText)
        }
    }

    fun sendSms(view: View) {
        requestPermissions(arrayOf(Manifest.permission.SEND_SMS),14500)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode) {
            14500 -> println("send SMS")
        }
    }
}