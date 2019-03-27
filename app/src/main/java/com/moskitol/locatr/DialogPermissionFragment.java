package com.moskitol.locatr;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

public class DialogPermissionFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.dialog_title)
                .setPositiveButton("Ok", null)
                .create();
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        requestPermissions(LocatrFragment.LOCATION_PERMISSIONS, LocatrFragment.REQUEST_LOCATION_PERMISSIONS);
        super.onDismiss(dialog);
    }
}
