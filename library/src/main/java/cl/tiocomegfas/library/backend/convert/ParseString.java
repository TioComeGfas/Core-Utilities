package cl.tiocomegfas.library.backend.convert;

public class ParseString implements Converter<String> {

    public static ParseString newInstance(){
        return new ParseString();
    }

    @Override
    @Deprecated
    public String parse(String value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String parse(Integer value) {
        return String.valueOf(value);
    }

    @Override
    public String parse(Long value) {
        return String.valueOf(value);
    }

    @Override
    public String parse(Double value) {
        return String.valueOf(value);
    }

    @Override
    public String parse(Float value) {
        return String.valueOf(value);
    }

    @Override
    public String parse(Boolean value) {
        return String.valueOf(value);
    }

    @Override
    public String parse(Byte value) {
        return String.valueOf(value);
    }
}
