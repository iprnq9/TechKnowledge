package com.example.hkaou.tech_knowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
}


