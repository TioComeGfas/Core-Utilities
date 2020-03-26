package cl.tiocomegfas.library.backend.compress;

import java.io.File;

public class Zip implements Compress {

    public static Zip newInstance(){
        return new Zip();
    }

    @Override
    public String compress(File file, String name) {
        return null;
    }

    @Override
    public String compress(File file) {
        return null;
    }

    @Override
    public String decompress(File file, String name) {
        return null;
    }

    @Override
    public String decompress(File file) {
        return null;
    }
}
