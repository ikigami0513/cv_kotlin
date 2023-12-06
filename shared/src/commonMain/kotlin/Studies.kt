
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

data class Study(val school: String, val diplome: String, val city: String, val start_year: String, val end_year: String)

val Studies: List<Study> = listOf(
    Study("Ynov Lille Campus", "Master en développement informatique", "Lille", start_year = "2023", end_year = "2026"),
    Study("Ensemble Baudimont Pôle Sup'", "BTS Service Informatique Organisé Solution Logiciel Application Métier", "Arras", start_year = "2021", end_year = "2023"),
    Study("Lycée Louis Paster", "Baccaulauréat Général Spécialité Mathématiques Physique-Chimie", "Hénin-Beaumont", start_year = "2018", end_year = "2021")
)

@OptIn(ExperimentalResourceApi::class)
@Composable
fun StudiesScreen(menu: Unit) {
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
                for (study in Studies) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                Color(86, 142, 147, 80)
                            )
                            .padding(15.dp)
                    ) {
                        Text(
                            text = "${study.school}",
                            color = Color.Black,
                            style = TextStyle(fontSize = 20.sp)
                        )
                        Text(
                            text = "${study.diplome}",
                            color = Color.Black,
                            style = TextStyle(fontSize = 20.sp)
                        )
                        Text(
                            text = "${study.city} (${study.start_year} - ${study.end_year})",
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
