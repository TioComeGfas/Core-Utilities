package cl.tiocomegfas.library.backend.transform;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import cl.tiocomegfas.library.backend.constant.FormatDate;
import cl.tiocomegfas.library.backend.exception.ParseDateException;
import cl.tiocomegfas.library.backend.exception.UtilityException;

public class ParseDate implements Transform<Date>,FormatDate{

    public static ParseDate newInstance(){
        return new ParseDate();
    }

    @Override
    public Date parse(String fecha) throws UtilityException {
        if(fecha == null) return null;

        try{
            return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(fecha);
        }catch (ParseException e){
            e.printStackTrace();
            throw new ParseDateException();
        }
    }

    @Override
    public Date parse(String fecha, String format) throws UtilityException {
        if(fecha == null) return null;

        if(!format.equalsIgnoreCase(YYYY_MM_DD_GUION) &&
                !format.equalsIgnoreCase(YYYY_MM_DD_BACKLASH) &&
                !format.equalsIgnoreCase(YYYY_MM_DD_HH_MM_SS_GUION) &&
                !format.equalsIgnoreCase(YYYY_MM_DD_HH_MM_SS_BACKLASH)){
            throw new ParseDateException("Formato es invalido");
        }

        try{
            return new SimpleDateFormat(format, Locale.getDefault()).parse(fecha);
        }catch (ParseException e){
            e.printStackTrace();
            throw new ParseDateException();
        }
    }

    @Override
    @Deprecated
    public Date parse(Date fecha) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public Date parse(Date fecha, String format) {
        throw new UnsupportedOperationException();
    }
}
