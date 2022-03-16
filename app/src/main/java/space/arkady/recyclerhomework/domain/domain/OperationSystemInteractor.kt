package space.arkady.recyclerhomework.domain.domain

import space.arkady.recyclerhomework.domain.domain.models.CommonItem
import space.arkady.recyclerhomework.domain.domain.models.OperationSystem

class OperationSystemInteractor(private val repository: OperationSystemRepository): CommonInteractor<CommonItem> {
    override fun getItem(): List<CommonItem> {
        return repository.getOperationSystemList().map { item -> CommonItem("${item.name} ${item.version}") }
    }
}