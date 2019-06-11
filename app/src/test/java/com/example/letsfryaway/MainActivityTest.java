package com.example.letsfryaway;

import android.widget.TextView;

        import org.junit.Before;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.robolectric.Robolectric;
        import org.robolectric.RobolectricTestRunner;

        import static junit.framework.TestCase.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    private MainActivity activity;

    @Before
    public void setup(){
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void validateTextViewContent(){
        TextView appNameTextView = activity.findViewById(R.id.homeTitle);
        assertEquals("Let's Fry Away.", appNameTextView.getText().toString());
    }
}
