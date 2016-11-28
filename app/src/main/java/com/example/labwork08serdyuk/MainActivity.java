package com.example.labwork08serdyuk;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnTouchListener;

public class MainActivity extends Activity implements OnTouchListener {

    TextView t1;
    float x, y;
    String tap, move, up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        t1=new TextView(this);
        t1.setOnTouchListener(this);
        setContentView(t1);
    }

    @Override
    public boolean onTouch (View v, MotionEvent event){
        x=event.getX();
        y=event.getY();

        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                tap="Down: "+x+","+y;
                move="";
                up="";
                break;
            case MotionEvent.ACTION_MOVE:
                move="Move:"+x+","+y;
                break;
            case MotionEvent.ACTION_UP:
                move="";
                up="Up:"+x+","+y;
                break;
            case MotionEvent.ACTION_CANCEL:
                move="";
                break;
        }
        t1.setText(tap+"\n"+move+"\n"+up);
        return true;
    }
}
