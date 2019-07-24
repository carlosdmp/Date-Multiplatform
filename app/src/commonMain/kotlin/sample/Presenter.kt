package sample

class Presenter(private val view: DateView) {

    fun start() {
        val state = DateState(
            text = DateUtilities.platformDate.getCurrentDate()
        )
        view.showState(state)
    }
}