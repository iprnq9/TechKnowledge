package com.example.hkaou.tech_knowledge;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class donate extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView projView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
        Button uploadBttn = (Button) findViewById(R.id.image_bttn);
        projView1 = (ImageView) findViewById(R.id.proj_img_donate);

        //disable button for no camera

        if (!hasCamera())
            uploadBttn.setEnabled(false);


    }

    //does device have camera
    private boolean hasCamera() {
        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }

    //launching camera
    public void launchCamera(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //take a pic and pass on
        startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
    }


    //do something with image


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            //images taken
            Bundle extras = data.getExtras();
            Bitmap photo = (Bitmap) extras.get("data");
            projView1.setImageBitmap(photo);


        }


    }

    public void onClick1(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void onClick(View view) {
        Intent i = new Intent(this, create_proj.class);
        startActivity(i);
    }

    public void onClick3(View view) {
    }

    //submit user data
    public void onClick2(View view) {

        CharSequence text = "Your donation has been submitted for Review";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(this, text, duration);
        toast.show();

        EditText txtview = (EditText) findViewById(R.id.donate_des);
        txtview.setText("");

        EditText txt1 = (EditText) findViewById(R.id.item_name_donate);
        txt1.setText("");

        ImageView img1 = (ImageView) findViewById(R.id.proj_img_donate);
        img1.setImageResource(R.drawable.imghere);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_donate, menu);
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
