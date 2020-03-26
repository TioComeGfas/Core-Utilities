package cl.tiocomegfas.library.frontend.top_bar;

import android.app.Activity;

import com.tapadoo.alerter.Alerter;

import cl.tiocomegfas.library.backend.constant.Color;

public class DialogTop {

    public static final int PRECAUTION = Color.YELLOW_500;
    public static final int ERROR = Color.RED_500;
    public static final int INFORMATION = Color.CYAN_500;
    public static final int SUCCESS = Color.GREEN_500;

    public static void show(Activity activity, String title, String message, int duration, int color){
        Alerter.
                create(activity).
                setBackgroundColor(color).
                setDuration(3000).
                setTitle(title).
                setDuration(duration).
                setText(message).
                show();
    }

    public static void show(Activity activity, String title, String message,int color){
        Alerter.
                create(activity).
                setBackgroundColor(color).
                setDuration(3000).
                setTitle(title).
                setText(message).
                show();
    }

    public static void show(Activity activity, String message,int color){
        Alerter.
                create(activity).
                setBackgroundColor(color).
                setDuration(3000).
                setTitle("Atencion").
                setText(message).
                show();
    }

}
