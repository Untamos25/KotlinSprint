package lesson_22

class MainScreenViewModel {

    data class MainScreenState(private val data: String? = null, private val isLoading: Boolean = false)

    private val mainScreenState = MainScreenState()

    fun loadData(dataFromServer: String): MainScreenState {
        val newState = mainScreenState.copy(isLoading = true)
        println("Загружаются данные с сервера...")
        return newState.copy(data = dataFromServer, isLoading = false)
    }
}

fun main() {
    val dataFromServer = "Данные с сервера"
    val mainScreenState = MainScreenViewModel()

    val mainScreenStateWithData = mainScreenState.loadData(dataFromServer)
    println(mainScreenStateWithData)
}