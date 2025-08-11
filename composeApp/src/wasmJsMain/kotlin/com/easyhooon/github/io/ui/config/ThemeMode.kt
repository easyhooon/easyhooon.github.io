package com.easyhooon.github.io.ui.config

import androidx.compose.runtime.compositionLocalOf
import easyhooongithubio.composeapp.generated.resources.Res
import easyhooongithubio.composeapp.generated.resources.ic_dark_mode
import easyhooongithubio.composeapp.generated.resources.ic_light_mode
import org.jetbrains.compose.resources.DrawableResource

enum class ThemeMode(
    val iconRes: DrawableResource,
) {
    Light(Res.drawable.ic_light_mode),
    Dark(Res.drawable.ic_dark_mode),
    ;

    fun toggleTheme(): ThemeMode =
        when (this) {
            Light -> Dark
            Dark -> Light
        }
}

val LocalThemeMode = compositionLocalOf { ThemeMode.Light }
