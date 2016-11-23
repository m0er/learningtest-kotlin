package moer.me.kfad.weather

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import moer.me.kfad.weather.command.RequestForecastCommand
import moer.me.kfad.weather.utils.supportsLollipop
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doAsync {
            val result = RequestForecastCommand("94043").execute()
            uiThread {
                forecastList.adapter = ForecastListAdapter(result) { toast(it.date) }
            }
        }

        forecastList.layoutManager = LinearLayoutManager(this)

        supportsLollipop {
            toast("only executed if the version is Lollipop or newer")
        }
    }
}
