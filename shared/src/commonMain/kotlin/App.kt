
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import org.jetbrains.compose.resources.ExperimentalResourceApi


sealed class Screen {
    object Welcome : Screen()
    object Studies : Screen()
    object Profesionnal : Screen()
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    val currentScreen = remember { mutableStateOf<Screen>(Screen.Welcome) }

    when (currentScreen.value) {
        is Screen.Welcome -> WelcomeScreen(menu = Menu(goToIndex = { currentScreen.value = Screen.Welcome}, goToStudies = { currentScreen.value = Screen.Studies }, goToExp = { currentScreen.value = Screen.Profesionnal}))
        is Screen.Studies -> StudiesScreen(menu = Menu(goToIndex = { currentScreen.value = Screen.Welcome}, goToStudies = { currentScreen.value = Screen.Studies }, goToExp = { currentScreen.value = Screen.Profesionnal}))
        is Screen.Profesionnal -> ProfesionnalScreen(menu = Menu(goToIndex = { currentScreen.value = Screen.Welcome}, goToStudies = { currentScreen.value = Screen.Studies }, goToExp = { currentScreen.value = Screen.Profesionnal}))
    }
}

expect fun getPlatformName(): String