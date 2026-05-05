package com.example.franciscofagnerac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val r1 = intent.getIntExtra("resposta1", -1)

        val group = findViewById<RadioGroup>(R.id.radioGroup2)
        val btn = findViewById<Button>(R.id.btnProxima2)

        btn.setOnClickListener {
            val r2 = group.checkedRadioButtonId


                val intent = Intent(this, Activity3::class.java)
                intent.putExtra("resposta1", r1)
                intent.putExtra("resposta2", r2)
                startActivity(intent)

        }
    }
}