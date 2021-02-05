package com.zhongjh.touchtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MyConstraintLayout extends ConstraintLayout {

    private final static String TAG = "OnTouch MyConstraintLayout";

    public MyConstraintLayout(@NonNull Context context) {
        super(context);
    }

    public MyConstraintLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyConstraintLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "dispatchTouchEvent" + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }
}
