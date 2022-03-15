package space.arkady.recyclerhomework.domain.domain

import space.arkady.recyclerhomework.domain.domain.models.GraphicCardItem

interface GraphicCardInteractor {
    fun getGraphicCards(): List<GraphicCardItem>
}