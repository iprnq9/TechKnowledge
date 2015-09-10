package com.example.hkaou.gridlay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button hkButton = (Button)findViewById(R.id.bigButton);//reference to button

        //event listener
        hkButton.setOnClickListener(
                new Button.OnClickListener(){
                    //do this
                    public void onClick( View v){
                        TextView hkText = (TextView)findViewById(R.id.hkText);
                        hkText.setText("Button clicked");

                    }
                }

        );
       //long hold
    hkButton.setOnLongClickListener(
            new Button.OnLongClickListener(){
                public boolean onLongClick(View v){
                    TextView hkText = (TextView)findViewById(R.id.hkText);
                    hkText.setText("Button long hold");
                    return true;//needs a return statement. will pass to click listener if not returned
                }

            }



    );



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
