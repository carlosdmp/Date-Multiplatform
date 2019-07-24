package sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(), DateView {

    private val presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.start()
    }

    override fun showState(state: DateState) {
        findViewById<TextView>(R.id.main_text).text = state.text
    }
}
