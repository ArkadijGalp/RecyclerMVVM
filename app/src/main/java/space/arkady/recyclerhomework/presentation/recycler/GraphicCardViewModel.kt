package space.arkady.recyclerhomework.presentation.recycler

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import space.arkady.recyclerhomework.data.GraphicCardRepositoryImplement
import space.arkady.recyclerhomework.domain.domain.GraphicCardInteractor
import space.arkady.recyclerhomework.domain.domain.GraphicCardInteractorImplement
import space.arkady.recyclerhomework.domain.domain.GraphicCardRepository
import space.arkady.recyclerhomework.domain.domain.models.GraphicCardItem

class GraphicCardViewModel : ViewModel() {

    val graphicLiveData: LiveData<List<GraphicCardItem>> get() = _graphicLiveData
    private val _graphicLiveData = MutableLiveData<List<GraphicCardItem>>()
    private val repository: GraphicCardRepository = GraphicCardRepositoryImplement
    private val interactor: GraphicCardInteractor = GraphicCardInteractorImplement(repository)

    init {
        graphicCardLoad()
    }

    private fun graphicCardLoad() {
        _graphicLiveData.value = interactor.getGraphicCards()
    }
}