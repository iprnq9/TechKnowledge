package com.example.hkaou.tech_knowledge;
import  android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.AdapterView;
import android.os.Bundle;
import android.app.Activity;

/**
 * Created by hkaou on 9/19/2015.
 */

class Custom_adpater extends ArrayAdapter<String>{
    private final String[] names1;
    private final String[][] lst_list = new String[5][5];
    private final Integer[] imgId1;

    public Custom_adpater(Context context, String[] discriptions, String[] names, String[][] lst1 , Integer[] imgId) {
            super(context, R.layout.list_row, discriptions);

        this.imgId1 = imgId;


        //use this to import names
        this.names1 = names;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <5; j++){
              this.lst_list[i][j] = lst1[i][j];

           }

        }
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater hkLay = LayoutInflater.from(getContext());
        View customView = hkLay.inflate(R.layout.list_row, parent, false);

        String disc_Ription = getItem(position);
        TextView hkText = (TextView) customView.findViewById(R.id.info_text);
        TextView nameTxt = (TextView) customView.findViewById(R.id.name_text);
        ImageView hkImage = (ImageView) customView.findViewById(R.id.imageView);
        hkText.setText(disc_Ription);
        nameTxt.setText(names1[position]);
        hkImage.setImageResource(imgId1[position]);


        String[] thingsIneed = lst_list[position];
        ListAdapter newAdap = new ArrayAdapter<String>(getContext() , android.R.layout.simple_list_item_1, thingsIneed);
        ListView myListview = (ListView) customView.findViewById(R.id.row_lst);
        myListview.setAdapter(newAdap);







        return customView;
    }


}
