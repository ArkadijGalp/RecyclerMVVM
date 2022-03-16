package space.arkady.recyclerhomework.domain.domain

interface CommonInteractor<T> {
fun getItem(): List<T>
}