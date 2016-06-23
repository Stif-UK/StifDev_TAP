package com.granthutchison.stifdev_tap.Activities;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;

import com.granthutchison.stifdev_tap.Model.Controller;

/**
 * Created by Stifler on 23/06/2016.
 */
public class UseItemDialog extends DialogFragment {


//    /* The activity that creates an instance of this dialog fragment must
//     * implement this interface in order to receive event callbacks.
//     * Each method passes the DialogFragment in case the host needs to query it. */
//    public interface NoticeDialogListener {
//        public void onDialogPositiveClick(DialogFragment dialog);
//        public void onDialogNegativeClick(DialogFragment dialog);
//    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //Use an AlertDialog builder to populate the dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(getArguments().getString("Title"));
        builder.setMessage(getArguments().getString("Description"))
                .setPositiveButton("Use", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //Code to trigger useItem() needs to go here
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //If the user cancels the dialog box, simply dismiss it.
                        dismiss();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }
}
