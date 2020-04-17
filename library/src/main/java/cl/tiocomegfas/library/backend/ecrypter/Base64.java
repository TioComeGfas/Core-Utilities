package cl.tiocomegfas.library.backend.ecrypter;

import java.nio.charset.StandardCharsets;

import cl.tiocomegfas.library.backend.parser.Parser;

public class Base64  {

    public static String decode(String value64){
        byte[] byteArray = android.util.Base64.decode(value64, android.util.Base64.DEFAULT);
        return new String(byteArray);
    }

    public static <T> String encode(T value){

        if(value == null){
            throw new UnsupportedOperationException("El value es nulo o invalido");
        }

        if(value instanceof String){
            byte[] str_temp = String.valueOf(value).getBytes(StandardCharsets.UTF_8);
            return android.util.Base64.encodeToString(str_temp, android.util.Base64.DEFAULT);
        }

        if(value instanceof Integer){
            String value64 = Parser.toString(value);
            byte[] str_temp = value64.getBytes(StandardCharsets.UTF_8);
            return android.util.Base64.encodeToString(str_temp, android.util.Base64.DEFAULT);
        }

        if(value instanceof Double){
            String value64 = Parser.toString(value);
            byte[] str_temp = value64.getBytes(StandardCharsets.UTF_8);
            return android.util.Base64.encodeToString(str_temp, android.util.Base64.DEFAULT);
        }

        if(value instanceof Float){
            String value64 = Parser.toString(value);
            byte[] str_temp = value64.getBytes(StandardCharsets.UTF_8);
            return android.util.Base64.encodeToString(str_temp, android.util.Base64.DEFAULT);
        }

        if(value instanceof Boolean){
            String value64 = Parser.toString(value);
            byte[] str_temp = value64.getBytes(StandardCharsets.UTF_8);
            return android.util.Base64.encodeToString(str_temp, android.util.Base64.DEFAULT);
        }

        if(value instanceof Long){
            String value64 = Parser.toString(value);
            byte[] str_temp = value64.getBytes(StandardCharsets.UTF_8);
            return android.util.Base64.encodeToString(str_temp, android.util.Base64.DEFAULT);
        }

        throw new UnsupportedOperationException("Operacion no valida");
    }
}
