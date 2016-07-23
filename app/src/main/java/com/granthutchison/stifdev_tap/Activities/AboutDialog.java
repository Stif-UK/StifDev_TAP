package com.granthutchison.stifdev_tap.Activities;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

import com.granthutchison.stifdev_tap.R;

/**
 * Created by Stifler on 23/07/2016.
 */
public class AboutDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        return super.onCreateDialog(savedInstanceState);



        //Use an AlertDialog builder to populate the dialog
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        //Inject the custom layout into the dialog box
        LayoutInflater inflater = getActivity().getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.about_dialog,null);
        builder.setView(dialogView);
        builder.getContext().getTheme().applyStyle(R.style.About_Dialog, true);

        return builder.create();
    }
}
