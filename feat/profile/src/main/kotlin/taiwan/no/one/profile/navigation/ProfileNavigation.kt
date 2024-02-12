package taiwan.no.one.profile.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import taiwan.no.one.profile.component.ProfileRoute

private const val PROFILE_ROUTE = "profile_route"

fun NavController.navigateToProfile() = navigate(PROFILE_ROUTE)

fun NavGraphBuilder.profileScreen() {
    composable(route = PROFILE_ROUTE) {
        ProfileRoute()
    }
}
