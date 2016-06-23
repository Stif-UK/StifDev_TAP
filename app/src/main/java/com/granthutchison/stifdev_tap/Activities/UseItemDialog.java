package com.granthutchison.stifdev_tap.Activities;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.granthutchison.stifdev_tap.Model.Controller;
import com.granthutchison.stifdev_tap.R;

/**
 * Created by Stifler on 23/06/2016.
 */
public class UseItemDialog extends DialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //Use an AlertDialog builder to populate the dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        //Inject the custom layout into the dialog box
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.item_dialog,null);
        builder.setView(dialogView);
        //Set the custom title and description, based on the item clicked.
        TextView titleView = (TextView) dialogView.findViewById(R.id.dialogTitle);
        titleView.setText(getArguments().getString("Title"));
        TextView descriptionView = (TextView) dialogView.findViewById(R.id.dialogDescription);
        descriptionView.setText(getArguments().getString("Description"));




        // Create the AlertDialog object and return it
        return builder.create();
    }
}
