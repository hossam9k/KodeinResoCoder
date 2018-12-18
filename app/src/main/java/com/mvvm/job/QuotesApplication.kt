package com.mvvm.job

import android.app.Application
import com.mvvm.job.data.db.Database
import com.mvvm.job.data.db.DatabaseFakeImpl
import com.mvvm.job.data.db.QuoteDao
import com.mvvm.job.data.db.QuoteDaoFakeImpl
import com.mvvm.job.data.repository.QuoteRepository
import com.mvvm.job.data.repository.QuoteRepositoryImpl
import com.mvvm.job.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuotesApplication : Application(), KodeinAware {

    override val kodein: Kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { QuoteDaoFakeImpl() }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
        //bind<QuotesViewModelFactory>() with provider { QuotesViewModelFactory(instance()) }
        // if you are binding to the same class QuotesViewModelFactory use this simple
        bind() from provider { QuotesViewModelFactory(instance()) }
    }


}






















