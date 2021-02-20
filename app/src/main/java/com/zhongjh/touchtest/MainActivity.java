package com.zhongjh.touchtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "OnTouch MainActivity";

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.myButton).setOnTouchListener((v, event) -> false);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG,"dispatchTouchEvent " + Utils.getAction(ev.getAction()) );
        boolean isDispatch = super.dispatchTouchEvent(ev);
//        Log.d(TAG," super.dispatchTouchEvent(ev):" + isDispatch);
        return isDispatch;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG,"onTouchEvent ACTION_DOWN");
                // 手指按下（所有事件的开始） 0
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG,"onTouchEvent ACTION_MOVE");
                // 手指移动（会多次触发） 2
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG,"onTouchEvent ACTION_UP");
                // 手指抬起（与DOWN对应的结束） 1
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG,"onTouchEvent ACTION_CANCEL");
                // 事件被拦截 （非人为原因） 3
                break;
            case MotionEvent.ACTION_OUTSIDE:
                Log.d(TAG,"onTouchEvent ACTION_OUTSIDE");
                // 超出区域 4
                break;
        }
        return super.onTouchEvent(event);
    }



}