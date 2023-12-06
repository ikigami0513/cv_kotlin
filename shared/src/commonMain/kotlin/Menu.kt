import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Menu(goToIndex: () -> Unit, goToStudies: () -> Unit, goToExp: () -> Unit) {
    MaterialTheme {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(
                        Color(86, 142, 147, 80)
                    )
            ) {
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {
                    Image(
                        painterResource("ethanr.jpg"),
                        contentDescription = "Photo d'identité",
                        modifier = Modifier
                            .border(
                                border = BorderStroke(
                                    width = 2.dp,
                                    brush = Brush.linearGradient(listOf(Color.Black, Color.Black))
                                ),
                                shape = CircleShape,
                            )
                            .clip(CircleShape)
                    )
                }
                Text(
                    text = "Rucar Ethan",
                    color = Color.Black,
                    style = TextStyle(fontSize = 50.sp),
                    modifier = Modifier
                        .weight(2f)
                        .align(Alignment.CenterVertically)
                )
                Row(
                    modifier = Modifier
                        .padding(5.dp)
                        .weight(7f)
                        .align(Alignment.CenterVertically)
                ) {
                    Button(
                        onClick = {
                            goToIndex.invoke()
                        },
                        modifier = Modifier
                            .padding(end = 10.dp)
                    ) {
                        Text("Accueil")
                    }
                    Button(
                        onClick = {
                            // Naviguer vers un autre écran
                            goToStudies.invoke()
                        },
                        modifier = Modifier
                            .padding(end = 10.dp)
                    ) {
                        Text("Études")
                    }
                    Button(
                        onClick = {
                            // Naviguer vers un autre écran
                            goToExp.invoke()
                        },
                        modifier = Modifier
                            .padding(end = 10.dp)
                    ) {
                        Text("Expériences Professionnelles")
                    }
                }
            }
        }
    }
}