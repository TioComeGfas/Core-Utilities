package cl.tiocomegfas.library.frontend.top_bar;

import android.view.View;
import android.widget.TextView;

import com.androidadvance.topsnackbar.TSnackbar;

public class SnackTopBar {

    public static final int LONG_DURATION = TSnackbar.LENGTH_LONG;
    public static final int SHORT_DURATION = TSnackbar.LENGTH_SHORT;
    public static final int INFINITE_DURATION = TSnackbar.LENGTH_INDEFINITE;

    public static void show(View view, String message, int duration, int colorBackground, int colorText){
        TSnackbar snack = TSnackbar.make(view,message, duration);

        View snackView = snack.getView();
        snackView.setBackgroundColor(colorBackground);
        TextView textView = snackView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
        textView.setTextColor(colorText);
        snack.show();
    }

    public static void show(View view, String message, int duration, int colorBackground,  int colorText, int colorTextAction, String textAction, View.OnClickListener listener){
        TSnackbar snack = TSnackbar.make(view,message, duration);
        View snackView = snack.getView();
        snackView.setBackgroundColor(colorBackground);
        TextView textView = snackView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
        textView.setTextColor(colorText);
        snack.setActionTextColor(colorTextAction);
        snack.setAction(textAction,listener);
        snack.show();
    }

    public static void show(View view, String message, int duration, int colorBackground){
        TSnackbar snack = TSnackbar.make(view,message, duration);
        snack.getView().setBackgroundColor(colorBackground);
        snack.show();
    }

    public static void show(View view, String message, int duration){
        TSnackbar.make(view,message, duration).show();
    }

    public static void show(View view, String message){
        TSnackbar.make(view,message,SHORT_DURATION).show();
    }

}
