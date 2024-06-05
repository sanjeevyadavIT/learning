package com.betatech.superhero.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.betatech.superhero.model.Hero
import com.betatech.superhero.model.HeroesRepository
import com.betatech.superhero.ui.theme.SuperheroesTheme


@Composable
fun SuperHeroItem(item: Hero, modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(2.dp),
        modifier = modifier,
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = stringResource(id = item.nameRes), style = MaterialTheme.typography.displaySmall)
                Text(text = stringResource(id = item.descriptionRes), style = MaterialTheme.typography.bodyLarge)
            }
            Box(modifier = Modifier
                .height(72.dp)
                .padding(start = 16.dp)) {
                Image(painter = painterResource(id = item.imageRes), contentDescription = null)
            }
        }
    }
}

@Preview
@Composable
fun SuperHeroItemPreview(){
    SuperheroesTheme {
        SuperHeroItem(HeroesRepository.heroes[0])
    }
}