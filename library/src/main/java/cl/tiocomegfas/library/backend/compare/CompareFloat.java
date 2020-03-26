package cl.tiocomegfas.library.backend.compare;

import java.util.Arrays;

import cl.tiocomegfas.library.backend.exception.CompareFloatException;
import cl.tiocomegfas.library.backend.exception.UtilityException;

public class CompareFloat implements Comparable<Float>{

    public static CompareFloat newInstance(){
        return new CompareFloat();
    }

    @Override
    public Float maximo(Float a, Float b) {
        return Math.max(a,b);
    }

    @Override
    public Float maximo(Float... a) throws UtilityException {
        if(a == null) throw new CompareFloatException("El arreglo es nulo");
        if(a.length == 0) throw new CompareFloatException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        Arrays.sort(a);
        return a[a.length-1];
    }

    @Override
    public Float minimo(Float a, Float b) {
        return Math.min(a,b);
    }

    @Override
    public Float minimo(Float... a) throws UtilityException {
        if(a == null) throw new CompareFloatException("El arreglo es nulo");
        if(a.length == 0) throw new CompareFloatException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        Arrays.sort(a);
        return a[0];
    }

    @Override
    public Float promedio(Float a, Float b) {
        return (a+b)/2;
    }

    @Override
    public Float promedio(Float... a) throws UtilityException {
        if(a == null) throw new CompareFloatException("El arreglo es nulo");
        if(a.length == 0) throw new CompareFloatException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        float prom = 0;
        for (Float number : a) {
            prom += number;
        }

        return prom/a.length;
    }
}
