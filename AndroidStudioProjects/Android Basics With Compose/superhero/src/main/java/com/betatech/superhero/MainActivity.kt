package com.betatech.superhero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.betatech.superhero.model.Hero
import com.betatech.superhero.model.HeroesRepository
import com.betatech.superhero.ui.components.SuperHeroItem
import com.betatech.superhero.ui.theme.SuperheroesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperheroesTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        HeroAppBar()
                    }
                ) { innerPadding ->
                    HeroList(
                        HeroesRepository.heroes,
                        modifier = Modifier
                            .fillMaxSize(),
                        contentPadding = innerPadding
                    )
                }
            }
        }
    }
}

@Composable
fun HeroList(data: List<Hero>, contentPadding: PaddingValues = PaddingValues(0.dp), modifier: Modifier = Modifier) {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(16.dp), modifier = modifier, contentPadding = contentPadding) {
        items(data) {
            SuperHeroItem(item = it, modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp ))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeroAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(title = {
        Text(text = stringResource(id = R.string.app_name), style = MaterialTheme.typography.displayLarge)
    })
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SuperheroesTheme {
        HeroList(HeroesRepository.heroes)
    }
}