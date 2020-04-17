package cl.tiocomegfas.library.backend.parser;

import cl.tiocomegfas.library.backend.exception.InElementNullException;

/**
 * Clase para realizar la conversion de tipos de datos
 * La cree para optimizar y dejar una sola clase responsable de las conversiones y no tener tanto codigo en los proyectos
 * La exception que se lanza es cuando el objeto generico de entrada es nulo
 * La exception que se lanza al final de los metodos es cuando el tipo de instancia no corresponde a ninguno de los pensados debe detener el proceso
 * para informar al desarrollador que no es posible transformar al tipo de dato pensado
 */

public class Parser {

    public static <T> String toString(T in) throws InElementNullException {

        if(in == null){
            //lanza exception
            throw new InElementNullException("El elemento de entrada es nulo");
        }

        if(in instanceof String) {
            //el elemento de entrada es un string
            return (String) in;
        }

        if(in instanceof Byte){
            return String.valueOf(in);
        }

        if(in instanceof Integer){
            //el elemento de entrada es un integer
            return String.valueOf(in);
        }

        if(in instanceof Long){
            //el elemento de entrada es un long
            return String.valueOf(in);
        }

        if(in instanceof Float){
            //el elemento de entrada es un double
            return String.valueOf(in);
        }

        if(in instanceof Double){
            //el elemento de entrada es un double
            return String.valueOf(in);
        }

        if(in instanceof Boolean){
            if((Boolean)in) return "true";
            else return "false";
        }

        throw new UnsupportedOperationException();
    }

    public static <T> byte toByte(T in) throws InElementNullException{

        if(in == null){
            //lanza exception
            throw new InElementNullException("El elemento de entrada es nulo");
        }

        //el elemento de entrada es un string
        if(in instanceof String) {
            return Byte.parseByte((String)in);
        }

        if(in instanceof Byte){
            return (Byte) in;
        }

        if(in instanceof Integer){
            //el elemento de entrada es un integer
            return ((Integer) in).byteValue();
        }

        if(in instanceof Long){
            //el elemento de entrada es un long
            return ((Long) in).byteValue();
        }

        if(in instanceof Float){
            //el elemento de entrada es un double
            return ((Float) in).byteValue();
        }

        if(in instanceof Double){
            //el elemento de entrada es un double
            return ((Double) in).byteValue();
        }

        if(in instanceof Boolean){
            if((Boolean)in) return 1;
            else return 0;
        }

        throw new UnsupportedOperationException();
    }

    public static <T> float toFloat(T in) throws InElementNullException{

        if(in == null){
            //lanza exception
            throw new InElementNullException("El elemento de entrada es nulo");
        }

        //el elemento de entrada es un string
        if(in instanceof String) {
            return Float.parseFloat((String)in);
        }

        if(in instanceof Byte){
            return ((Byte) in).floatValue();
        }

        if(in instanceof Integer){
            //el elemento de entrada es un integer
            return ((Integer) in).floatValue();
        }

        if(in instanceof Long){
            //el elemento de entrada es un long
            return ((Long) in).floatValue();
        }

        if(in instanceof Float){
            //el elemento de entrada es un double
            return (Float) in;
        }

        if(in instanceof Double){
            //el elemento de entrada es un double
            return ((Double) in).floatValue();
        }

        if(in instanceof Boolean){
            if((Boolean)in) return 1;
            else return 0;
        }

        throw new UnsupportedOperationException();
    }

    public static <T> int toInteger(T in) throws InElementNullException{

        if(in == null){
            //lanza exception
            throw new InElementNullException("El elemento de entrada es nulo");
        }

        //el elemento de entrada es un string
        if(in instanceof String) {
            return Integer.parseInt((String)in);
        }

        if(in instanceof Byte){
            return ((Byte) in).intValue();
        }

        if(in instanceof Integer){
            //el elemento de entrada es un integer
            return (Integer)in;
        }

        if(in instanceof Long){
            //el elemento de entrada es un long
            return ((Long) in).intValue();
        }

        if(in instanceof Float){
            //el elemento de entrada es un double
            return ((Float) in).intValue();
        }

        if(in instanceof Double){
            //el elemento de entrada es un double
            return ((Double) in).intValue();
        }

        if(in instanceof Boolean){
            if((Boolean)in) return 1;
            else return 0;
        }

        throw new UnsupportedOperationException();
    }

    public static <T> double toDouble(T in) throws InElementNullException{

        if(in == null){
            //lanza exception
            throw new InElementNullException("El elemento de entrada es nulo");
        }

        //el elemento de entrada es un string
        if(in instanceof String) {
            return Double.parseDouble((String)in);
        }

        if(in instanceof Byte){
            return ((Byte) in).doubleValue();
        }

        if(in instanceof Integer){
            //el elemento de entrada es un integer
            return ((Integer) in).doubleValue();
        }

        if(in instanceof Long){
            //el elemento de entrada es un long
            return ((Long) in).doubleValue();
        }

        if(in instanceof Float){
            //el elemento de entrada es un double
            return ((Float) in).doubleValue();
        }

        if(in instanceof Double){
            //el elemento de entrada es un double
            return (Double) in;
        }

        if(in instanceof Boolean){
            if((Boolean)in) return 1d;
            else return 0d;
        }

        throw new UnsupportedOperationException();
    }

    public static <T> long toLong(T in) throws InElementNullException{

        if(in == null){
            //lanza exception
            throw new InElementNullException("El elemento de entrada es nulo");
        }

        //el elemento de entrada es un string
        if(in instanceof String) {
            return Long.parseLong((String)in);
        }

        if(in instanceof Byte){
            return ((Byte) in).longValue();
        }

        if(in instanceof Integer){
            //el elemento de entrada es un integer
            return ((Integer) in).longValue();
        }

        if(in instanceof Long){
            //el elemento de entrada es un long
            return (Long) in;
        }

        if(in instanceof Float){
            //el elemento de entrada es un double
            return ((Float) in).longValue();
        }

        if(in instanceof Double){
            //el elemento de entrada es un double
            return ((Double) in).longValue();
        }

        if(in instanceof Boolean){
            if((Boolean)in) return 1L;
            else return 0L;
        }

        throw new UnsupportedOperationException();
    }

    public static <T> boolean toBoolean(T in) throws InElementNullException{

        if(in == null){
            //lanza exception
            throw new InElementNullException("El elemento de entrada es nulo");
        }

        //el elemento de entrada es un string
        if(in instanceof String) {
            return Boolean.parseBoolean((String)in);
        }

        if(in instanceof Byte){
            return (Byte) in > 0;
        }

        if(in instanceof Integer){
            //el elemento de entrada es un integer
            return ((Integer) in) > 0;
        }

        if(in instanceof Long){
            //el elemento de entrada es un long
            return (Long) in > 0;
        }

        if(in instanceof Float){
            //el elemento de entrada es un double
            return ((Float) in) > 0;
        }

        if(in instanceof Double){
            //el elemento de entrada es un double
            return ((Double) in) > 0;
        }

        if(in instanceof Boolean){
            return (Boolean)in;
        }

        throw new UnsupportedOperationException();
    }

}
