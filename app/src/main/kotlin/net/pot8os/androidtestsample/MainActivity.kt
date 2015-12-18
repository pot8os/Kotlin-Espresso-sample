package net.pot8os.androidtestsample

import android.app.AlertDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/**
 * @author So Nakamura, 2015/12/19
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var calcButton = findViewById(R.id.calcButton) as Button
        calcButton.setOnClickListener {
            val arg1 = findViewById(R.id.arg1) as EditText
            val arg2 = findViewById(R.id.arg2) as EditText
            val calculator = Calculator()
            try {
                val answer = calculator.calc(arg1.text.toString(), arg2.text.toString())
                val answerView = findViewById(R.id.answer) as TextView
                answerView.text = answer
            } catch (e: Exception) {
                Log.wtf("Exception.", e)
                AlertDialog.Builder(this)
                        .setTitle("Error")
                        .setMessage("Invalid input. Set numeric string.")
                        .setPositiveButton("OK", null)
                        .show()
            }
        }
    }
}