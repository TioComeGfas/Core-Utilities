package cl.tiocomegfas.library.backend.shared_preferences;

import android.content.Context;
import android.content.SharedPreferences;

import java.io.Serializable;

public class Preferences implements Serializable {

    public static <T> void writeAtribute(Context context, String name, String id, T value) {
        SharedPreferences sharedPreferences = getSharedPreferences(context,name);

        if(value instanceof String){
            sharedPreferences.edit().putString(id,(String) value).apply();
            return;
        }

        if(value instanceof Byte){
            sharedPreferences.edit().putInt(id,(Byte) value).apply();
            return;
        }

        if(value instanceof Integer){
            sharedPreferences.edit().putInt(id,(Integer) value).apply();
            return;
        }

        if(value instanceof Long){
            sharedPreferences.edit().putLong(id,(Long) value).apply();
            return;
        }

        if(value instanceof Float){
            sharedPreferences.edit().putFloat(id,(Float) value).apply();
            return;
        }

        if(value instanceof Double){
            sharedPreferences.edit().putFloat(id, (Float) value).apply();
            return;
        }

        if(value instanceof Boolean){
            sharedPreferences.edit().putBoolean(id,(Boolean) value).apply();
            return;
        }

        throw new UnsupportedOperationException();

    }

    public static <T> T readAttribute(Context context, String name, String id, T defaultValue) {

        SharedPreferences sharedPreferences = getSharedPreferences(context,name);

        if(defaultValue instanceof String){
            return (T) sharedPreferences.getString(id,(String) defaultValue);
        }

        if(defaultValue instanceof Byte){
            return ((T) Integer.valueOf(sharedPreferences.getInt(id, (Byte) defaultValue)));
        }

        if(defaultValue instanceof Integer){
            return ((T) Integer.valueOf(sharedPreferences.getInt(id, (Integer) defaultValue)));
        }

        if(defaultValue instanceof Long){
            return ((T) Long.valueOf(sharedPreferences.getLong(id, (Long) defaultValue)));
        }

        if(defaultValue instanceof Float){
            return ((T) Float.valueOf(sharedPreferences.getFloat(id, (Float) defaultValue)));
        }

        if(defaultValue instanceof Double){
            return ((T) Float.valueOf(sharedPreferences.getFloat(id, (Float) defaultValue)));
        }

        if(defaultValue instanceof Boolean){
            return ((T) Boolean.valueOf(sharedPreferences.getBoolean(id, (Boolean) defaultValue)));
        }

        throw new UnsupportedOperationException();
    }

    public void deleteAtribute(Context context, String name, String id) {
        getSharedPreferences(context,name).edit().remove(id).apply();
    }

    public void clear(Context context, String name) {
        getSharedPreferences(context,name).edit().clear().apply();
    }

    private static SharedPreferences getSharedPreferences(Context context,String name){
        return context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }
}
