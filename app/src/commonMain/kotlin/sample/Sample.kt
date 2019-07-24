package sample

object DateUtilities {
    const val dateFormat = "dd-MM-YYYY HH:mm"
}

expect object PlatformDate {
    fun getCurrentDate(): String
}
