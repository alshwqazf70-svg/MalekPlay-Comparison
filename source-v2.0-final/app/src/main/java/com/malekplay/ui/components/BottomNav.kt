package com.malekplay.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Tv
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.malekplay.R
import com.malekplay.core.ui.theme.MalekPlayColors

/**
 * Bottom navigation bar for MalekPlay with glassmorphism effect.
 */

data class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val labelRes: Int
)

val bottomNavItems = listOf(
    BottomNavItem("home", Icons.Default.Home, R.string.nav_home),
    BottomNavItem("movies", Icons.Default.Movie, R.string.nav_movies),
    BottomNavItem("series", Icons.Default.Tv, R.string.nav_series),
    BottomNavItem("music", Icons.Default.MusicNote, R.string.nav_music),
    BottomNavItem("library", Icons.Default.Folder, R.string.nav_library),
    BottomNavItem("favorites", Icons.Default.Favorite, R.string.nav_favorites)
)

@Composable
fun MalekPlayBottomNav(
    currentRoute: String?,
    onNavigate: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .shadow(
                    elevation = 16.dp,
                    shape = RoundedCornerShape(28.dp),
                    ambientColor = MalekPlayColors.NeonPurple.copy(alpha = 0.3f),
                    spotColor = MalekPlayColors.NeonPurple.copy(alpha = 0.3f)
                ),
            shape = RoundedCornerShape(28.dp),
            color = MalekPlayColors.SurfaceGlass.copy(alpha = 0.92f)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                bottomNavItems.forEach { item ->
                    val selected = currentRoute == item.route
                    val iconColor by animateColorAsState(
                        targetValue = if (selected) MalekPlayColors.NeonPurple else MalekPlayColors.TextMuted,
                        animationSpec = tween(200),
                        label = "iconColor"
                    )

                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(16.dp))
                            .background(
                                if (selected) MalekPlayColors.NeonPurple.copy(alpha = 0.15f)
                                else Color.Transparent
                            )
                            .clickable { onNavigate(item.route) }
                            .padding(horizontal = 14.dp, vertical = 8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = stringResource(item.labelRes),
                                tint = iconColor,
                                modifier = Modifier.size(24.dp)
                            )
                            if (selected) {
                                Spacer(modifier = Modifier.height(4.dp))
                                Box(
                                    modifier = Modifier
                                        .size(4.dp)
                                        .clip(RoundedCornerShape(2.dp))
                                        .background(MalekPlayColors.NeonPurple)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
