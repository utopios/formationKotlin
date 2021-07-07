package formation.kotlin.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import formation.kotlin.androidapp.models.Person

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text = TextView(this)
        text.text = "TextView created by code"
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
    fun goTo(view: View) {
        val intention = Intent(this, FormActivity::class.java)
        //Envoyer des données dans une intentions
        intention.putExtra("key1", Person("toto"))
        startActivity(intention)
    }
}