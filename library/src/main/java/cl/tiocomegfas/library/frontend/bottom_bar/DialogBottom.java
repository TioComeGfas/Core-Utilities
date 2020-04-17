package cl.tiocomegfas.library.frontend.bottom_bar;

import android.content.Context;

import com.github.javiersantos.bottomdialogs.BottomDialog;

import cl.tiocomegfas.library.backend.constant.Colors;

public class DialogBottom {

    /**
     * Metodo para mostrar un dialogo en los pies de la view
     * @param context contexto de la aplicacion
     * @param title titulo de la ventana de dialogo
     * @param message mesaje de la ventana de dialogo
     * @param messagePositive mensaje para el botton positivo
     * @param colorPositive color para el botton positivo
     * @param colorTextPositive color para el texto del boton positivo
     * @param actionPositive accion cuando el usuario clicke el boton positivo
     * @param messageNegative mensaje para el boton negativo
     * @param colorTextNegative color para el texto del boton negativo
     * @param actionNegative accion cuando el usuaario clicke el boton negativo
     * @param isCancelable si el dialogo es cancelable
     * @param isAutoDissmiss si el dialogo se autocierra
     */
    public static void show(Context context, String title, String message, String messagePositive, int colorPositive, int colorTextPositive, BottomDialog.ButtonCallback actionPositive,  String messageNegative, int colorTextNegative, BottomDialog.ButtonCallback actionNegative,boolean isCancelable, boolean isAutoDissmiss){
        new BottomDialog.Builder(context)
                .setCancelable(isCancelable)
                .autoDismiss(isAutoDissmiss)
                .setTitle(title)
                .setContent(message)
                .setPositiveText(messagePositive)
                .setNegativeText(messageNegative)
                .setPositiveBackgroundColorResource(colorPositive)
                .setPositiveTextColorResource(colorTextPositive)
                .setNegativeTextColorResource(colorTextNegative)
                .onPositive(actionPositive)
                .onNegative(actionNegative)
                .show();
    }

    /**
     * Metodo para mostrar un dialogo en los pies de la view
     * @param context contexto de la aplicacion
     * @param title titulo de la ventana de dialogo
     * @param message mesaje de la ventana de dialogo
     * @param messagePositive mensaje para el botton positivo
     * @param colorPositive color para el botton positivo
     * @param colorTextPositive color para el texto del boton positivo
     * @param actionPositive accion cuando el usuario clicke el boton positivo
     * @param messageNegative mensaje para el boton negativo
     * @param colorTextNegative color para el texto del boton negativo
     * @param actionNegative accion cuando el usuaario clicke el boton negativo
     * @param isCancelable si el dialogo es cancelable
     */
    public static void show(Context context, String title, String message, String messagePositive, int colorPositive, int colorTextPositive, BottomDialog.ButtonCallback actionPositive,  String messageNegative, int colorTextNegative, BottomDialog.ButtonCallback actionNegative,boolean isCancelable){
        new BottomDialog.Builder(context)
                .setCancelable(isCancelable)
                .setTitle(title)
                .setContent(message)
                .setPositiveText(messagePositive)
                .setNegativeText(messageNegative)
                .setPositiveBackgroundColorResource(colorPositive)
                .setPositiveTextColorResource(colorTextPositive)
                .setNegativeTextColorResource(colorTextNegative)
                .onPositive(actionPositive)
                .onNegative(actionNegative)
                .show();
    }

    /**
     * Metodo para mostrar un dialogo en los pies de la view
     * @param context contexto de la aplicacion
     * @param title titulo de la ventana de dialogo
     * @param message mesaje de la ventana de dialogo
     * @param messagePositive mensaje para el botton positivo
     * @param colorPositive color para el botton positivo
     * @param colorTextPositive color para el texto del boton positivo
     * @param actionPositive accion cuando el usuario clicke el boton positivo
     * @param messageNegative mensaje para el boton negativo
     * @param colorTextNegative color para el texto del boton negativo
     * @param actionNegative accion cuando el usuaario clicke el boton negativo
     */
    public static void show(Context context, String title, String message, String messagePositive, int colorPositive, int colorTextPositive, BottomDialog.ButtonCallback actionPositive,  String messageNegative, int colorTextNegative, BottomDialog.ButtonCallback actionNegative){
        new BottomDialog.Builder(context)
                .setTitle(title)
                .setCancelable(false)
                .autoDismiss(false)
                .setContent(message)
                .setPositiveText(messagePositive)
                .setNegativeText(messageNegative)
                .setPositiveBackgroundColorResource(colorPositive)
                .setPositiveTextColorResource(colorTextPositive)
                .setNegativeTextColorResource(colorTextNegative)
                .onPositive(actionPositive)
                .onNegative(actionNegative)
                .show();
    }

    /**
     * Metodo para mostrar un dialogo en los pies de la view
     * @param context contexto de la aplicacion
     * @param title titulo de la ventana de dialogo
     * @param message mesaje de la ventana de dialogo
     * @param messagePositive mensaje para el botton positivo
     * @param actionPositive accion cuando el usuario clicke el boton positivo
     * @param messageNegative mensaje para el boton negativo
     * @param actionNegative accion cuando el usuaario clicke el boton negativo
     */
    public static void show(Context context, String title, String message, String messagePositive, BottomDialog.ButtonCallback actionPositive, String messageNegative, BottomDialog.ButtonCallback actionNegative){
        new BottomDialog.Builder(context)
                .setTitle(title)
                .setCancelable(false)
                .autoDismiss(false)
                .setContent(message)
                .setPositiveText(messagePositive)
                .setNegativeText(messageNegative)
                .setPositiveBackgroundColorResource(Colors.GREEN_500)
                .setPositiveTextColorResource(Colors.WHITE)
                .setNegativeTextColorResource(Colors.RED_500)
                .onPositive(actionPositive)
                .onNegative(actionNegative)
                .show();
    }

    /**
     * Metodo para mostrar un dialogo en los pies de la view
     * @param context contexto de la aplicacion
     * @param title titulo de la ventana de dialogo
     * @param message mesaje de la ventana de dialogo
     * @param actionPositive accion cuando el usuario clicke el boton positivo
     * @param actionNegative accion cuando el usuaario clicke el boton negativo
     */
    public static void show(Context context, String title, String message, BottomDialog.ButtonCallback actionPositive, BottomDialog.ButtonCallback actionNegative){
        new BottomDialog.Builder(context)
                .setTitle(title)
                .setCancelable(false)
                .autoDismiss(false)
                .setContent(message)
                .setPositiveText("Aceptar")
                .setNegativeText("Cancelar")
                .setPositiveBackgroundColorResource(Colors.GREEN_500)
                .setPositiveTextColorResource(Colors.WHITE)
                .setNegativeTextColorResource(Colors.RED_500)
                .onPositive(actionPositive)
                .onNegative(actionNegative)
                .show();
    }

    /**
     * Metodo para mostrar un dialogo en los pies de la view
     * @param context contexto de la aplicacion
     * @param message mesaje de la ventana de dialogo
     * @param actionPositive accion cuando el usuario clicke el boton positivo
     */
    public static void show(Context context, String message, BottomDialog.ButtonCallback actionPositive){
        new BottomDialog.Builder(context)
                .setTitle("Atención")
                .setCancelable(false)
                .autoDismiss(false)
                .setContent(message)
                .setPositiveText("Aceptar")
                .setPositiveBackgroundColorResource(Colors.GREEN_500)
                .setPositiveTextColorResource(Colors.WHITE)
                .onPositive(actionPositive)
                .show();
    }

}
