package com.example.mylayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun Tugas(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        // Bagian 1: gambar cyan
        Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
            Image(
                painter = painterResource(id = R.drawable.tugas_cyan),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
        // Bagian 2: gambar kuning
        Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
            Image(
                painter = painterResource(id = R.drawable.tugas_kuning),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
        // Bagian 3: gambar putih
        Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
            Image(
                painter = painterResource(id = R.drawable.tugas_putih),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
    }
}