package com.stackskills_learning.designingtheinterface;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        windowView = findViewById(R.id.windowViewID);
        windowView.setBackgroundColor(Color.RED);

    }
}
