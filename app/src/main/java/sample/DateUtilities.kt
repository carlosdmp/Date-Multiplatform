package sample

import java.text.SimpleDateFormat
import java.util.*

actual class PlatformDate {
    actual fun getCurrentDate(): String {
        val date = Calendar.getInstance().getTime()
        val df = SimpleDateFormat(dateUtilities.dateFormat)
        return df.format(date)
    }
}