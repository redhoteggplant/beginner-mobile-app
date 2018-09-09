package com.example.nadiairwanto.hellonadia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // change text color
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.white)
                );
            }
        });

        // change view color
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorPrimaryDark)
                );
            }
        });

        // change views back to default when background is clicked
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change text color
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorAccent)
                );

                // change view color
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorPrimary)
                );

                ((TextView) findViewById(R.id.textView)).setText("Hello from Nadia!");
                }
        });

        // change text based on user input
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String new_text = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (!TextUtils.isEmpty(new_text)) {
                    ((TextView) findViewById(R.id.textView)).setText(new_text);
                }
                // if input is empty, set text to default
                else {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Nadia!");
                }
            }
        });
    }
}
