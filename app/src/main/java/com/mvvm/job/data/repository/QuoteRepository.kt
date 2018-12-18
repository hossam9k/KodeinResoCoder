package com.mvvm.job.data.repository

import androidx.lifecycle.LiveData
import com.mvvm.job.data.model.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}