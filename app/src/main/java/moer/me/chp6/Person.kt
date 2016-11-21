package moer.me.chp6

/**
 * Created by Yun on 2016. 10. 6..
 */
class Person {

    // Property
    var name: String = "name"
        get() = field.toUpperCase()
        set(value) {
            field = "Name: $value"
        }
}