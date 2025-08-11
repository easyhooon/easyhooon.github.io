package com.easyhooon.github.io.ui.config

import androidx.compose.ui.unit.Dp

enum class Device {
    MOBILE,
    TABLET,
    DESKTOP,
    UNKNOWN,
    ;

    companion object {
        fun fromWidth(width: Dp): Device =
            when {
                width.value <= 0 -> UNKNOWN
                width.value < MOBILE_MAX_WIDTH_DP -> MOBILE
                width.value < DESKTOP_MIN_WIDTH_DP -> TABLET
                else -> DESKTOP
            }

        private const val MOBILE_MAX_WIDTH_DP = 600
        private const val DESKTOP_MIN_WIDTH_DP = 840
    }
}
