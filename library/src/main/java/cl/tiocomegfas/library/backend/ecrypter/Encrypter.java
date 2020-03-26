package cl.tiocomegfas.library.backend.ecrypter;

public interface Encrypter {

    // decodificacion
    public String decode(String value64);

    // codificacion
    public String encode(String value);
    public String encode(int value);
    public String encode(double value);
    public String encode(float value);
    public String encode(boolean value);
    public String encode(long value);
}
