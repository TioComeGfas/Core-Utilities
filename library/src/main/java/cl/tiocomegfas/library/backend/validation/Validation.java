package cl.tiocomegfas.library.backend.validation;

import org.json.JSONObject;

public class Validation {

    public static boolean validateValueJson(String value, JSONObject json) throws IllegalArgumentException{
        if(json == null) throw new IllegalArgumentException("JSON es nulo");
        if(value == null || value.isEmpty()) throw new IllegalArgumentException("value es invalido");

        return json.has(value) && !json.isNull(value);
    }

}
