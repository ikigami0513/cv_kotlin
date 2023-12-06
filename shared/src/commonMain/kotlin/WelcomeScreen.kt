
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun WelcomeScreen(menu: Unit) {
    MaterialTheme {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            menu
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 200.dp, start = 20.dp, end = 20.dp)
            ){
                Text(
                    text = "Bienvenue sur mon CV.",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .padding(top=20.dp)
                )
                Text(
                    text = "Enchanté(e), je suis Ethan Rucar, un passionné du développement web et de la création de jeux. Mon parcours professionnel m'a permis d'explorer les vastes horizons du code, de l'esthétique et de la conception interactive.",
                    color = Color.Black,
                    style = TextStyle(fontSize = 20.sp)
                )

                Text(
                    text = "Développeur Web",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .padding(top=20.dp)
                )
                Text(
                    text = "Fort d'une expertise solide dans le développement web, je me suis plongé dans l'univers des langages tels que HTML, CSS, JavaScript, et bien d'autres. Mon objectif est de créer des expériences en ligne exceptionnelles, alliant fonctionnalité et esthétique.",
                    color = Color.Black,
                    style = TextStyle(fontSize = 20.sp)
                )

                Text(
                    text = "Créateur de jeux",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .padding(top=20.dp)
                )
                Text(
                    text = "En tant que game developer, j'ai exploré les mondes infinis de la création ludique. Des jeux simples et addictifs aux univers complexes en 3D, chaque ligne de code que j'écris vise à captiver et divertir les joueurs.",
                    color = Color.Black,
                    style = TextStyle(fontSize = 20.sp)
                )
            }
        }
    }
}
