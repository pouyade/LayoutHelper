package ir.psoft.psoftlayoutlib.helper;


import android.content.Context;
import android.util.TypedValue;

/**
 * Created by pouyadark on 11/15/18.
 */

public class ScreenHelper {
    private static float ScreenWidth = 0;
    private static float ScreenWidthdp = 0;
    private static float ScreenHeightdp = 0;
    private static float ScreenHeight = 0;
    public static float getScreenWidth(Context context){
        if(ScreenWidth==0){
            ScreenWidth =  AndroidUtilities.getWidthnodp(context);
        }
        return ScreenWidth;
    }

    public static float getScreenWidthdp(Context context){
        if(ScreenWidthdp==0){
            ScreenWidthdp =  AndroidUtilities.getWidth(context);
        }
        return ScreenWidthdp;
    }

    public static float getScreenHeightdp(Context context){
        if(ScreenHeightdp==0){
            ScreenHeightdp =  AndroidUtilities.getHeightnodp(context);
        }
        return ScreenHeightdp;
    }

    public static float getScreenHeight(Context context) {
        if(ScreenHeight==0){
            ScreenHeight =  AndroidUtilities.getHeight(context);
        }
        return ScreenHeight;
    }
//    public static int getActionbarHeight(Context context){
//        TypedValue tv = new TypedValue();
//        if (context.getTheme().resolveAttribute(android.R.attr.actionBarSize, tv, true))
//        {
//            return tv.data;
//        }
//        return 10;
//    }
}
