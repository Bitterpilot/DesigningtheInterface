package com.stackskills_learning.designingtheinterface;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;
    //array for colours
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.BLACK, Color.BLUE, Color.CYAN, Color.DKGRAY, Color.GRAY, Color.GREEN, Color.LTGRAY, Color.MAGENTA, Color.RED, Color.WHITE, Color.YELLOW};

        windowView = findViewById(R.id.windowViewID);
        //windowView.setBackgroundColor(colors[1]);

        tryMeButton = (Button) findViewById(R.id.tryMeButton);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int colorArrayLength = colors.length;
                Random random = new Random();
                int randomNum = random.nextInt(colorArrayLength);

                windowView.setBackgroundColor(colors[randomNum]);

//                Log.d("Random", String.valueOf(randomNum));
            }
        });

    }
}
