package space.arkady.recyclerhomework.domain

import space.arkady.recyclerhomework.domain.domain.models.GraphicCard
import space.arkady.recyclerhomework.domain.domain.models.CommonItem

fun List<GraphicCard>.toGraphicCardList(): List<CommonItem> {
    return this.map { item ->
        CommonItem(
            "${item.brand}${item.number}${item.postfix}${item.series}"
        )
    }
}