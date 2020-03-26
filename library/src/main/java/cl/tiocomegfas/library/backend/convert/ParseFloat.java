package cl.tiocomegfas.library.backend.convert;

import android.text.TextUtils;

import cl.tiocomegfas.library.backend.exception.ParseFloatException;
import cl.tiocomegfas.library.backend.exception.UtilityException;

public class ParseFloat implements Converter<Float> {

    public static ParseFloat newInstance(){
        return new ParseFloat();
    }

    @Override
    public Float parse(String value) throws UtilityException {
        if(TextUtils.isDigitsOnly(value)){
            try{
                return Float.parseFloat(value);
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
        throw new ParseFloatException();
    }

    @Override
    public Float parse(Integer value) {
        return value.floatValue();
    }

    @Override
    public Float parse(Long value) {
        return value.floatValue();
    }

    @Override
    public Float parse(Double value) {
        return value.floatValue();
    }

    @Override
    @Deprecated
    public Float parse(Float value) {
        throw new UnsupportedOperationException();
    }

    @Override

    public Float parse(Boolean value) {
        if(value) return 1F;
        return 0F;
    }

    @Override
    public Float parse(Byte value) {
        return value.floatValue();
    }
}
