package cl.tiocomegfas.library.backend.parser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import cl.tiocomegfas.library.backend.exception.UtilityException;

public class DateUtils {

    public static Date parse(String date, String format){
        if(date == null) return null;

        try{
            return new SimpleDateFormat(format, Locale.getDefault()).parse(date);
        }catch (ParseException e){
            e.printStackTrace();
            return null;
        }
    }

    public static String parse(Date date,String format){
        return new SimpleDateFormat(format, Locale.getDefault()).format(date);
    }

    public static Date changeSecond(Date date, int second){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, second);
        return calendar.getTime();
    }

    public static Date changeMinute(Date date, int minute){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minute);
        return calendar.getTime();
    }

    public static Date changeHour(Date date, int hour){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR , hour);
        return calendar.getTime();
    }

    public static Date changeDay(Date date, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, day);
        return calendar.getTime();
    }

    public static Date changeMonth(Date date, int month){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    public static Date changeYear(Date date, int year){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, year);
        return calendar.getTime();
    }
}
