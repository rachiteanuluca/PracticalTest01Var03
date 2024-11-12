package ro.pub.cs.systems.eim.practicaltest01var03

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PracticalTest01Var03SecondaryActivity : AppCompatActivity(){

    var result: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var03_secondary)


        result = findViewById<View>(R.id.secondary_result) as TextView;
        if ("ro.pub.cs.systems.eim.SECONDARY_ACTIVITY_INTENT" != intent.action)
            return;

        val number = intent.getIntExtra("result", 0);
        result!!.text = "Rezultat: $number"

        Toast.makeText(this, "Rezultat: " + number, Toast.LENGTH_LONG).show()
    }
}