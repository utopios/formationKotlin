package formation.kotlin.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import formation.kotlin.mylibrary.BridgeGameActivity

class SecondActivity : BridgeGameActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val b1 = findViewById<Button>(R.id.bridge_game_b1)
        b1.text = "new Text"
    }
}