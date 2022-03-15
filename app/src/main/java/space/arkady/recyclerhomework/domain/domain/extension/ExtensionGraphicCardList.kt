package space.arkady.recyclerhomework.domain

import space.arkady.recyclerhomework.domain.domain.models.GraphicCard
import space.arkady.recyclerhomework.domain.domain.models.GraphicCardItem

fun List<GraphicCard>.toGraphicCardList(): List<GraphicCardItem> {
    return this.map { item ->
        GraphicCardItem(
            "${item.brand}${item.number}${item.postfix}${item.series}"
        )
    }
}