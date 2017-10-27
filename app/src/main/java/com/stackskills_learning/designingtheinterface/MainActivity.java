package com.stackskills_learning.designingtheinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.mButton);
        mTextView = (TextView) findViewById(R.id.mTextView);

        //Change the tile of the button
        mButton.setText(R.string.button_name);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setVisibility(View.VISIBLE);
                mTextView.setText(R.string.show_text);
            }
        });
    }

//    public void ShowMe(View view){
//        mTextView.setVisibility(View.VISIBLE);
//        mTextView.setText(R.string.show_text);
//    }
}
