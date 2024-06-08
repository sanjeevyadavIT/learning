package com.betatech.superhero

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
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


private const val TAG = "SANJEEV"

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate()")
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

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy()")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.d(TAG, "onPostResume()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart()")
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