package com.rishav.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rishav.affirmation.adapter.ItemAdapter
import com.rishav.affirmation.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSource = DataSource()
        val affirmationsList = dataSource.loadAffirmation()

        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = ItemAdapter(this, affirmationsList)
        recyclerView.setHasFixedSize(true)
    }
}