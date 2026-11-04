package com.malekplay.core.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Arabic-first typography optimized for MalekPlay.
 * Uses system sans-serif font with Cairo-like styling.
 * Line heights are relaxed for Arabic glyphs.
 */

val CairoFontFamily = FontFamily.SansSerif

val MalekPlayTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        lineHeight = 52.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        lineHeight = 40.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 33.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 29.sp
    ),
    titleLarge = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 26.sp
    ),
    titleMedium = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp,
        lineHeight = 23.sp
    ),
    titleSmall = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
        lineHeight = 20.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 23.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp,
        lineHeight = 21.sp
    ),
    bodySmall = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp,
        lineHeight = 18.sp
    ),
    labelLarge = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
        lineHeight = 20.sp
    ),
    labelMedium = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 17.sp
    ),
    labelSmall = TextStyle(
        fontFamily = CairoFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 9.sp,
        lineHeight = 14.sp
    )
)
