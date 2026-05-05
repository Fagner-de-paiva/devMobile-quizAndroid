package com.example.franciscofagnerac

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.net.Uri
import android.widget.Button
import android.content.Intent


class Activity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val r1 = intent.getIntExtra("resposta1", -1)
        val r2 = intent.getIntExtra("resposta2", -1)
        val r3 = intent.getIntExtra("resposta3", -1)

        var batman = 0
        var spider = 0
        var cap = 0

        if (r1 == R.id.opcao1) batman++
        if (r1 == R.id.opcao2) spider++
        if (r1 == R.id.opcao3) cap++

        if (r2 == R.id.opcao1) batman++
        if (r2 == R.id.opcao2) spider++
        if (r2 == R.id.opcao3) cap++

        if (r3 == R.id.opcao1) batman++
        if (r3 == R.id.opcao2) spider++
        if (r3 == R.id.opcao3) cap++

        val resultado = when {
            batman > spider && batman > cap -> "Batman"
            spider > cap -> "Homem-Aranha"
            else -> "Capitão América"
        }


        val txt = findViewById<TextView>(R.id.txtResultado)
        txt.text = "Seu herói é: $resultado"

        findViewById<Button>(R.id.btn_browser).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://google.com"))
            startActivity(intent)
        }
    }
}