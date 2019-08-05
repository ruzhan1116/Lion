package com.ruzhan.lion.ui

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.lion.font.FontHelper
import com.ruzhan.lion.util.ResUtils


class MainApplication : Application() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        ResUtils.init(this)
        FontHelper.init(this)
    }
}
