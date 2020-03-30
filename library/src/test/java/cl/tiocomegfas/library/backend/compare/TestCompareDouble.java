package cl.tiocomegfas.library.backend.compare;

import org.junit.BeforeClass;
import org.junit.Test;

import cl.tiocomegfas.library.backend.exception.UtilityException;

import static org.junit.Assert.assertEquals;

public class TestCompareDouble {

    static CompareDouble compare;
    Double[] array = {1d,2d,3d,4d,5d,6d};

    @BeforeClass
    public static void init(){
        compare = compare.newInstance();
    }

    @Test
    public void testMax(){
        double respuesta = compare.maximo(array[0],array[1]);
        double esperado = 2;
        assertEquals(esperado,respuesta,0.5);
    }

    @Test
    public void testMaxArray() throws UtilityException {
        double respuesta = compare.maximo(array);
        double esperado = 6;
        assertEquals(esperado,respuesta,0.5);
    }

    @Test
    public void testMin(){
        double respuesta = compare.minimo(array[0],array[1]);
        double esperado = 1;
        assertEquals(esperado,respuesta,0.5);
    }

    @Test
    public void testMinArray() throws UtilityException {
        double respuesta = compare.minimo(array);
        double esperado = 1;
        assertEquals(esperado,respuesta,0.5);
    }

    @Test
    public void testProm(){
        double respuesta = compare.promedio(array[1],array[3]);
        double esperado = 3;
        assertEquals(esperado,respuesta,0.5);
    }

    @Test
    public void testPromArray() throws UtilityException {
        double respuesta = compare.promedio(array);
        double esperado = 3;
        assertEquals(esperado,respuesta,0.5);
    }

    @Test(expected = UtilityException.class)
    public void testMaxNullArray() throws UtilityException {
        compare.maximo(null);
    }

    @Test(expected = UtilityException.class)
    public void testMaxEmptyArray() throws UtilityException {
        Double[] arreglo = {};
        compare.maximo(arreglo);
    }

    @Test(expected = UtilityException.class)
    public void testMinNullArray() throws UtilityException {
        compare.minimo(null);
    }

    @Test(expected = UtilityException.class)
    public void testMinEmptyArray() throws UtilityException {
        Double[] arreglo = {};
        compare.minimo(arreglo);
    }

    @Test(expected = UtilityException.class)
    public void testPromNullArray() throws UtilityException {
        compare.promedio(null);
    }

    @Test(expected = UtilityException.class)
    public void testPromEmptyArray() throws UtilityException {
        Double[] arreglo = {};
        compare.promedio(arreglo);
    }

}
