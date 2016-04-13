package com.example.rohini.program1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class App7Activity extends Activity {
    private ImageView one = null;
    private ImageView two = null;
    private ImageView three = null;
    private ImageView four = null;
    private ImageView five = null;
    private ImageView six = null;
    private ImageView seven = null;

    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main7);

        one = (ImageView) findViewById(R.id.oneImgView);
        two = (ImageView) findViewById(R.id.twoImgView);
        three = (ImageView) findViewById(R.id.threeImgView);
        four = (ImageView) findViewById(R.id.fourImgView);
        five = (ImageView) findViewById(R.id.fiveImgView);
        six = (ImageView) findViewById(R.id.sixImgView);
        seven = (ImageView) findViewById(R.id.sevenImgView);

        one.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                two.setVisibility(View.VISIBLE);

                view.setVisibility(View.GONE);
            }
        });

        two.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                three.setVisibility(View.VISIBLE);

                view.setVisibility(View.GONE);
            }
        });
        three.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                four.setVisibility(View.VISIBLE);

                view.setVisibility(View.GONE);
            }
        });
        four.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                five.setVisibility(View.VISIBLE);

                view.setVisibility(View.GONE);
            }
        });

        five.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                six.setVisibility(View.VISIBLE);

                view.setVisibility(View.GONE);
            }
        });
        six.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                seven.setVisibility(View.VISIBLE);

                view.setVisibility(View.GONE);
            }
        });
        seven.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                one.setVisibility(View.VISIBLE);

                view.setVisibility(View.GONE);
            }
        });

        addListenerOnButton();

    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, App8Activity.class);
                startActivity(intent);

            }

        });

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, App5Activity.class);
                startActivity(intent);

            }

        });

    }


}