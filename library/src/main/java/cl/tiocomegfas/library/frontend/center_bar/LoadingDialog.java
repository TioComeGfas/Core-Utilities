package cl.tiocomegfas.library.frontend.center_bar;

import android.content.Context;

import dmax.dialog.SpotsDialog;

public class LoadingDialog {

    public static android.app.AlertDialog show (Context context) {
        return new SpotsDialog.Builder()
                .setContext(context)
                .setMessage("Cargando")
                .setCancelable(false)
                .build();
    }

    public static android.app.AlertDialog show (Context context, String message) {
        return new SpotsDialog.Builder()
                .setContext(context)
                .setMessage(message)
                .setCancelable(false)
                .build();
    }

    public static android.app.AlertDialog show (Context context, String message, boolean isCancelable) {
        return new SpotsDialog.Builder()
                .setContext(context)
                .setMessage(message)
                .setCancelable(isCancelable)
                .build();
    }

}
