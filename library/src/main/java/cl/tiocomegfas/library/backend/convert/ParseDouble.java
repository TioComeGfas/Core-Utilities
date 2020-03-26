package cl.tiocomegfas.library.backend.convert;

import android.text.TextUtils;

import cl.tiocomegfas.library.backend.exception.ParseDoubleException;
import cl.tiocomegfas.library.backend.exception.ParseIntegerException;
import cl.tiocomegfas.library.backend.exception.UtilityException;

public class ParseDouble implements Converter<Double> {

    public static ParseDouble newInstance(){
        return new ParseDouble();
    }

    @Override
    public Double parse(String value) throws UtilityException {
        if(TextUtils.isDigitsOnly(value)){
            try{
                return Double.parseDouble(value);
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
        throw new ParseDoubleException();
    }

    @Override
    public Double parse(Integer value) {
        return value.doubleValue();
    }

    @Override
    public Double parse(Long value) {
        return value.doubleValue();
    }

    @Override
    @Deprecated
    public Double parse(Double value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Double parse(Float value) {
        return value.doubleValue();
    }

    @Override
    public Double parse(Boolean value) {
        if(value) return 1d;
        else return 0d;
    }

    @Override
    public Double parse(Byte value) {
        return value.doubleValue();
    }
}
