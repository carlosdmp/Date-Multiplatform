package sample

import sample.DateUtilities.dateFormat
import java.text.SimpleDateFormat
import java.util.*

actual object PlatformDate {
    actual fun getCurrentDate(): String {
        val date = Calendar.getInstance().getTime()
        val df = SimpleDateFormat(dateFormat)
        return df.format(date)
    }
}