package com.malekplay.core.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Glassmorphism effect for MalekPlay.
 * Provides frosted glass surfaces with subtle borders and glows.
 */

@Composable
fun Modifier.glassSurface(
    shape: Shape = RoundedCornerShape(24.dp),
    backgroundColor: Color = MalekPlayColors.SurfaceGlass,
    borderColor: Color = MalekPlayColors.Border.copy(alpha = 0.3f),
    borderWidth: Dp = 1.dp,
    glowColor: Color = MalekPlayColors.NeonGlow
): Modifier = this
    .clip(shape)
    .background(backgroundColor)
    .border(borderWidth, borderColor, shape)
    .drawBehind {
        // Subtle top glow effect
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(glowColor.copy(alpha = 0.1f), Color.Transparent),
                center = Offset(size.width / 2, 0f),
                radius = size.width * 0.6f
            ),
            radius = size.width * 0.6f,
            center = Offset(size.width / 2, 0f)
        )
    }

@Composable
fun GlassCard(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(24.dp),
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier = modifier.glassSurface(shape),
        content = content
    )
}

@Composable
fun GlassPanel(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(30.dp),
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier = modifier
            .clip(shape)
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        MalekPlayColors.SurfaceGlass,
                        MalekPlayColors.Surface.copy(alpha = 0.95f)
                    )
                )
            )
            .border(1.dp, MalekPlayColors.Border.copy(alpha = 0.2f), shape),
        content = content
    )
}
