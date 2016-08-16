package com.granthutchison.stifdev_tap.Activities;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.granthutchison.stifdev_tap.R;

/**
 * Created by Stifler on 29/06/2016.
 */
public class ItemTextDialog extends DialogFragment {


    @Override
    public Dialog onCreateDialog(final Bundle savedInstanceState) {
        //Use an AlertDialog builder to populate the dialog
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        //Inject the custom layout into the dialog box
        LayoutInflater inflater = getActivity().getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.item_dialog_used,null);
        builder.setView(dialogView);
        //Set the custom title and description, based on the item clicked.
//        final TextView titleView = (TextView) dialogView.findViewById(R.id.dialogUsedTitle);
//        final String itemTitle = getArguments().getString("Title");
//        titleView.setText(itemTitle);
        TextView descriptionView = (TextView) dialogView.findViewById(R.id.dialogUsedDescription);
        descriptionView.setText(getArguments().getString("Description"));

        Button okBtn = (Button) dialogView.findViewById(R.id.btnOK);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Further code required here to trigger a room refresh
                dismiss();
            }
        });

        // Create the AlertDialog object and return it (including setting the width via the style)
        builder.getContext().getTheme().applyStyle(R.style.Item_Dialog, true);
        return builder.create();
    }
}
