package cl.tiocomegfas.library.backend.compress;

import java.io.File;

public interface Compress {

    public String compress(File file,String name);
    public String compress(File file);

    public String decompress(File file,String name);
    public String decompress(File file);
}
