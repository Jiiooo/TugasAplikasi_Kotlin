package com.example.tugasfejc.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasfejc.model.anime
import com.example.tugasfejc.ui.theme.TugasFEJCTheme
import com.example.tugasfejc.R

@Composable
fun daftaranime1(
    anime1: anime,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(anime1.id)
        }
    ) {
        Image(
            painter = painterResource(id = anime1.photo),
            contentDescription = anime1.nama, modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Text(
            text = anime1.nama,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
        Text(
            text = anime1.lahir,
            color = MaterialTheme.colorScheme.primary,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun DaftarAnime1Preview() {
    TugasFEJCTheme {
        daftaranime1(
            anime1 = anime(1, "Kazuto Kirigaya", "7 0ktober 2008", "Laki - laki", R.drawable.kirito),
            onItemClicked = { animeId ->
                println("Anime Id : ${animeId}")
            }
        )
    }
}