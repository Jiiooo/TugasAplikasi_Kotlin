package com.example.tugasfejc.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.tugasfejc.data.DummyData
import com.example.tugasfejc.model.anime

@Composable
fun DetailAnimeScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    animeId: Int?
) {
    val newAnimeList = DummyData.daftaranime.filter { anime ->
        anime.id == animeId
    }
    Column(
        modifier = modifier
    ) {
        DetailAnimeContent(newAnimeList = newAnimeList)
    }
}

@Composable
private fun DetailAnimeContent(
    newAnimeList: List<anime>,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(16.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = newAnimeList[0].photo)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 500.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Poster Movie"
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = newAnimeList[0].nama,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "(${newAnimeList[0].lahir})",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "(${newAnimeList[0].jeniskelamin})",
                style = MaterialTheme.typography.titleSmall,
            )


        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailAnimeContentPreview() {
    DetailAnimeContent(newAnimeList = DummyData.daftaranime)
}