package cl.tiocomegfas.library.backend.convert;

import android.text.TextUtils;

import cl.tiocomegfas.library.backend.exception.ParseIntegerException;
import cl.tiocomegfas.library.backend.exception.UtilityException;

public class ParseInteger implements Converter<Integer> {

    public static ParseInteger newInstance(){
        return new ParseInteger();
    }

    @Override
    public Integer parse(String value) throws UtilityException {

        if(TextUtils.isDigitsOnly(value)){
            try{
                return Integer.parseInt(value);
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
        throw new ParseIntegerException();
    }

    @Override
    @Deprecated
    public Integer parse(Integer value){
        throw new UnsupportedOperationException();
    }

    @Override
    public Integer parse(Long value) {
        return value.intValue();
    }

    @Override
    public Integer parse(Double value) {
        return value.intValue();
    }

    @Override
    public Integer parse(Float value) {
        return value.intValue();
    }

    @Override
    public Integer parse(Boolean value) {
        if(value) return 1;
        return 0;
    }

    @Override
    public Integer parse(Byte value) {
        return value.intValue();
    }
}
