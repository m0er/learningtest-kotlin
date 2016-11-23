package moer.me.weather.utils

import android.os.Build

/**
 * Created by Yun on 2016. 11. 23..
 */
inline fun supportsLollipop(code: () -> Unit) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        code.invoke()
    }
}