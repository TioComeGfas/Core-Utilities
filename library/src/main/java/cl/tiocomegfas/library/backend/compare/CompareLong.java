package cl.tiocomegfas.library.backend.compare;

import java.util.Arrays;

import cl.tiocomegfas.library.backend.exception.CompareLongException;
import cl.tiocomegfas.library.backend.exception.UtilityException;
import cl.tiocomegfas.library.backend.shared_preferences.Preferences;

public class CompareLong implements Comparable<Long> {

    public static CompareLong newInstance(){
        return new CompareLong();
    }

    @Override
    public Long maximo(Long a, Long b) {
        return Math.max(a,b);
    }

    @Override
    public Long maximo(Long... a) throws UtilityException {
        if(a == null) throw new CompareLongException("El arreglo es nulo");
        if(a.length == 0) throw new CompareLongException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        Arrays.sort(a);
        return a[a.length-1];
    }

    @Override
    public Long minimo(Long a, Long b) {
        return Math.min(a,b);
    }

    @Override
    public Long minimo(Long... a) throws UtilityException {
        if(a == null) throw new CompareLongException("El arreglo es nulo");
        if(a.length == 0) throw new CompareLongException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        Arrays.sort(a);
        return a[0];
    }

    @Override
    public Long promedio(Long a, Long b) {
        return (a+b)/2;
    }

    @Override
    public Long promedio(Long... a) throws UtilityException {
        if(a == null) throw new CompareLongException("El arreglo es nulo");
        if(a.length == 0) throw new CompareLongException("El arreglo se encuentra vacio");

        if(a.length == 1) return a[0];

        long prom = 0;
        for (Long number : a) {
            prom += number;
        }

        return prom/a.length;
    }
}
