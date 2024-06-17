package com.betatech.navigation

import android.app.Notification.Action
import android.content.Context
import android.content.Intent
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.betatech.navigation.ui.theme.AndroidBasicsWithComposeTheme

enum class ShoppingRoutes(@StringRes val title: Int) {
    ProductList(title = R.string.product_list_screen),
    ProductDetail(title = R.string.product_detail_screen),
    Cart(title = R.string.cart_screen)
}

@Composable
fun ShoppingScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    // Get current back stack entry
    val backStackEntry by navController.currentBackStackEntryAsState()
    // Get the name of the current screen
    val currentScreen = ShoppingRoutes.valueOf(
        backStackEntry?.destination?.route ?: ShoppingRoutes.ProductList.name
    )


    AndroidBasicsWithComposeTheme {
        Scaffold(
            topBar = {
                ShoppingAppBar(
                    currentScreen = currentScreen,
                    canNavigateBack = navController.previousBackStackEntry != null,
                    navigateUp = {
                        navController.navigateUp()
                    }
                )
            },
            modifier = modifier.fillMaxSize()
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = ShoppingRoutes.ProductList.name,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable(ShoppingRoutes.ProductList.name) {
                    ProductListScreen({
                        navController.navigate(ShoppingRoutes.ProductDetail.name)
                    })
                }
                composable(ShoppingRoutes.ProductDetail.name) {
                    ProductDetailScreen({
                        navController.navigate(ShoppingRoutes.Cart.name)
                    })
                }
                composable(ShoppingRoutes.Cart.name) {
                    val context = LocalContext.current

                    CartScreen(
                        onCancelButtonClicked = {
                            cancelOrderAndNavigateToStart(navController)
                        },
                        onSendButtonClicked = {
                            shareOrder(context, "Subject headline", "This is a summary")
                        }
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShoppingAppBar(
    currentScreen: ShoppingRoutes,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Text(text = stringResource(currentScreen.title))
        },
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack, contentDescription = stringResource(
                            id = R.string.back
                        )
                    )
                }
            }
        }
    )
}

private fun cancelOrderAndNavigateToStart(
    navController: NavHostController
) {
    navController.popBackStack(ShoppingRoutes.ProductList.name, inclusive = false)
}

private fun shareOrder(
    context: Context,
    subject: String,
    summary: String
) {
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_SUBJECT, subject)
        putExtra(Intent.EXTRA_TEXT, summary)
    }
    context.startActivity(
        Intent.createChooser(
            intent,
            "Something-Something"
        )
    )
}


@Preview
@Composable
fun ShoppingScreenPreview() {
    AndroidBasicsWithComposeTheme {
        ShoppingScreen()
    }
}