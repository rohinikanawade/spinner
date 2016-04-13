package com.example.rohini.program1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class App5Activity extends Activity {
    Button button,button2;
    private final String htmlText = "<body><h1>Layering Liquids: Explore Density Science</h1>\n" +
            "<img src=\"layered.jpg\"  width=\"10\" height=\"10\"\">"+"<p>Density—or mass per volume—of a liquid is an important scientific concept that can be viewed with the naked eye. We see it all the time with oil and water. Oil has a different density than water so the two liquids do not mix. In this liquid density experiment your child will look at a number of liquids with different densities and compare them all to water. She'll build her science skills and learn a fundamental scientific concept she'll use for years to come.\n" +
            "\n</p>"+"</body>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main5);

        TextView htmlTextView = (TextView)findViewById(R.id.html_text);
        htmlTextView.setText(Html.fromHtml(htmlText, new ImageGetter(), null));
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, App7Activity.class);
                startActivity(intent);

            }

        });

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, App2Activity.class);
                startActivity(intent);

            }

        });

    }


    private class ImageGetter implements Html.ImageGetter {

        public Drawable getDrawable(String source) {
            int id;
            if (source.equals("layered.jpg")) {
                id = R.drawable.layered;
            }
            else {
                return null;
            }

            Drawable d = getResources().getDrawable(id);
            d.setBounds(0,0,d.getIntrinsicWidth(),d.getIntrinsicHeight());
            return d;
        }
    };


}
