package com.fcz.decorationcircle.test;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/9/5 0005.
 */

public class TestApi {

    public static void toast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}
