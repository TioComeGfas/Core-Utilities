package cl.tiocomegfas.library.backend.transform;

import java.util.Date;

import cl.tiocomegfas.library.backend.exception.UtilityException;

public interface Transform<T> {

    public T parse(String fecha) throws UtilityException;

    public T parse(String fecha,String format) throws UtilityException;

    public T parse(Date fecha) throws UtilityException;

    public T parse(Date fecha,String format) throws UtilityException;
}
