package cl.tiocomegfas.library.backend.ecrypter;

import java.nio.charset.StandardCharsets;

import cl.tiocomegfas.library.backend.convert.ParseString;

public class Base64 implements Encrypter {

    public static Base64 newInstance(){
        return new Base64();
    }

    @Override
    public String decode(String value64) {
        byte[] byteArray = android.util.Base64.decode(value64, android.util.Base64.DEFAULT);
        return new String(byteArray);
    }

    @Override
    public String encode(String value) {
        byte[] str_temp = String.valueOf(value).getBytes(StandardCharsets.UTF_8);
        return android.util.Base64.encodeToString(str_temp, android.util.Base64.DEFAULT);
    }

    @Override
    public String encode(int value) {
        String str = ParseString.newInstance().parse(value);
        return encode(str);
    }

    @Override
    public String encode(double value) {
        String str = ParseString.newInstance().parse(value);
        return encode(str);
    }

    @Override
    public String encode(float value) {
        String str = ParseString.newInstance().parse(value);
        return encode(str);
    }

    @Override
    public String encode(boolean value) {
        String str = ParseString.newInstance().parse(value);
        return encode(str);
    }

    @Override
    public String encode(long value) {
        String str = ParseString.newInstance().parse(value);
        return encode(str);
    }
}
