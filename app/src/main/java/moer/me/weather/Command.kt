package moer.me.weather

/**
 * Created by Yun on 2016. 11. 22..
 */
interface Command<T> {
    fun execute(): T
}