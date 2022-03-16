package space.arkady.recyclerhomework.presentation.recycler

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import space.arkady.recyclerhomework.domain.domain.models.CommonItem

class GraphicCardAdapter(private val getCardClickItem: GraphicCardClickListener) :
    RecyclerView.Adapter<GraphicCardViewHolder>() {

    private var items: List<CommonItem> = emptyList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GraphicCardViewHolder {
        return GraphicCardViewHolder.newInstance(parent, getCardClickItem)
    }

    override fun onBindViewHolder(holder: GraphicCardViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount() = items.size

    @SuppressLint("NotifyDataSetChanged")
    fun submitCardList(data: List<CommonItem>) {
        items = data

        notifyDataSetChanged()
    }
}





