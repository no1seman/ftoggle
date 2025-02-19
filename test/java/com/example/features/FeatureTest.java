package test.java.com.example.features;

import com.example.config.FeatureFlags;
import org.junit.Test;
import static org.junit.Assert.*;

public class FeatureTest {

    @Test
    public void testDarkMode() {
        DarkMode darkMode = new DarkMode();
        if (FeatureFlags.DARK_MODE_ENABLED) {
            assertEquals("dark", darkMode.getTheme());
            assertEquals("#000000", darkMode.getBackgroundColor());
        } else {
            assertEquals("light", darkMode.getTheme());
            assertEquals("#FFFFFF", darkMode.getBackgroundColor());
        }
    }
}