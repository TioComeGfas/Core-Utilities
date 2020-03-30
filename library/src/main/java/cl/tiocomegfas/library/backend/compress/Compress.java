package cl.tiocomegfas.library.backend.compress;

import java.io.File;

import cl.tiocomegfas.library.backend.exception.UtilityException;

public interface Compress {

    public String compress(File file) throws UtilityException;

    public String decompress(File file,String name) throws UtilityException;
    public String decompress(File file) throws UtilityException;
}
