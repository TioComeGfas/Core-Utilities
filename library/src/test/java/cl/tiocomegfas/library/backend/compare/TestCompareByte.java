package cl.tiocomegfas.library.backend.compare;

import org.junit.BeforeClass;
import org.junit.Test;

import cl.tiocomegfas.library.backend.exception.UtilityException;

import static org.junit.Assert.*;

public class TestCompareByte {

    static CompareByte compare;
    Byte[] array = {1,2,3,4,5,6};

    @BeforeClass
    public static void init(){
        compare = compare.newInstance();
    }

    @Test
    public void testMax(){
        byte respuesta = compare.maximo(array[0],array[1]);
        byte esperado = 2;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testMaxArray() throws UtilityException {
        byte respuesta = compare.maximo(array);
        byte esperado = 6;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testMin(){
        byte respuesta = compare.minimo(array[0],array[1]);
        byte esperado = 1;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testMinArray() throws UtilityException {
        byte respuesta = compare.minimo(array);
        byte esperado = 1;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testProm(){
        byte respuesta = compare.promedio(array[1],array[3]);
        byte esperado = 3;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testPromArray() throws UtilityException {
        byte respuesta = compare.promedio(array);
        byte esperado = 3;
        assertEquals(esperado,respuesta);
    }

    @Test(expected = UtilityException.class)
    public void testMaxNullArray() throws UtilityException {
        compare.maximo(null);
    }

    @Test(expected = UtilityException.class)
    public void testMaxEmptyArray() throws UtilityException {
        Byte[] arreglo = {};
        compare.maximo(arreglo);
    }

    @Test(expected = UtilityException.class)
    public void testMinNullArray() throws UtilityException {
        compare.minimo(null);
    }

    @Test(expected = UtilityException.class)
    public void testMinEmptyArray() throws UtilityException {
        Byte[] arreglo = {};
        compare.minimo(arreglo);
    }

    @Test(expected = UtilityException.class)
    public void testPromNullArray() throws UtilityException {
        compare.promedio(null);
    }

    @Test(expected = UtilityException.class)
    public void testPromEmptyArray() throws UtilityException {
        Byte[] arreglo = {};
        compare.promedio(arreglo);
    }
}
