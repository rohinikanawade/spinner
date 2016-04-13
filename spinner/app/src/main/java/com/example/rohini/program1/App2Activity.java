/**
 * Created by rohini on 30/3/16.
 */
package com.example.rohini.program1;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class App2Activity extends ListActivity {

    static final String[] FRUITS = new String[] { "Liquid Density Experiment", "Make Your Own Electricity" };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // no more this
        // setContentView(R.layout.list_fruit);

        setListAdapter(new ArrayAdapter<String>(this, R.layout.main2,FRUITS));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);
        listView.setBackgroundColor(Color.TRANSPARENT);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch(position) {
                    case 0:
                        Intent newActivity = new Intent(App2Activity.this, App5Activity.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(App2Activity.this,App6Activity.class);
                        startActivity(newActivity1);
                        break;
                }
                // When clicked, show a toast with the TextView text
             //   Toast.makeText(getApplicationContext(),
               //         ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }

}
