package moer.me.kfad.weather.command

import moer.me.kfad.weather.mapper.ForecastDataMapper
import moer.me.kfad.weather.model.ForecastList
import moer.me.kfad.weather.network.ForecastRequest

/**
 * Created by Yun on 2016. 11. 22..
 */
class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {

    override fun execute() = ForecastDataMapper().convertFromDataModel(ForecastRequest(zipCode).execute())

}