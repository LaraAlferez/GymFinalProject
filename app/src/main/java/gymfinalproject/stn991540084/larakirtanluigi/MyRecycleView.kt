package gymfinalproject.stn991540084.larakirtanluigi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_exercise.view.*

class MyRecycleView (private val sampleList: List <ListItem>): RecyclerView.Adapter <MyRecycleView.MyViewHolder>() {


    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageView: ImageView =itemView.image_view
        val title: TextView =itemView.textView1


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_exercise,
            parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = sampleList [position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.title.text= currentItem.text1
    }

    override fun getItemCount() = sampleList.size
}
