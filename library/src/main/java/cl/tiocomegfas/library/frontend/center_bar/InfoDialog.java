package cl.tiocomegfas.library.frontend.center_bar;

import android.content.Context;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

public class InfoDialog {

    public static void show (Context context, String title, String message, String textPositive, DialogInterface.OnClickListener actionPositive, String textNegative, DialogInterface.OnClickListener actionNegative) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton(textPositive, actionPositive)
                .setNegativeButton(textNegative, actionNegative);
        builder.create().show();
    }

    public static void show (Context context, String title, String message, DialogInterface.OnClickListener actionPositive, DialogInterface.OnClickListener actionNegative) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton("Aceptar", actionPositive)
                .setNegativeButton("Cancelar", actionNegative);
        builder.create().show();
    }

    public static void show (Context context, String title, String message, DialogInterface.OnClickListener actionPositive) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton("Aceptar", actionPositive)
                .setNegativeButton("Cancelar", (dialogInterface, i) -> dialogInterface.dismiss());
        builder.create().show();
    }

}
