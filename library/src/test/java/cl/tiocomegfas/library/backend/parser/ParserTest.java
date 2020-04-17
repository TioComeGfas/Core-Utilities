package cl.tiocomegfas.library.backend.parser;

import org.junit.BeforeClass;
import org.junit.Test;

public class ParserTest {

    static int number;

    @BeforeClass
    public static void init(){
        number = 0;
    }

    @Test
    public void parseIntegerToString(){
        System.out.println(Parser.toInteger("90"));
    }
}
