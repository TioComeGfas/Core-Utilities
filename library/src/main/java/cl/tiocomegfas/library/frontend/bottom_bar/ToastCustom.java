package cl.tiocomegfas.library.frontend.bottom_bar;

import android.content.Context;
import android.widget.Toast;

public class ToastCustom {

    public static void show(Context context,String mensaje,int duration){
        Toast.makeText(context,mensaje,duration).show();
    }

    public static void show(Context context,String mensaje){
        Toast.makeText(context,mensaje,Toast.LENGTH_LONG).show();

    }
}
