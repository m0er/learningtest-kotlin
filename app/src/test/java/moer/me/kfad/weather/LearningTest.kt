package moer.me.kfad.weather

import moer.me.kfad.weather.data.DummyForecast
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
        val f1 = DummyForecast(Date(), 27.5f, "Shiny day")
        val f2 = f1.copy(temperature = 30f)

        assertTrue(f1.date.equals(f2.date))
        assertTrue(f1.details.equals(f2.details))
        assertTrue(f2.temperature == 30f)
    }

    @Test fun multiDeclaration() {
        val f1 = DummyForecast(Date(), 27.5f, "Shiny day")
        val (date, temperature, details) = f1

        val comp1 = f1.component1()
        val comp2 = f1.component2()
        val comp3 = f1.component3()

        assertTrue(date.equals(comp1))
        assertTrue(temperature.equals(comp2))
        assertTrue(details.equals(comp3))
    }

    @Test fun mapAndMultiDeclaration() {
        val map = mapOf(Pair("A", 1), Pair("B", 2), Pair("C", 3))
        for ((key, value) in map) {
            System.out.println("key:$key, value:$value")
        }
    }
}