package space.arkady.recyclerhomework.data

import space.arkady.recyclerhomework.domain.domain.GraphicCardRepository
import space.arkady.recyclerhomework.domain.domain.models.Brand
import space.arkady.recyclerhomework.domain.domain.models.GraphicCard

object GraphicCardRepositoryImplement : GraphicCardRepository {

    private val graphicCardList = listOf<GraphicCard>(
        GraphicCard(Brand.AMD, "XT", 6900 ),
        GraphicCard(Brand.NVIDIA, "RTX", 3090 ),
        GraphicCard(Brand.NVIDIA, "RTX", 3080 ),
        GraphicCard(Brand.NVIDIA, "LHR", 3080 ),
        GraphicCard(Brand.NVIDIA, "RTX", 3070, "Ti"),
        GraphicCard(Brand.NVIDIA, "RTX", 2080, "Ti"),
        GraphicCard(Brand.NVIDIA, "RTX", 2070 ),
        GraphicCard(Brand.NVIDIA, "GTX", 1080 ),
        GraphicCard(Brand.NVIDIA, "RTX", 2060 ),
        GraphicCard(Brand.NVIDIA, "GTX", 1660, "Ti")
    )

    override fun getGraphicCardList(): List<GraphicCard> {
        return graphicCardList
    }
}