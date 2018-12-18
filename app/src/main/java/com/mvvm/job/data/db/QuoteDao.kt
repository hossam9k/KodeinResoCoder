package com.mvvm.job.data.db

import androidx.lifecycle.LiveData
import com.mvvm.job.data.model.Quote

interface QuoteDao {

    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}