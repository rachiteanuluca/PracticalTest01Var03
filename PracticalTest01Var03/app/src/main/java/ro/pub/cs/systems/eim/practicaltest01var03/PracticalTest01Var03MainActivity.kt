package ro.pub.cs.systems.eim.practicaltest01var03

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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

    }
}
