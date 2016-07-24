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
import com.granthutchison.stifdev_tap.Util.FontManager;

/**
 * Created by Stifler on 23/07/2016.
 */
public class AboutDialog extends DialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        //Use an AlertDialog builder to populate the dialog
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        //Inject the custom layout into the dialog box
        LayoutInflater inflater = getActivity().getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.about_dialog,null);
        builder.setView(dialogView);
        //Get the close button and set it up to close the dialog
        Button btnClose = (Button) dialogView.findViewById(R.id.btnAboutClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        final Button btnAbtExpand = (Button) dialogView.findViewById(R.id.btnAbtExpand);
        final TextView abtView = (TextView) dialogView.findViewById(R.id.aboutText);

        //Use the custom utility to set FontAwesome fonts on buttons
        btnAbtExpand.setTypeface(FontManager.getTypeface(btnAbtExpand.getContext(),FontManager.FONTAWESOME));
        btnAbtExpand.setText(R.string.fa_icon_expand);
        //Set onClick behaviour of the About button
        btnAbtExpand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (abtView.getText().length() == 0) {
                    //Change the 'expand' button to a 'contract' button icon
                    btnAbtExpand.setText(R.string.fa_icon_contract);
                    //Set the text of the about box
                    abtView.setText("Some placeholder text");
                } else {
                    btnAbtExpand.setText(R.string.fa_icon_expand);
                    abtView.setText("");
                }

            }
        });


        //Set the style - this is configured to set the width of the box
        builder.getContext().getTheme().applyStyle(R.style.About_Dialog, true);

        return builder.create();
    }
}
