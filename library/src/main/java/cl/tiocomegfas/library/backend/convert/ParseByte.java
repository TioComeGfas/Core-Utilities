package cl.tiocomegfas.library.backend.convert;

import android.text.TextUtils;

import cl.tiocomegfas.library.backend.exception.ParseByteException;
import cl.tiocomegfas.library.backend.exception.UtilityException;

public class ParseByte implements Converter<Byte> {

    public static ParseByte newInstance(){
        return new ParseByte();
    }

    @Override
    public Byte parse(String value) throws UtilityException {
        if(TextUtils.isDigitsOnly(value)){
            try{
                return Byte.parseByte(value);
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
        throw new ParseByteException("No es posible convertir el String a Byte");
    }

    @Override
    public Byte parse(Integer value) {
        return value.byteValue();
    }

    @Override
    public Byte parse(Long value) {
        return value.byteValue();
    }

    @Override
    public Byte parse(Double value) {
        return value.byteValue();
    }

    @Override
    public Byte parse(Float value) {
        return value.byteValue();
    }

    @Override
    public Byte parse(Boolean value) {
        if(value) return 1;
        return 0;
    }

    @Override
    @Deprecated
    public Byte parse(Byte value) {
        throw new UnsupportedOperationException();
    }

}
