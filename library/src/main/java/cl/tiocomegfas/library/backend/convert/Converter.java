package cl.tiocomegfas.library.backend.convert;

import cl.tiocomegfas.library.backend.exception.UtilityException;

public interface Converter<T> {

    public T parse(String value) throws UtilityException;
    public T parse(Integer value);
    public T parse(Long value);
    public T parse(Double value);
    public T parse(Float value);
    public T parse(Boolean value);
    public T parse(Byte value);
}
