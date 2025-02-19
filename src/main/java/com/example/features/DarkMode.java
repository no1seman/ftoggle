package com.example.features;

import com.example.config.FeatureFlags;

public class DarkMode {
    public String getTheme() {
        if (FeatureFlags.DARK_MODE_ENABLED) {
            return "dark";
        }
        return "light";
    }

    public String getBackgroundColor() {
        if (FeatureFlags.DARK_MODE_ENABLED) {
            return "#000000";
        }
        return "#FFFFFF";
    }
}