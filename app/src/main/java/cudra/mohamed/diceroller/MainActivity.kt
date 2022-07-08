package cudra.mohamed.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button=findViewById(R.id.roll_button)
//        rollButton.text="Let's Roll" -> to enable a pop up and a change of text
        rollButton.setOnClickListener {
//            Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show() -> to enable text popup
            rollDice() //alt enter -> to create a function
        }
    }

    private fun rollDice() {
        val resultText:TextView=findViewById(R.id.result_Toast)
//        val randomInt = Random().nextInt(6) + 1 //creating a random number between 0-5
//        resultText.text=randomInt.toString()
//        resultText.text = "Dice Rolled!"
    }
}