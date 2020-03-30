package cl.tiocomegfas.library.backend.shared_preferences;

import android.content.Context;
import android.content.SharedPreferences;

import java.io.Serializable;

public class Preferences implements Serializable,IPreference {

    public static Preferences newInstance(){
        return new Preferences();
    }

    @Override
    public void writeAtribute(Context context, String name, String id, String value) {
        getSharedPreferences(context,name).edit().putString(id, value).apply();
    }

    @Override
    public void writeAtribute(Context context, String name, String id, Integer value) {
        getSharedPreferences(context,name).edit().putInt(id, value).apply();
    }

    @Override
    public void writeAtribute(Context context, String name, String id, Double value) {
        writeAtribute(context,name,id,value.floatValue());
    }

    @Override
    public void writeAtribute(Context context, String name, String id, Float value) {
        getSharedPreferences(context,name).edit().putFloat(id, value).apply();
    }

    @Override
    public void writeAtribute(Context context, String name, String id, Boolean value) {
        getSharedPreferences(context,name).edit().putBoolean(id, value).apply();
    }

    @Override
    public void writeAtribute(Context context, String name, String id, Byte value) {
        writeAtribute(context, name, id, value.intValue());
    }

    @Override
    public void writeAtribute(Context context, String name, String id, Long value) {
        getSharedPreferences(context,name).edit().putLong(id, value).apply();
    }



    @Override
    public String readAttribute(Context context, String name, String id, String defaultValue) {
        return getSharedPreferences(context,name).getString(id, defaultValue);
    }

    @Override
    public Integer readAttribute(Context context, String name, String id, Integer defaultValue) {
        return getSharedPreferences(context,name).getInt(id, defaultValue);
    }

    @Override
    public Double readAttribute(Context context, String name, String id, Double defaultValue) {
        return readAttribute(context,name,id,defaultValue.floatValue()).doubleValue();
    }

    @Override
    public Float readAttribute(Context context, String name, String id, Float defaultValue) {
        return getSharedPreferences(context,name).getFloat(id, defaultValue);
    }

    @Override
    public Boolean readAttribute(Context context, String name, String id, Boolean defaultValue) {
        return getSharedPreferences(context,name).getBoolean(id, defaultValue);
    }

    @Override
    public Byte readAttribute(Context context, String name, String id, Byte defaultValue) {
        return readAttribute(context, name, id, defaultValue.intValue()).byteValue();
    }

    @Override
    public Long readAttribute(Context context, String name, String id, Long defaultValue) {
        return getSharedPreferences(context,name).getLong(id, defaultValue);
    }

    @Override
    public void deleteAtribute(Context context, String name, String id) {
        getSharedPreferences(context,name).edit().remove(id).apply();
    }

    @Override
    public void clear(Context context, String name) {
        getSharedPreferences(context,name).edit().clear().apply();
    }

    private SharedPreferences getSharedPreferences(Context context,String name){
        return context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }
}
