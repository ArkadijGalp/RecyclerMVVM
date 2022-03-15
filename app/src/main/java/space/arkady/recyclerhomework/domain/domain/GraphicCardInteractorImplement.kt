package space.arkady.recyclerhomework.domain.domain

import space.arkady.recyclerhomework.domain.domain.models.GraphicCardItem
import space.arkady.recyclerhomework.domain.toGraphicCardList

class GraphicCardInteractorImplement(private val repository: GraphicCardRepository) :
    GraphicCardInteractor {
    override fun getGraphicCards(): List<GraphicCardItem> {
        return repository.getGraphicCardList().toGraphicCardList()
    }
}