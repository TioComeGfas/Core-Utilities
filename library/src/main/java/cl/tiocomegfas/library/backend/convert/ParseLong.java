package cl.tiocomegfas.library.backend.convert;

import android.text.TextUtils;

import cl.tiocomegfas.library.backend.exception.ParseLongException;
import cl.tiocomegfas.library.backend.exception.UtilityException;

public class ParseLong implements Converter<Long> {

    public static ParseLong newInstance(){
        return new ParseLong();
    }

    @Override
    public Long parse(String value) throws UtilityException {
        if(TextUtils.isDigitsOnly(value)){
            try{
                return Long.parseLong(value);
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
        throw new ParseLongException();
    }

    @Override
    public Long parse(Integer value) {
        return value.longValue();
    }

    @Override
    @Deprecated
    public Long parse(Long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Long parse(Double value) {
        return value.longValue();
    }

    @Override
    public Long parse(Float value) {
        return value.longValue();
    }

    @Override
    public Long parse(Boolean value) {
        if(value) return 1L;
        return 0L;
    }

    @Override
    public Long parse(Byte value) {
        return value.longValue();
    }
}
