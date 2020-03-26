package cl.tiocomegfas.library.backend.compare;

import cl.tiocomegfas.library.backend.exception.UtilityException;

public interface Comparable<T> {

    public T maximo(T a,T b);

    public T maximo(T... a) throws UtilityException;

    public T minimo(T a,T b);

    public T minimo(T... a) throws UtilityException;

    public T promedio(T a,T b);

    public T promedio(T... a) throws UtilityException;
}
