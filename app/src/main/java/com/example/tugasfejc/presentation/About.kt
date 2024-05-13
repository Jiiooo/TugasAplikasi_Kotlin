package com.example.tugasfejc.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasfejc.R
import com.example.tugasfejc.model.anime
import com.example.tugasfejc.ui.theme.TugasFEJCTheme

@Composable
fun About(
    modifier: Modifier = Modifier

) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxWidth()

    ) {
        Image(
            painter = painterResource(R.drawable.rio2),
            contentDescription = "Rio"
        )
        Text(
            text = "Januar Rio Grace Sitorus\nriositorus27@gmail.com\nPoliteknik Negeri Batam\nTeknik Informatika" ,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(10000.dp),
            maxLines = 6
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DaftarAnimePreview() {
    TugasFEJCTheme {
        About()
    }
}