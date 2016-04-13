package com.example.rohini.program1;

/**
 * Created by rohini on 25/3/16.
 */
   import android.app.Activity;
   import android.content.Context;
   import android.content.Intent;
   import android.os.Bundle;
   import android.widget.Button;
   import android.view.View;
   import android.view.View.OnClickListener;
   import android.widget.Spinner;

public class AppActivity extends Activity {

    Button button;
    Spinner spinner1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addListenerOnButton();
    }
    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }
    public void addListenerOnButton() {

        final Context context = this;
        spinner1 = (Spinner) findViewById(R.id.spinner1);

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if(String.valueOf(spinner1.getSelectedItem()).equals("Forth Standard")) {
                    Intent intent = new Intent(context, App2Activity.class);
                    startActivity(intent);
                }
                else if(String.valueOf(spinner1.getSelectedItem()).equals("Fifth Standard")) {
                    Intent intent = new Intent(context, App3Activity.class);
                    startActivity(intent);
                }
                else if(String.valueOf(spinner1.getSelectedItem()).equals("Sixth Standard")) {
                    Intent intent = new Intent(context, App4Activity.class);
                    startActivity(intent);
                }
            }

        });
    }

}
