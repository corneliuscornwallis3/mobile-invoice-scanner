package com.example.invoiceocr

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val vendor = intent.getStringExtra("vendor") ?: "Unknown"
        val total = intent.getStringExtra("total") ?: "Unknown"
        val date = intent.getStringExtra("date") ?: "Unknown"

        findViewById<TextView>(R.id.vendorText).text = "Vendor: $vendor"
        findViewById<TextView>(R.id.totalText).text = "Total: $total"
        findViewById<TextView>(R.id.dateText).text = "Date: $date"
    }
}
