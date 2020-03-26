package cl.tiocomegfas.library.backend.convert;

import cl.tiocomegfas.library.backend.exception.ParseBooleanException;
import cl.tiocomegfas.library.backend.exception.UtilityException;

public class ParseBoolean implements Converter<Boolean> {

    public static ParseBoolean newInstance(){
        return new ParseBoolean();
    }

    @Override
    public Boolean parse(String value) throws UtilityException {
        if(value.equalsIgnoreCase("true")) return true;
        else if(value.equalsIgnoreCase("false")) return false;

        throw new ParseBooleanException();
    }

    @Override
    public Boolean parse(Integer value) {
        return value > 0;
    }

    @Override
    public Boolean parse(Long value) {
        return value > 0;
    }

    @Override
    public Boolean parse(Double value) {
        return value > 0;
    }

    @Override
    public Boolean parse(Float value) {
        return value > 0;
    }

    @Override
    @Deprecated
    public Boolean parse(Boolean value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Boolean parse(Byte value) {
        return value > 0;
    }
}
