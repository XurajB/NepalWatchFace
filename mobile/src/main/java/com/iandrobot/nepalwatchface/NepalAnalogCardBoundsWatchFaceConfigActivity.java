package com.iandrobot.nepalwatchface;

import android.content.ComponentName;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.wearable.companion.WatchFaceCompanion;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class NepalAnalogCardBoundsWatchFaceConfigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nepal_analog_card_bounds_watch_face_config);

        ComponentName name = getIntent().getParcelableExtra(WatchFaceCompanion.EXTRA_WATCH_FACE_COMPONENT);
        TextView lable = (TextView)findViewById(R.id.label);
        lable.setText(lable.getText() + " (" + name.getClassName() + " )");
    }

}
