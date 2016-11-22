package moer.me.weather.mapper

import moer.me.weather.data.Forecast
import moer.me.weather.data.ForecastResult
import moer.me.weather.model.ForecastList
import java.text.DateFormat
import java.util.*
import moer.me.weather.model.Forecast as ModelForecast

/**
 * Created by Yun on 2016. 11. 22..
 */
class ForecastdataMapper {

    fun convertFromDataModel(forecast: ForecastResult): ForecastList {
        return ForecastList(forecast.city.name, forecast.city.country, convertForecastListToDomain(forecast.list))
    }

    private fun convertForecastListToDomain(list: List<Forecast>): List<ModelForecast> {
        return list.map {
            convertForecastItemToDomain(it)
        }
    }

    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast {
        return ModelForecast(convertDate(forecast.dt), forecast.weather[0].description, forecast.temp.max.toInt(), forecast.temp.min.toInt())
    }

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }
}