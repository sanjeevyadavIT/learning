package com.betatech.navigation

import android.app.Notification.Action
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.betatech.navigation.ui.theme.AndroidBasicsWithComposeTheme

enum class ShoppingRoutes {
    ProductList,
    ProductDetail,
    Cart
}

@Composable
fun ShoppingScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val context = LocalContext.current

    AndroidBasicsWithComposeTheme {
        Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
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