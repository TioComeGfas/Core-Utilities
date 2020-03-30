package cl.tiocomegfas.library.backend.convert;

import org.junit.BeforeClass;
import org.junit.Test;

import cl.tiocomegfas.library.backend.exception.UtilityException;

import static org.junit.Assert.assertEquals;

public class TestParseBoolean {

    static ParseBoolean parser;

    @BeforeClass
    public static void init(){
        parser = parser.newInstance();
    }

    @Test
    public void parseStringFalse() throws UtilityException {
        boolean respuesta = parser.parse("false");
        boolean esperado = false;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void parseStringTrue() throws UtilityException {
        boolean respuesta = parser.parse("true");
        boolean esperado = true;
        assertEquals(esperado,respuesta);
    }

    @Test(expected = UtilityException.class)
    public void parseStringException() throws UtilityException {
        parser.parse("error");
    }

    @Test
    public void parseIntTrue(){
        boolean respuesta = parser.parse(1);
        boolean esperado = true;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void parseIntFalse(){
        boolean respuesta = parser.parse(0);
        boolean esperado = false;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void parseLongTrue(){
        boolean respuesta = parser.parse(100);
        boolean esperado = true;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void parseLongFalse(){
        boolean respuesta = parser.parse(-1);
        boolean esperado = false;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void parseDoubleTrue(){
        boolean respuesta = parser.parse(100d);
        boolean esperado = true;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void parseDoubleFalse(){
        boolean respuesta = parser.parse(-100d);
        boolean esperado = false;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void parseFloatTrue(){
        boolean respuesta = parser.parse(100f);
        boolean esperado = true;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void parseFloatFalse(){
        boolean respuesta = parser.parse(-100f);
        boolean esperado = false;
        assertEquals(esperado,respuesta);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void parseBooleanException(){
        parser.parse(true);
    }

    @Test
    public void parseByteTrue(){
        boolean respuesta = parser.parse(100);
        boolean esperado = true;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void parseByteFalse(){
        boolean respuesta = parser.parse(-100);
        boolean esperado = false;
        assertEquals(esperado,respuesta);
    }

}
