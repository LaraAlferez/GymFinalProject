package gymfinalproject.stn991540084.larakirtanluigi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.exercises.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ourList = generateDummyList(9)

        recycleView.adapter = MyRecycleView(ourList)
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int): List<ListItem> {
        val list = ArrayList<ListItem>()
        for (i in 0 until size) {
            val drawable = when (i % 2) {
                0 -> R.drawable.swim
                1 -> R.drawable.weights
                else -> R.drawable.ic_launcher_foreground
            }
            val text1 = when (i % 2) {
                0 -> "Swimming"
                1 -> "Weights"

                else -> "none"
            }
            val item = ListItem(drawable, text1)

            list += item

        }
        return list
    }
}