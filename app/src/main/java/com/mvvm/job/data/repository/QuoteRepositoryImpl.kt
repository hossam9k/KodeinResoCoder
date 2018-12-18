package com.mvvm.job.data.repository

import com.mvvm.job.data.db.QuoteDao
import com.mvvm.job.data.model.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao)
    : QuoteRepository{

    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes() = quoteDao.getQuotes()
}