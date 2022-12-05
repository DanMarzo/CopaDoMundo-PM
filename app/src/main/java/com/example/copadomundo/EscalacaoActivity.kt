package com.example.copadomundo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.copadomundo.Data.DataSource
import com.example.copadomundo.adapter.ItemAdapter

class EscalacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escalacao)


        val myDataSet = DataSource().loadCopa()
        val recyclerView = findViewById<RecyclerView>(R.id.recicler_view)
        recyclerView.adapter = ItemAdapter(this, myDataSet)

        recyclerView.setHasFixedSize(true)



    }

}