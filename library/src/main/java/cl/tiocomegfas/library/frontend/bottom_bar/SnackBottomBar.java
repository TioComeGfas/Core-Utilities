package cl.tiocomegfas.library.frontend.bottom_bar;

import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class SnackBottomBar {

    public static void show(View view,String message){
        Snackbar.make(view ,message , Snackbar.LENGTH_LONG).show();
    }

    public static void show(View view,String message,int duration){
        Snackbar.make(view ,message , duration).show();
    }
}
