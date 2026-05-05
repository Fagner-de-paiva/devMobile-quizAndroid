package com.example.franciscofagnerac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val r1 = intent.getIntExtra("resposta1", -1)
        val r2 = intent.getIntExtra("resposta2", -1)

        val group = findViewById<RadioGroup>(R.id.radioGroup3)
        val btn = findViewById<Button>(R.id.btnResultado)

        btn.setOnClickListener {
            val r3 = group.checkedRadioButtonId


                val intent = Intent(this, Activity4::class.java)
                intent.putExtra("resposta1", r1)
                intent.putExtra("resposta2", r2)
                intent.putExtra("resposta3", r3)
                startActivity(intent)
            }
        }
    }
