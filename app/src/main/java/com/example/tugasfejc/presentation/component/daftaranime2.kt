package com.example.tugasfejc.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasfejc.R
import com.example.tugasfejc.model.anime
import com.example.tugasfejc.ui.theme.TugasFEJCTheme

@Composable
fun daftaranime2(
    anime2: anime,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = anime2.photo),
            contentDescription = anime2.nama,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = anime2.nama, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = anime2.lahir, color = MaterialTheme.colorScheme.primary)

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DaftarAnime2Preview() {
    TugasFEJCTheme {
        daftaranime2(
            anime2 = anime(1, "Kazuto Kirigaya", "7 0ktober 2008", "Laki - laki", R.drawable.kirito),
            onItemClicked = { animeId ->
                println("anime Id : ${animeId}")
            }
            )
    }
}