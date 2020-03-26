package cl.tiocomegfas.library.backend.compare;

import java.util.Arrays;

import cl.tiocomegfas.library.backend.exception.CompareIntegerException;
import cl.tiocomegfas.library.backend.exception.UtilityException;

public class CompareInteger implements Comparable<Integer>{

    public static CompareInteger newInstance(){
        return new CompareInteger();
    }

    @Override
    public Integer maximo(Integer a, Integer b) {
        return Math.max(a,b);
    }

    @Override
    public Integer maximo(Integer... a) throws UtilityException {
        if(a == null) throw new CompareIntegerException("El arreglo es nulo");
        if(a.length == 0) throw new CompareIntegerException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        Arrays.sort(a);
        return a[a.length-1];
    }

    @Override
    public Integer minimo(Integer a, Integer b) {
        return Math.min(a,b);
    }

    @Override
    public Integer minimo(Integer... a) throws UtilityException{
        if(a == null) throw new CompareIntegerException("El arreglo es nulo");
        if(a.length == 0) throw new CompareIntegerException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        Arrays.sort(a);
        return a[0];
    }

    @Override
    public Integer promedio(Integer a, Integer b) {
        int prom = a + b;
        return prom /2;
    }

    @Override
    public Integer promedio(Integer... a)throws UtilityException {

        if(a == null) throw new CompareIntegerException("El arreglo es nulo");
        if(a.length == 0) throw new CompareIntegerException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        int prom = 0;
        for (Integer integer : a) {
            prom += integer;
        }

        return prom/a.length;
    }
}
