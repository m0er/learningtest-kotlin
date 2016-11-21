package moer.me.weather

import moer.me.weather.data.Forecast
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.util.*

/**
 * Created by Yun on 2016. 11. 21..
 */
class LearningTest {

    @Test fun unitTestingWorks() {
        assertTrue(true)
    }

    @Test fun copying() {
        val f1 = Forecast(Date(), 27.5f, "Shiny day")
        val f2 = f1.copy(temperature = 30f)

        assertTrue(f1.date.equals(f2.date))
        assertTrue(f1.details.equals(f2.details))
        assertTrue(f2.temperature == 30f)
    }

    @Test fun multiDeclaration() {
        val f1 = Forecast(Date(), 27.5f, "Shiny day")
        val (date, temperature, details) = f1

        assertNotNull(date)
        assertTrue(temperature.equals(27.5f))
        assertTrue(details.equals("Shiny day"))
    }

    @Test fun mapAndMultiDeclaration() {
        val map = mapOf(Pair("A", 1), Pair("B", 2), Pair("C", 3))
        for ((key, value) in map) {
            System.out.println("key:$key, value:$value")
        }
    }
}