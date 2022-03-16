package space.arkady.recyclerhomework.presentation.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.graphiccard_item_view.view.*
import space.arkady.recyclerhomework.R
import space.arkady.recyclerhomework.domain.domain.models.CommonItem

class GraphicCardViewHolder(
    itemView: View,
    private val getCardClickItem: GraphicCardClickListener
) :
    RecyclerView.ViewHolder(itemView) {

    companion object {
        fun newInstance(parent: ViewGroup, getCardClickItem: GraphicCardClickListener) =
            GraphicCardViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.graphiccard_item_view, parent, false
                ), getCardClickItem
            )
    }


    fun bindItem(grCard: CommonItem) {
        with(grCard) {
            itemView.nameProduct.text = grCard.item
            if (grCard.item.contains("NVIDIA")) {
                itemView.brandLogo.setImageResource(R.drawable.nvidia_logo)
            } else if (grCard.item.contains("AMD")) {
                itemView.brandLogo.setImageResource(R.drawable.amd_logo)
            }
        }
        itemView.root.setOnClickListener {
            getCardClickItem.graphicCardListener(grCard)
        }
    }
}