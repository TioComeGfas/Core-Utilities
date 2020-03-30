package cl.tiocomegfas.library.backend.shared_preferences;

import android.content.Context;

public interface IPreference {

    void writeAtribute(Context context, String name, String id, String value);
    void writeAtribute(Context context, String name,String id,Integer value);
    void writeAtribute(Context context, String name,String id,Double value);
    void writeAtribute(Context context, String name,String id,Float value);
    void writeAtribute(Context context, String name,String id,Boolean value);
    void writeAtribute(Context context, String name,String id,Byte value);
    void writeAtribute(Context context, String name,String id,Long value);

    String readAttribute(Context context, String name,String id,String defaultValue);
    Integer readAttribute(Context context, String name,String id, Integer defaultValue);
    Double readAttribute(Context context, String name,String id, Double defaultValue);
    Float readAttribute(Context context, String name,String id, Float defaultValue);
    Boolean readAttribute(Context context, String name,String id, Boolean defaultValue);
    Byte readAttribute(Context context, String name,String id, Byte defaultValue);
    Long readAttribute(Context context, String name,String id, Long defaultValue);

    void deleteAtribute(Context context, String name, String id);

    void clear(Context context,String name);

}
