package space.arkady.recyclerhomework.presentation.recycler

import space.arkady.recyclerhomework.domain.domain.models.GraphicCardItem

interface GraphicCardClickListener {
    fun graphicCardListener(item: GraphicCardItem)
}