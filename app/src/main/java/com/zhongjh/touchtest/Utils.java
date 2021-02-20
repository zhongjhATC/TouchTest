package com.zhongjh.touchtest;

import android.view.MotionEvent;

public  class Utils {

    public static String getAction(int value) {
        switch (value) {
            case MotionEvent.ACTION_DOWN:
                return "ACTION_DWON";
            case MotionEvent.ACTION_MOVE:
                return "ACTION_MOVE";
            case MotionEvent.ACTION_UP:
                return "ACTION_UP";
            case MotionEvent.ACTION_CANCEL:
                return "ACTION_CANCEL";
            case MotionEvent.ACTION_OUTSIDE:
                return "ACTION_OUTSIDE";
        }
        return "";
    }

}
