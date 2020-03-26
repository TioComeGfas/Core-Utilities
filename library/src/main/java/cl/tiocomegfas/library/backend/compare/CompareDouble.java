package cl.tiocomegfas.library.backend.compare;

import java.util.Arrays;

import cl.tiocomegfas.library.backend.exception.CompareDoubleException;
import cl.tiocomegfas.library.backend.exception.CompareIntegerException;
import cl.tiocomegfas.library.backend.exception.UtilityException;

public class CompareDouble implements Comparable<Double> {

    public static CompareDouble newInstance(){
        return new CompareDouble();
    }

    @Override
    public Double maximo(Double a, Double b) {
        return Math.max(a,b);
    }

    @Override
    public Double maximo(Double... a) throws UtilityException {
        if(a == null) throw new CompareDoubleException("El arreglo es nulo");
        if(a.length == 0) throw new CompareDoubleException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        Arrays.sort(a);
        return a[a.length-1];
    }

    @Override
    public Double minimo(Double a, Double b) {
        return Math.min(a,b);
    }

    @Override
    public Double minimo(Double... a) throws UtilityException {
        if(a == null) throw new CompareDoubleException("El arreglo es nulo");
        if(a.length == 0) throw new CompareDoubleException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        Arrays.sort(a);
        return a[0];
    }

    @Override
    public Double promedio(Double a, Double b) {
        double prom = a + b;
        return prom /2;
    }

    @Override
    public Double promedio(Double... a) throws UtilityException {
        if(a == null) throw new CompareIntegerException("El arreglo es nulo");
        if(a.length == 0) throw new CompareIntegerException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        double prom = 0;
        for (Double number : a) {
            prom += number;
        }

        return prom/a.length;
    }
}
