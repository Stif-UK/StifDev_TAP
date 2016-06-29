package com.granthutchison.stifdev_tap.Activities;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.granthutchison.stifdev_tap.Model.Controller;
import com.granthutchison.stifdev_tap.R;

/**
 * Created by Stifler on 23/06/2016.
 */
public class UseItemDialog extends DialogFragment {

    /*
     *Create an interface to be implemented by any activity making use of this DialogFragment
      * This will allow for events to be passed back to the Activity calling the dialog
     */

    /* The activity that creates an instance of this dialog fragment must
    * implement this interface in order to receive event callbacks.
    * Each method passes the DialogFragment in case the host needs to query it. */
    public interface UseItemDialogListener {
        public void onDialogUseItemClick(DialogFragment dialog);
    }

    // Use this instance of the interface to deliver action events
    UseItemDialogListener mListener;

    // Override the Fragment.onAttach() method to instantiate the NoticeDialogListener
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        // Verify that the host activity implements the callback interface
        try {
            // Instantiate the NoticeDialogListener so we can send events to the host
            mListener = (UseItemDialogListener) activity;
        } catch (ClassCastException e) {
            // The activity doesn't implement the interface, throw exception
            throw new ClassCastException(activity.toString()
                    + " must implement NoticeDialogListener");
        }
    }

    @Override
    public Dialog onCreateDialog(final Bundle savedInstanceState) {
        //Use an AlertDialog builder to populate the dialog
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        //Inject the custom layout into the dialog box
        LayoutInflater inflater = getActivity().getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.item_dialog,null);
        builder.setView(dialogView);
        //Set the custom title and description, based on the item clicked.
        final TextView titleView = (TextView) dialogView.findViewById(R.id.dialogTitle);
        final String itemTitle = getArguments().getString("Title");
        titleView.setText(itemTitle);
        TextView descriptionView = (TextView) dialogView.findViewById(R.id.dialogDescription);
        descriptionView.setText(getArguments().getString("Description"));

        Button cancelBtn = (Button) dialogView.findViewById(R.id.btnCancel);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        Button useBtn = (Button) dialogView.findViewById(R.id.btnUseItem);
        useBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dialogFragment = (DialogFragment) getActivity().getFragmentManager().findFragmentByTag(itemTitle);
                mListener.onDialogUseItemClick(dialogFragment);
            }
        });





        // Create the AlertDialog object and return it
        return builder.create();
    }
}
