package sample

val dateUtilities = DateUtilities()

class DateUtilities {
    var platformDate = PlatformDate()

    val dateFormat = "dd-MM-YYYY HH:mm"

}

expect class PlatformDate() {
    fun getCurrentDate(): String
}
