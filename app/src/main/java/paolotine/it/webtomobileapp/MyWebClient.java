package paolotine.it.webtomobileapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by oloap on 15/03/2018.
 */

public class MyWebClient extends WebViewClient {
    ProgressDialog progressDialog;

    Activity activity;

    public MyWebClient(Activity container) {
        activity = container;
    }

    @Override
    //Implement shouldOverrideUrlLoading//
    public boolean shouldOverrideUrlLoading(WebView view, String url) {

        //Check whether the URL contains a whitelisted domain. In this example, we’re checking
        //whether the URL contains the “example.com” string//
        //if(Uri.parse(url).getHost().endsWith("")) {

            //If the URL does contain the “example.com” string, then the shouldOverrideUrlLoading method
            //will return ‘false” and the URL will be loaded inside your WebView//
            return false;
        //}

        //If the URL doesn’t contain this string, then it’ll return “true.” At this point, we’ll
        //launch the user’s preferred browser, by firing off an Intent//
        //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        //view.getContext().startActivity(intent);
        //return true;
    }

    //Show loader on url load
    public void onPageStarted(WebView view, String url, Bitmap favicon) {

        // Then show progress  Dialog
        // in standard case YourActivity.this
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(activity);
            progressDialog.setMessage("Loading...");
            progressDialog.show();
        }
    }

    // Called when all page resources loaded
    public void onPageFinished(WebView view, String url) {
        try {
            // Close progressDialog
            if (progressDialog.isShowing()) {
                progressDialog.dismiss();
                progressDialog = null;
                activity.getParent().recreate();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

