package com.mvvm.job.ui.quotes

import androidx.lifecycle.ViewModel
import com.mvvm.job.data.model.Quote
import com.mvvm.job.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel(){

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun getQuotes() = quoteRepository.getQuotes()
}