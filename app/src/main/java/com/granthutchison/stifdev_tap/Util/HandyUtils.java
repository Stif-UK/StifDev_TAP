package com.granthutchison.stifdev_tap.Util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * Created by Stifler on 31/07/2016.
 */
public class HandyUtils {


    /**
     * filterByPackageName is a simple utility method created by StackOverflow user Jonik.
     * It takes the current context and a newly generated intent as a parameter, along with a package
     * name of an external application. If this external application is identified, then the intent
     * is sent to this application
     * (e.g. in this app it has been used to identify the Google Plus package and fire an intent
     * at it to share a G+ post).
     * @param context the current user context.
     * @param intent the intent to be sent to the external package.
     * @param prefix the package of the external app.
     */
    public static void filterByPackageName(Context context, Intent intent, String prefix) {
        List<ResolveInfo> matches = context.getPackageManager().queryIntentActivities(intent, 0);
        for (ResolveInfo info : matches) {
            if (info.activityInfo.packageName.toLowerCase().startsWith(prefix)) {
                intent.setPackage(info.activityInfo.packageName);
                return;
            }
        }
    }

    /**
     * urlEncode is a static utility method created by StackOverflow user Jonik.
     * It takes an input string and returns a URL encoded string, to be used where encoded
     * strings are to be included in a url.
     * @param s a String object to be encoded
     * @return a URL encoded String
     */
    public static String urlEncode(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException e) {
            Log.wtf("Crash", "UTF-8 should always be supported", e);
            throw new RuntimeException("URLEncoder.encode() failed for " + s);
        }
    }
}
