package com.example.invoiceocr

object InvoiceParser {
    fun parse(text: String): Invoice {
        val totalRegex = Regex("\\$\\s?\\d+[.,]?\\d*")
        val dateRegex = Regex("\\d{1,2}/\\d{1,2}/\\d{2,4}")

        val total = totalRegex.find(text)?.value ?: "Not found"
        val date = dateRegex.find(text)?.value ?: "Not found"
        val vendor = text.lines().firstOrNull() ?: "Unknown Vendor"

        return Invoice(vendor, total, date)
    }
}
