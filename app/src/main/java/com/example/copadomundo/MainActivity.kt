package com.example.copadomundo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.butao_Selecao)
        button.setOnClickListener {
            ExibirEscalacao()
        }
    }
    private fun ExibirEscalacao(){
        val intent = Intent(this, EscalacaoActivity::class.java)
        startActivity(intent)
    }
}
