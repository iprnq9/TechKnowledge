package com.example.hkaou.javaprac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //layout
        RelativeLayout hkaousLay = new RelativeLayout(this);
        hkaousLay.setBackgroundColor(Color.GREEN);


        RelativeLayout.LayoutParams buttonDetails = new  RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
                );


        buttonDetails.addRule( RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //button
        Button redButton = new Button(this);
        redButton.setText("Log in");
        redButton.setBackgroundColor(Color.RED);



        //username input
        EditText userName = new EditText(this);

        //ids
        redButton.setId(1);
        userName.setId(2);



        //postion username widget
        RelativeLayout.LayoutParams userNamedetails = new  RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        userNamedetails.addRule(RelativeLayout.ABOVE, redButton.getId());
        userNamedetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        userNamedetails.setMargins(0,0,0,50);


        //dp to pixel
        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200, r.getDisplayMetrics());//changes from dp to pixels
        userName.setWidth(px); //only excepts pixels








        //add widget
        hkaousLay.addView(redButton, buttonDetails);
        hkaousLay.addView(userName, userNamedetails);

        setContentView(hkaousLay);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
