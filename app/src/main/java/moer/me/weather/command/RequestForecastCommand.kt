package moer.me.weather.command

import moer.me.weather.Command
import moer.me.weather.mapper.ForecastdataMapper
import moer.me.weather.model.ForecastList
import moer.me.weather.network.ForecastRequest

/**
 * Created by Yun on 2016. 11. 22..
 */
class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {

    override fun execute(): ForecastList {
        return ForecastdataMapper().convertFromDataModel(ForecastRequest(zipCode).execute())
    }

}