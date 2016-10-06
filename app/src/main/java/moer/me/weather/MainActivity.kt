package moer.me.weather

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = "Hello, Kotlin!"

//        toast("Hello")
//        toast("Hello2", Toast.LENGTH_LONG)
//        toast(message = "Hello3", length = Toast.LENGTH_SHORT)
        niceToast("Hello, Kotlin!")
    }

    fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, length).show()
    }

    fun niceToast(message: String, tag: String = MainActivity::class.java.simpleName, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, "[${tag.toUpperCase()}] $message", length).show()
    }

}
