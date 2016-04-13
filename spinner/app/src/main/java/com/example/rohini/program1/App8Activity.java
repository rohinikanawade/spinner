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

public class App8Activity extends Activity {
    Button button,button2;
    private final String htmlText ="<body>"+
            "<p><h1><strong>What You Need:</h1></strong></p>" +
            "<p><form action=\"\">\n" +
            "  <input type=\"radio\" >&#9658; Light corn syrup<br>\n" +
            "   " +
            "  <p><input type=\"radio\" >&#9658;Water<br>\n" +
            "  " +
            "  <p><input type=\"radio\" >&#9658; Vegetable oil<br>\n" +
            "  <p><input type=\"radio\" >&#9658;Dawn dish soap (blue, and the brand is important)<br>\n" +
            "   " +
            "  <p><input type=\"radio\" >&#9658;Rubbing alcohol<br>\n" +
            "  " +
            "  <p><input type=\"radio\" >&#9658;Honey<br>\n" +
            "  <input type=\"radio\" >&#9658; Large clear glass<br>\n" +
            "   " +
            "  <p><input type=\"radio\" >&#9658;Food coloring<br>\n" +
            "  " +
            "  <p><input type=\"radio\" >&#9658; Turkey baster<br>\n" +
            "  <p><input type=\"radio\" >&#9658; Plastic cups<br>\n" +
            "</form>\n" +
            "<p><strong><h1>What You Do:</h1> </strong></p> "
            +"<p><form action=\"\">\n" +
            "  <input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 1: </font><br>\n" +
            "<p>Help your child put some rubbing alcohol into one of the plastic cups and drop some blue food coloring into it until the alcohol becomes dark blue. In a separate plastic cup, do the same with the water except add green coloring to it. In another cup, add orange food coloring to some corn syrup.</p> "
            +"<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 2: </font><br>\n" +
            "<p>Squeeze some honey into the bottom of your large glass. Just enough to give a thin layer; keep in mind that your glass will need to hold 6 different layers of liquid.</p> "
        +  "  <input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 3: </font><br>\n" +
            "<p>Next have your child add the corn syrup. Pour this from the cup and try to pour it slowly and into the middle of the large glass.</p> "
            +"<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 4: </font><br>\n" +
            "<p>Have your child pour the dish soap in next, remembering to pour it into the middle of the glass.</p> "
            +"<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 5: </font><br>\n" +
            "<p>Use your baster to add water to the next level.</p> "
            +  "  <input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 6: </font><br>\n" +
            "<p>Pour in vegetable oil next.</p> "
            +"<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 7: </font><br>\n" +
            "<p>Finally, help your child use the baster to add the rubbing alcohol.</p> "
            +"<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 8: </font><br>\n" +
            "<p>Now you should have 6 layers of density.</p> "
            +"</form>\n" +"<p><h1><strong>What's Going On?</h1></strong></p>" +"<p>Why don’t the liquids all blend together? It's because each of the liquids has a different density! Karo syrup = 1.33. Water with food coloring = 1.00. Vegetable Oil = 0.91. Dish soap = 1.03. Honey = 1.36. Rubbing alcohol = 0.87. The various densities allow you to \"stack\" liquids on top of each other, resulting in an experiment that is both visually stunning and informative!\n</p>"+
            "\n " +"</body>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main8);

        TextView htmlTextView = (TextView)findViewById(R.id.html_text);
        htmlTextView.setText(Html.fromHtml(htmlText));
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

                Intent intent = new Intent(context, App7Activity.class);
                startActivity(intent);

            }

        });

    }




}
