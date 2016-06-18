package com.granthutchison.stifdev_tap.Util;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Utility class created to support with the implementation of Font Awesome icons in the project
 * Created by Stifler on 18/06/2016.
 */
public class FontManager {

    public static final String ROOT = "fonts/",
    FONTAWESOME = ROOT + "fontawesome-webfont.ttf";

    public static Typeface getTypeface(Context context, String font){
        return Typeface.createFromAsset(context.getAssets(), font);
    }

}
