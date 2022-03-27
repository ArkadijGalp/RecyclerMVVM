package space.arkady.recyclerhomework.data

import space.arkady.recyclerhomework.domain.domain.OperationSystemRepository
import space.arkady.recyclerhomework.domain.domain.models.Brand
import space.arkady.recyclerhomework.domain.domain.models.OperationSystem

object OperationSystemRepositoryImplement: OperationSystemRepository {

    private val operationSystem = listOf<OperationSystem>(
        OperationSystem(Brand.WINDOWS, 7.0),
        OperationSystem(Brand.WINDOWS, 10.0),
        OperationSystem(Brand.WINDOWS, 12.0),
        OperationSystem(Brand.MACOS, 10.15),
        OperationSystem(Brand.MACOS, 11.0)
   )

    override fun getOperationSystemList(): List<OperationSystem> {
        return operationSystem
    }
}