package moer.me.weather.command

import moer.me.weather.mapper.ForecastDataMapper
import moer.me.weather.model.ForecastList
import moer.me.weather.network.ForecastRequest

/**
 * Created by Yun on 2016. 11. 22..
 */
class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {

    override fun execute(): ForecastList {
        return ForecastDataMapper().convertFromDataModel(ForecastRequest(zipCode).execute())
    }

}