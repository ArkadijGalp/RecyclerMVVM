package space.arkady.recyclerhomework.presentation.recycler.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import space.arkady.recyclerhomework.domain.domain.models.Brand
import space.arkady.recyclerhomework.domain.domain.models.User

class SharedViewModel() : ViewModel() {

    val user: LiveData<User> get() = _user
    private val _user = MutableLiveData<User>()

    fun setUser(user: User) {
        _user.value = user
    }


    val operationSystem: LiveData<Brand> get() = _operationSystem
    private val _operationSystem = MutableLiveData<Brand>()

    fun setOperationSystem(operationSystem: Brand) {
        _operationSystem.value = operationSystem
    }


    val graphicCard: LiveData<Brand> get() = _graphicCard
    private val _graphicCard = MutableLiveData<Brand>()

    fun setGraphicCard(graphicCard: Brand) {
        _graphicCard.value = graphicCard
    }


    val monitor: LiveData<Brand> get() = _monitor
    private val _monitor = MutableLiveData<Brand>()

    fun setMonitor(monitor: Brand) {
        _monitor.value = monitor
    }
}