package cl.tiocomegfas.library.backend.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import cl.tiocomegfas.library.backend.exception.InElementNullException;

public class Compare {

    public static <T> T max(T[] in) throws InElementNullException{

        if(in == null || in.length == 0){
            //lanza exception
            throw new InElementNullException("El elemento de entrada es nulo");
        }

        if(in.length == 1) return in[0];

        if(in[0] instanceof Byte){
            Arrays.sort(in);
            return in[in.length - 1];
        }

        if(in[0] instanceof Integer){
            //el elemento de entrada es un integer
            Arrays.sort(in);
            return in[in.length - 1];
        }

        if(in[0] instanceof Long){
            //el elemento de entrada es un long
            Arrays.sort(in);
            return in[in.length - 1];
        }

        if(in[0] instanceof Float){
            //el elemento de entrada es un double
            Arrays.sort(in);
            return in[in.length - 1];
        }

        if(in[0] instanceof Double){
            //el elemento de entrada es un double
            Arrays.sort(in);
            return in[in.length - 1];
        }

        throw new UnsupportedOperationException();
    }

    public static <T> T max(List<T> in) throws InElementNullException{

        if(in == null || in.size() == 0){
            //lanza exception
            throw new InElementNullException("El elemento de entrada es nulo");
        }

        if(in.size() == 1) return in.get(0);

        if(in.get(0) instanceof Byte){
            Collections.sort((LinkedList<Byte>)in);
            return (T) ((LinkedList<Byte>) in).getLast();
        }

        if(in.get(0) instanceof Integer){
            //el elemento de entrada es un integer
            Collections.sort((LinkedList<Integer>)in);
            return (T) ((LinkedList<Integer>) in).getLast();
        }

        if(in.get(0) instanceof Long){
            //el elemento de entrada es un long
            Collections.sort((LinkedList<Long>)in);
            return (T) ((LinkedList<Long>) in).getLast();
        }

        if(in.get(0) instanceof Float){
            //el elemento de entrada es un double
            Collections.sort((LinkedList<Float>)in);
            return (T) ((LinkedList<Float>) in).getLast();
        }

        if(in.get(0) instanceof Double){
            //el elemento de entrada es un double
            Collections.sort((LinkedList<Double>)in);
            return (T) ((LinkedList<Double>) in).getLast();
        }

        throw new UnsupportedOperationException();
    }

    public static <T> T min(T[] in) throws InElementNullException{

        if(in == null || in.length == 0){
            //lanza exception
            throw new InElementNullException("El elemento de entrada es nulo");
        }

        if(in.length == 1) return in[0];

        if(in[0] instanceof Byte){
            Arrays.sort(in);
            return in[in.length - 1];
        }

        if(in[0] instanceof Integer){
            //el elemento de entrada es un integer
            Arrays.sort(in);
            return in[0];
        }

        if(in[0] instanceof Long){
            //el elemento de entrada es un long
            Arrays.sort(in);
            return in[0];
        }

        if(in[0] instanceof Float){
            //el elemento de entrada es un double
            Arrays.sort(in);
            return in[0];
        }

        if(in[0] instanceof Double){
            //el elemento de entrada es un double
            Arrays.sort(in);
            return in[0];
        }

        throw new UnsupportedOperationException();
    }

    public static <T> T min(List<T> in) throws InElementNullException{

        if(in == null || in.size() == 0){
            //lanza exception
            throw new InElementNullException("El elemento de entrada es nulo");
        }

        if(in.size() == 1) return in.get(0);

        if(in.get(0) instanceof Byte){
            Collections.sort((LinkedList<Byte>)in);
            return (T) ((LinkedList<Byte>) in).getFirst();
        }

        if(in.get(0) instanceof Integer){
            //el elemento de entrada es un integer
            Collections.sort((LinkedList<Integer>)in);
            return (T) ((LinkedList<Integer>) in).getFirst();
        }

        if(in.get(0) instanceof Long){
            //el elemento de entrada es un long
            Collections.sort((LinkedList<Long>)in);
            return (T) ((LinkedList<Long>) in).getFirst();
        }

        if(in.get(0) instanceof Float){
            //el elemento de entrada es un double
            Collections.sort((LinkedList<Float>)in);
            return (T) ((LinkedList<Float>) in).getFirst();
        }

        if(in.get(0) instanceof Double){
            //el elemento de entrada es un double
            Collections.sort((LinkedList<Double>)in);
            return (T) ((LinkedList<Double>) in).getFirst();
        }

        throw new UnsupportedOperationException();
    }
}
