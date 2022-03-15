package space.arkady.recyclerhomework.domain.domain.models

data class GraphicCard(
    val brand: Brand,
    val series: String,
    val number: Int,
    val postfix: String? = ""
)
