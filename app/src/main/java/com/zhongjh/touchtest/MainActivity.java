package com.zhongjh.touchtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "OnTouch MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG,"dispatchTouchEvent" + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                // 手指按下（所有事件的开始） 0
                break;
            case MotionEvent.ACTION_MOVE:
                // 手指移动（会多次触发） 2
                break;
            case MotionEvent.ACTION_UP:
                // 手指抬起（与DOWN对应的结束） 1
                break;
            case MotionEvent.ACTION_CANCEL:
                // 事件被拦截 （非人为原因） 3
                break;
            case MotionEvent.ACTION_OUTSIDE:
                // 超出区域 4
                break;
        }
        return super.onTouchEvent(event);
    }

}