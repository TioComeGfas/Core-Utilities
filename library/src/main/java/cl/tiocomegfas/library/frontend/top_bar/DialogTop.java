package cl.tiocomegfas.library.frontend.top_bar;

import android.app.Activity;

import com.tapadoo.alerter.Alerter;

import cl.tiocomegfas.library.backend.constant.Colors;

public class DialogTop {

    public static final int PRECAUTION = Colors.YELLOW_500;
    public static final int ERROR = Colors.RED_500;
    public static final int INFORMATION = Colors.CYAN_500;
    public static final int SUCCESS = Colors.GREEN_500;

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
