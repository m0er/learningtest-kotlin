package moer.me.weather.model

/**
 * Created by Yun on 2016. 11. 22..
 */
data class ForecastList(val city: String, val country: String, val dailyForecast:List<Forecast>)