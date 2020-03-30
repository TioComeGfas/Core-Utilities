package cl.tiocomegfas.library.backend.compare;

import org.junit.BeforeClass;
import org.junit.Test;

import cl.tiocomegfas.library.backend.exception.UtilityException;

import static org.junit.Assert.assertEquals;

public class TestCompareFloat {

    static CompareFloat compare;
    Float[] array = {1f,2f,3f,4f,5f,6f};

    @BeforeClass
    public static void init(){
        compare = compare.newInstance();
    }

    @Test
    public void testMax(){
        float respuesta = compare.maximo(array[0],array[1]);
        float esperado = 2;
        assertEquals(esperado,respuesta,0.5);
    }

    @Test
    public void testMaxArray() throws UtilityException {
        float respuesta = compare.maximo(array);
        float esperado = 6;
        assertEquals(esperado,respuesta,0.5);
    }

    @Test
    public void testMin(){
        float respuesta = compare.minimo(array[0],array[1]);
        float esperado = 1;
        assertEquals(esperado,respuesta,0.5);
    }

    @Test
    public void testMinArray() throws UtilityException {
        float respuesta = compare.minimo(array);
        float esperado = 1;
        assertEquals(esperado,respuesta,0.5);
    }

    @Test
    public void testProm(){
        float respuesta = compare.promedio(array[1],array[3]);
        float esperado = 3;
        assertEquals(esperado,respuesta,0.5);
    }

    @Test
    public void testPromArray() throws UtilityException {
        float respuesta = compare.promedio(array);
        float esperado = 3;
        assertEquals(esperado,respuesta,0.5);
    }

    @Test(expected = UtilityException.class)
    public void testMaxNullArray() throws UtilityException {
        compare.maximo(null);
    }

    @Test(expected = UtilityException.class)
    public void testMaxEmptyArray() throws UtilityException {
        Float[] arreglo = {};
        compare.maximo(arreglo);
    }

    @Test(expected = UtilityException.class)
    public void testMinNullArray() throws UtilityException {
        compare.minimo(null);
    }

    @Test(expected = UtilityException.class)
    public void testMinEmptyArray() throws UtilityException {
        Float[] arreglo = {};
        compare.minimo(arreglo);
    }

    @Test(expected = UtilityException.class)
    public void testPromNullArray() throws UtilityException {
        compare.promedio(null);
    }

    @Test(expected = UtilityException.class)
    public void testPromEmptyArray() throws UtilityException {
        Float[] arreglo = {};
        compare.promedio(arreglo);
    }
}
