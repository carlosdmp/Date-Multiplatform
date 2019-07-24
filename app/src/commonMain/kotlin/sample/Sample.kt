package sample

object DateUtilities {
    var platformDate = PlatformDate()

    const val dateFormat = "dd-MM-YYYY HH:mm"

}

expect class PlatformDate() {
    fun getCurrentDate(): String
}
