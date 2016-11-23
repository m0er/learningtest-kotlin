package moer.me.kfad.weather

import android.app.Application

/**
 * Created by Yun on 2016. 11. 23..
 */
class App : Application() {

    companion object {
        private var instance: Application? = null
        fun instance() = instance!!
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}