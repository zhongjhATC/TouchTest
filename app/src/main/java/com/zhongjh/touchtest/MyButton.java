package com.zhongjh.touchtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyButton extends androidx.appcompat.widget.AppCompatButton {

    private final static String TAG = "OnTouch MyButton";

    public MyButton(@NonNull Context context) {
        super(context);
    }

    public MyButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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

    @Override
    public boolean performClick() {
        Log.d(TAG,"performClick");
        return super.performClick();
    }

}
