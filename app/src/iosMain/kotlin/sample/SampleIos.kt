package sample



actual class Sample {
    actual fun checkMe() = 7
}

actual object Platform {
    actual val name: String = "iOS"
}

actual class CurrentDate actual constructor() {
    private lateinit var dateProtocol: DateProtocol

    fun setProtocol(protocol: DateProtocol){
        dateProtocol = protocol
    }

    actual fun getCurrentDate(): String {
        return dateProtocol.getIosDate()
    }
}