package cl.tiocomegfas.library.backend.compare;

import org.junit.BeforeClass;
import org.junit.Test;

import cl.tiocomegfas.library.backend.exception.UtilityException;

import static org.junit.Assert.assertEquals;

public class TestCompareInteger {

    static CompareInteger compare;
    Integer[] array = {1,2,3,4,5,6};

    @BeforeClass
    public static void init(){
        compare = compare.newInstance();
    }

    @Test
    public void testMax(){
        int respuesta = compare.maximo(array[0],array[1]);
        int esperado = 2;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testMaxArray() throws UtilityException {
        int respuesta = compare.maximo(array);
        int esperado = 6;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testMin(){
        int respuesta = compare.minimo(array[0],array[1]);
        int esperado = 1;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testMinArray() throws UtilityException {
        int respuesta = compare.minimo(array);
        int esperado = 1;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testProm(){
        int respuesta = compare.promedio(array[1],array[3]);
        int esperado = 3;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testPromArray() throws UtilityException {
        int respuesta = compare.promedio(array);
        int esperado = 3;
        assertEquals(esperado,respuesta);
    }

    @Test(expected = UtilityException.class)
    public void testMaxNullArray() throws UtilityException {
        compare.maximo(null);
    }

    @Test(expected = UtilityException.class)
    public void testMaxEmptyArray() throws UtilityException {
        Integer[] arreglo = {};
        compare.maximo(arreglo);
    }

    @Test(expected = UtilityException.class)
    public void testMinNullArray() throws UtilityException {
        compare.minimo(null);
    }

    @Test(expected = UtilityException.class)
    public void testMinEmptyArray() throws UtilityException {
        Integer[] arreglo = {};
        compare.minimo(arreglo);
    }

    @Test(expected = UtilityException.class)
    public void testPromNullArray() throws UtilityException {
        compare.promedio(null);
    }

    @Test(expected = UtilityException.class)
    public void testPromEmptyArray() throws UtilityException {
        Integer[] arreglo = {};
        compare.promedio(arreglo);
    }
}
