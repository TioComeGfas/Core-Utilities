package cl.tiocomegfas.library.backend.transform;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import cl.tiocomegfas.library.backend.constant.FormatDate;
import cl.tiocomegfas.library.backend.exception.ParseStringException;
import cl.tiocomegfas.library.backend.exception.UtilityException;

public class ParseString implements Transform<String>, FormatDate {

    public static ParseString newInstance(){
        return new ParseString();
    }

    @Override
    @Deprecated
    public String parse(String fecha){
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public String parse(String fecha, String format){
        throw new UnsupportedOperationException();
    }

    @Override
    public String parse(Date fecha) throws UtilityException {
        if(fecha == null) throw new ParseStringException("La fecha es nula");
        return new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault()).format(fecha);
    }

    @Override
    public String parse(Date fecha, String format) throws UtilityException {
        if(fecha == null) throw new ParseStringException("La fecha es nula");

        if(!format.equalsIgnoreCase(YYYY_MM_DD_GUION) &&
                !format.equalsIgnoreCase(YYYY_MM_DD_BACKLASH) &&
                !format.equalsIgnoreCase(YYYY_MM_DD_HH_MM_SS_GUION) &&
                !format.equalsIgnoreCase(YYYY_MM_DD_HH_MM_SS_BACKLASH)){
            throw new ParseStringException("Formato es invalido");
        }

        return new SimpleDateFormat(format, Locale.getDefault()).format(fecha);
    }
}
