package com.example.hkaou.gesturesprac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;




public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {

    private TextView txt1;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView)findViewById(R.id.txt1);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);



    }


    //begin gestures



    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        txt1.setText("onSingletapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        txt1.setText("ondoubletapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        txt1.setText("ondoubletapConfirmed");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        txt1.setText("ondownConfirmed");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        txt1.setText("onshowConfirmed");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        txt1.setText("onSingletapupConfirmed");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        txt1.setText("onscrollConfirmed");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        txt1.setText("onlongpressConfirmed");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        txt1.setText("onflingConfirmed");
        return true;
    }
    //end gestures


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
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
