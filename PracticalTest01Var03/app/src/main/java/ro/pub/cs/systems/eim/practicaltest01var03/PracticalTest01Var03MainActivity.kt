package ro.pub.cs.systems.eim.practicaltest01var03

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class PracticalTest01Var03MainActivity : AppCompatActivity() {
    var number1: EditText? = null
    var number2: EditText? = null
    var result: TextView? = null
    var addButton: Button? = null
    var subtractButton: Button? = null
    var nextButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var03_main)

        number1 = findViewById<View>(R.id.number1) as EditText
        number2 = findViewById<View>(R.id.number2) as EditText
        result = findViewById<View>(R.id.result) as TextView
        addButton = findViewById<View>(R.id.add_button) as Button
        subtractButton = findViewById<View>(R.id.substract_button) as Button
        nextButton = findViewById<View>(R.id.next_button) as Button

        addButton!!.setOnClickListener {
            val num1 = number1!!.text.toString().toInt()
            val num2 = number2!!.text.toString().toInt()
            val sum = num1 + num2
            result!!.text = "Rezultat: $sum"
        }

        subtractButton!!.setOnClickListener {
            val num1 = number1!!.text.toString().toInt()
            val num2 = number2!!.text.toString().toInt()
            val diff = num1 - num2
            result!!.text = "Rezultat: $diff"
        }

        savedInstanceState?.let {
            number1!!.setText(it.getString("edit_text_1"))
            number2!!.setText(it.getString("edit_text_2"))

            Toast.makeText(this, "Numarul 1: "+ number1!!.text + ", Numarul 2: " + number2!!.text, Toast.LENGTH_LONG).show()
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        // Salvaţi starea EditText
        outState.putString("edit_text_1", number1!!.text.toString())
        outState.putString("edit_text_2", number2!!.text.toString())
    }
}
