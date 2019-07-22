package sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*


actual class Sample {
    actual fun checkMe() = 44
}

actual object Platform {
    actual val name: String = "Android"
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Sample().checkMe()
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.main_text).text = CurrentDate().getCurrentDate()
    }
}

actual class CurrentDate actual constructor() {
    actual fun getCurrentDate(): String {
        val c = Calendar.getInstance().getTime()
        val df = SimpleDateFormat("dd-MMM-yyyy")
        return df.format(c)
    }
}