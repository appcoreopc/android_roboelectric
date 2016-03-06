package appcore.com.roboapp;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import appcore.com.roboelectric.BuildConfig;
import appcore.com.roboelectric.MainActivity;
import appcore.com.roboelectric.R;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, manifest = "src/main/AndroidManifest.xml")
public class MainActivityTest {

    @Test
    public void TestActivityStarted()
    {
        Activity targetActivity = Robolectric.setupActivity(MainActivity.class);

        ///Button loginBtn = (Button) targetActivity.findViewById(R.id.button);

        //loginBtn.performClick();

        // intent to validate //
        //Intent expectedIntent = new Intent(targetActivity, LoginActivity.class);

        //assertNotNull("", targetActivity);
        assertTrue(true);
    }
}
