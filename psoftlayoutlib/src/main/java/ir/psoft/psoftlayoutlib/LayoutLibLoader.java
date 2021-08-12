package ir.psoft.psoftlayoutlib;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * Created by pouyadark on 10/27/18.
 */

public class LayoutLibLoader extends Application {
    private static Context instance;

//    @Override
//    public void onCreate() {
//        super.onCreate();
//        instance= this;
//    }
    public static void initiate(Context contextx) {
        instance = contextx;
    }
    public static Context getInstance() {
        return instance;
    }
}
