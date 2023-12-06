
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi

data class Experience(val entreprise: String, val description: String, val city: String, val start_date: String, val end_date: String)

val Experiences: List<Experience> = listOf(
    Experience("MSI2", "Alternance où je participe au développement de Liberfit, un SAAS de gestion de salles de sport.", "Lille", "septembre 2023", "en cours"),
    Experience("Ikéa", "Job étudiant au restaurant Ikéa.", "Hénin-Beaumont", "octobre 2022", "en cours"),
    Experience("La fabrique d'univers", "Stage de deuxième année de BTS où j'ai développé un logiciel d'animation 3D sous Unity : Animaker.", "Tourcoing", "janvier 2022", "février 2022"),
    Experience("SARL Thomas Formont", "Stage de première année de BTS où j'ai développé un logiciel interne de gestion de planning sous Django", "Arras", "mai 2021", "juillet 2021")
)

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ProfesionnalScreen(menu: Unit) {
    MaterialTheme {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            menu
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 220.dp, start = 20.dp, end = 20.dp)
            ) {
                for (experience in Experiences) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                Color(86, 142, 147, 80)
                            )
                            .padding(15.dp)
                    ) {
                        Text(
                            text = "${experience.entreprise}",
                            color = Color.Black,
                            style = TextStyle(fontSize = 20.sp)
                        )
                        Text(
                            text = "${experience.description}",
                            color = Color.Black,
                            style = TextStyle(fontSize = 20.sp)
                        )
                        Text(
                            text = "${experience.city} (${experience.start_date} - ${experience.end_date})",
                            color = Color.Gray,
                            style = TextStyle(fontSize = 10.sp)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ){

                    }
                }
            }
        }
    }
}
