package moer.me.kfad.weather.mapper

import moer.me.kfad.weather.data.Forecast
import moer.me.kfad.weather.data.ForecastResult
import moer.me.kfad.weather.model.ForecastList
import java.text.DateFormat
import java.util.*
import moer.me.kfad.weather.model.Forecast as ModelForecast

/**
 * Created by Yun on 2016. 11. 22..
 */
class ForecastDataMapper {

    fun convertFromDataModel(forecast: ForecastResult) = ForecastList(forecast.city.name, forecast.city.country, convertForecastListToDomain(forecast.list))

    private fun convertForecastListToDomain(list: List<Forecast>) = list.map { convertForecastItemToDomain(it) }

    private fun convertForecastItemToDomain(forecast: Forecast) = ModelForecast(convertDate(forecast.dt), forecast.weather.first().description , forecast.temp.max.toInt(), forecast.temp.min.toInt(), generateIconUrl(forecast.weather.first().icon))

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }

    private fun generateIconUrl(iconCode: String) = "http://openweathermap.org/img/w/$iconCode.png"
}