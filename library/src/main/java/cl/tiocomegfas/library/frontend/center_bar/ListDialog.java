package cl.tiocomegfas.library.frontend.center_bar;

import android.app.Activity;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

public class ListDialog {

    public static void show (Activity activity, String title, String[] items, DialogInterface.OnClickListener listenerItem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(title)
                .setItems(items, listenerItem);
        builder.create().show();
    }

    public static void show (Activity activity, String title, String message,  String[] items, DialogInterface.OnClickListener listenerItem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(title)
                .setItems(items, listenerItem)
                .setMessage(message);
        builder.create().show();
    }
}
