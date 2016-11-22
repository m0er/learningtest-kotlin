package moer.me.weather

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import moer.me.weather.model.ForecastList

/**
 * Created by Yun on 2016. 10. 6..
 */
class ForecastListAdapter(val weekForecast: ForecastList) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder? {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        with(weekForecast.dailyForecast[position], {
//            holder.textView.text = "$date - $description - $high/$low"
//        })
        with(weekForecast.dailyForecast[position]) {
            holder.textView.text = "$date - $description - $high/$low"
        }
    }

    override fun getItemCount(): Int = weekForecast.dailyForecast.size

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}