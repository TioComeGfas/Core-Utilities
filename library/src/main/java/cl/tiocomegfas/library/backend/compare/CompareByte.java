package cl.tiocomegfas.library.backend.compare;

import java.util.Arrays;

import cl.tiocomegfas.library.backend.exception.CompareByteException;
import cl.tiocomegfas.library.backend.exception.UtilityException;

public class CompareByte implements Comparable<Byte> {

    public static CompareByte newInstance(){
        return new CompareByte();
    }

    @Override
    public Byte maximo(Byte a, Byte b) {
        return (byte) Math.max(a,b);
    }

    @Override
    public Byte maximo(Byte[] a) throws UtilityException {
        if(a == null) throw new CompareByteException("El arreglo es nulo");
        if(a.length == 0) throw new CompareByteException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        Arrays.sort(a);
        return a[a.length-1];
    }

    @Override
    public Byte minimo(Byte a, Byte b) {
        return (byte) Math.min(a,b);
    }

    @Override
    public Byte minimo(Byte[] a) throws UtilityException {
        if(a == null) throw new CompareByteException("El arreglo es nulo");
        if(a.length == 0) throw new CompareByteException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        Arrays.sort(a);
        return a[0];
    }

    @Override
    public Byte promedio(Byte a, Byte b) {
        return (byte) ((a+b)/2);
    }

    @Override
    public Byte promedio(Byte[] a) throws UtilityException {
        if(a == null) throw new CompareByteException("El arreglo es nulo");
        if(a.length == 0) throw new CompareByteException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        byte prom = 0;
        for (Byte number : a) {
            prom += number;
        }

        return (byte) (prom/a.length);
    }
}
