package com.example.franciscofagnerac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val group = findViewById<RadioGroup>(R.id.radioGroup1)
        val btn = findViewById<Button>(R.id.btnProxima)

        btn.setOnClickListener {
            val r1 = group.checkedRadioButtonId


                val intent = Intent(this, Activity2::class.java)
                intent.putExtra("resposta1", r1)
                startActivity(intent)

        }
    }
}