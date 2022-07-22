package cudra.mohamed.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button=findViewById(R.id.roll_button)
//        rollButton.text="Let's Roll" -> to enable a pop up and a change of text
        rollButton.setOnClickListener {
//            Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show() -> to enable text popup
            rollDice() //alt enter -> to create a function
        }
        diceImage=findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6) + 1 //creating a random number between 0-5
        val drwableResource=when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(drwableResource)
    }
}