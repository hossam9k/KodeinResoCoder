package com.mvvm.job.data.db

class DatabaseFakeImpl : Database{
    override val quoteDao: QuoteDao = QuoteDaoFakeImpl()
}