package com.example.hkaou.tech_knowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;
import android.transition.TransitionManager;

public class MainActivity extends AppCompatActivity {

    private ViewGroup mainView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainView = (ViewGroup) findViewById(R.id.mainLayout_act);



        //discriptions stored here
        String[] discp_array = {"Description: i wanna build something bad ass", "Description: i wanna build a robot", "Description: I will build the next space x", "Description: innovation is my middle name", "Description: i wanna be an actress" };
        String[] name_array = {"Shameeka Adams", "Bucky Wallace", "Micheal Jordan", "James Harden", "Lebron James"};
        Integer[] imgId = {R.mipmap.pic2, R.mipmap.pic5, R.mipmap.pic4, R.mipmap.pic2, R.mipmap.pic5};


        //2d array for list items
        String[][] lst_list = {{"arduino", "raspberry pi", "computer", "Iphone 6s", "moto 360"},{"monitor", "capacitors", "resistors", "drone", "Samsung"},{"headphones", "diodes", "oscilloscope", "wave gen", "graphics card"},{"arduino", "raspberry pi", "computer", "Iphone 6s", "moto 360"},{"monitor", "capacitors", "resistors", "drone", "Samsung"} };
        ListAdapter myAdapter = new Custom_adpater(this, discp_array, name_array, lst_list, imgId);
        ListView mylstView = (ListView) findViewById(R.id.mylst_view);
        mylstView.setAdapter(myAdapter);








    }
    public void onClick(View view){
        Intent i = new Intent(this, create_proj.class);
        startActivity(i);}
    public void onClick1(View view){
        }
    public void onClick3(View view){Intent i = new Intent(this, donate.class);


        startActivity(i);}







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






