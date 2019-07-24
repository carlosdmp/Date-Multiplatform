package sample

class Presenter(private val view: DateView) {

    fun start() {
        val state = DateState(
            text = dateUtilities.platformDate.getCurrentDate()
        )
        view.showState(state)
    }
}