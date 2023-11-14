package com.example.farmersmarket;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;


import androidx.appcompat.app.AppCompatActivity;

public class VendorOne extends AppCompatActivity {
    boolean click = true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.vendor_one);
        ImageView imageView = (ImageView) findViewById(R.id.myImageView);
        Button descriptionBtn = (Button) findViewById(R.id.description);


        PopupWindow popUp = new PopupWindow(this);
        LinearLayout layout = new LinearLayout(this);
        LinearLayout mainLayout = new LinearLayout(this);
        TextView tv = new TextView(this);
        Button but = new Button(this);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click) {
                    popUp.showAtLocation(layout, Gravity.CENTER, 0, 0);
                    popUp.update(50, 50, 300, 80);
                    click = false;
                } else {
                    popUp.dismiss();
                    click = true;
                }
            }
        });

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        layout.setOrientation(LinearLayout.VERTICAL);
        tv.setText("Hi this is a sample text for popup window");
        layout.addView(tv, params);
        popUp.setContentView(layout);
        // popUp.showAtLocation(layout, Gravity.BOTTOM, 10, 10);
        mainLayout.addView(but, params);
        setContentView(mainLayout);

        Spinner spinner_one = findViewById(R.id.spinner1);
        Spinner spinner_two = findViewById(R.id.spinner2);
        Spinner spinner_three = findViewById(R.id.spinner3);
        Spinner spinner_four = findViewById(R.id.spinner4);
        Spinner spinner_five = findViewById(R.id.spinner5);

    }
}
