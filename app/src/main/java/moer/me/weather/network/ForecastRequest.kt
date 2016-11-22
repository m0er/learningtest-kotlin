package moer.me.weather.network

import android.util.Log
import com.google.gson.Gson
import moer.me.weather.data.ForecastResult
import java.net.URL

/**
 * Created by Yun on 2016. 11. 22..
 */
class ForecastRequest(val zipCode: String) {

    companion object {
        private val APP_ID = "5771a54eddd396a8c503d280154d5abf"
        private val URL = "http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&APPID=$APP_ID&q="
    }

    fun execute(): ForecastResult {
        val forecastJsonStr = URL(COMPLETE_URL + zipCode).readText()
        Log.d(ForecastRequest::class.java.simpleName, forecastJsonStr)
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}