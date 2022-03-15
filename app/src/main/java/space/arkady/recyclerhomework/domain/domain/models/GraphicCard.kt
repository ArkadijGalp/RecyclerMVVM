package space.arkady.recyclerhomework.domain.domain.models

import space.arkady.recyclerhomework.data.Brand

data class GraphicCard(
    val brand: Brand,
    val series: String,
    val number: Int,
    val postfix: String? = ""
)
