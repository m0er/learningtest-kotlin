package moer.me.weather.network

import android.util.Log
import java.net.URL

/**
 * Created by Yun on 2016. 11. 21..
 */
class Request(val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}