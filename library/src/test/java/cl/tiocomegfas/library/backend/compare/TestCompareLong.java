package cl.tiocomegfas.library.backend.compare;

import org.junit.BeforeClass;
import org.junit.Test;

import cl.tiocomegfas.library.backend.exception.UtilityException;

import static org.junit.Assert.assertEquals;

public class TestCompareLong {

    static CompareLong compare;
    Long[] array = {1l,2l,3l,4l,5l,6l};

    @BeforeClass
    public static void init(){
        compare = compare.newInstance();
    }

    @Test
    public void testMax(){
        long respuesta = compare.maximo(array[0],array[1]);
        long esperado = 2;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testMaxArray() throws UtilityException {
        long respuesta = compare.maximo(array);
        long esperado = 6;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testMin(){
        long respuesta = compare.minimo(array[0],array[1]);
        long esperado = 1;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testMinArray() throws UtilityException {
        long respuesta = compare.minimo(array);
        long esperado = 1;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testProm(){
        long respuesta = compare.promedio(array[1],array[3]);
        long esperado = 3;
        assertEquals(esperado,respuesta);
    }

    @Test
    public void testPromArray() throws UtilityException {
        long respuesta = compare.promedio(array);
        long esperado = 3;
        assertEquals(esperado,respuesta);
    }

    @Test(expected = UtilityException.class)
    public void testMaxNullArray() throws UtilityException {
        compare.maximo(null);
    }

    @Test(expected = UtilityException.class)
    public void testMaxEmptyArray() throws UtilityException {
        Long[] arreglo = {};
        compare.maximo(arreglo);
    }

    @Test(expected = UtilityException.class)
    public void testMinNullArray() throws UtilityException {
        compare.minimo(null);
    }

    @Test(expected = UtilityException.class)
    public void testMinEmptyArray() throws UtilityException {
        Long[] arreglo = {};
        compare.minimo(arreglo);
    }

    @Test(expected = UtilityException.class)
    public void testPromNullArray() throws UtilityException {
        compare.promedio(null);
    }

    @Test(expected = UtilityException.class)
    public void testPromEmptyArray() throws UtilityException {
        Long[] arreglo = {};
        compare.promedio(arreglo);
    }
}
