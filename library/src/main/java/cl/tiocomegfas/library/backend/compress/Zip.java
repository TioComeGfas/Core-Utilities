package cl.tiocomegfas.library.backend.compress;

import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import cl.tiocomegfas.library.backend.exception.UtilityException;

public class Zip {

    public static String compress(File file) throws UtilityException {
        if (file.exists()) { // valida si existe el directorio
            File[] ficheros = file.listFiles(); // lista los archivos que hay dentro del directorio

            Log.i("Compresion","Número de ficheros encontrados: " + ficheros.length);

            for (int i = 0; i < ficheros.length; i++) { // ciclo para recorrer todos los archivos a comprimir
                Log.i("Compresion","Nombre del fichero: " + ficheros[i].getName());
                String extension = "";
                for (int j = 0; j < ficheros[i].getName().length(); j++) {
                    if (ficheros[i].getName().charAt(j) == '.') { //obtiene la extensión del archivo
                        extension = ficheros[i].getName().substring(j, (int) ficheros[i].getName().length());
                    }
                }
                try {
                    // crea un buffer temporal para ir poniendo los archivos a comprimir
                    ZipOutputStream zous = new ZipOutputStream(new FileOutputStream(file.getPath() + ficheros[i].getName().replace(extension, ".zip")));

                    //nombre con el que se va guardar el archivo dentro del zip
                    ZipEntry entrada = new ZipEntry(ficheros[i].getName());
                    zous.putNextEntry(entrada);

                    Log.i("Compresion","Comprimiendo.....");
                    //obtiene el archivo para irlo comprimiendo
                    FileInputStream fis = new FileInputStream(file.getPath() + entrada.getName());
                    int leer;
                    byte[] buffer = new byte[1024];
                    while (0 < (leer = fis.read(buffer))) {
                        zous.write(buffer, 0, leer);
                    }
                    fis.close();
                    zous.closeEntry();
                    zous.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new UtilityException("Error al comprimir el archivo");
                }
            }
        } else {
            throw new UtilityException("No se encontró el directorio..");
        }
        return file.getPath();
    }

    public static String decompress(File file, String name) throws UtilityException {
        if (file.exists()) {
            try {
                //crea un buffer temporal para el archivo que se va descomprimir
                ZipInputStream zis = new ZipInputStream(new FileInputStream(file.getPath() + "/" + name));

                ZipEntry salida;
                while (null != (salida = zis.getNextEntry())) {
                    Log.i("Descomprencion", "archivo: " + salida.getName());
                    FileOutputStream fos = new FileOutputStream(file.getPath() + "/" + salida.getName());
                    int leer;
                    byte[] buffer = new byte[1024];
                    while (0 < (leer = zis.read(buffer))) {
                        fos.write(buffer, 0, leer);
                    }
                    fos.close();
                    zis.closeEntry();
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new UtilityException("Error al descomprimir el archivo");
            }
        } else {
            throw new UtilityException("No se encontró el directorio..");
        }
        return file.getPath()+"/";
    }

    public static String decompress(File file) throws UtilityException {
        if (file.exists()) {
            try {
                //crea un buffer temporal para el archivo que se va descomprimir
                ZipInputStream zis = new ZipInputStream(new FileInputStream(file.getPath()));

                ZipEntry salida;
                while (null != (salida = zis.getNextEntry())) {
                    Log.i("Descomprencion", "archivo: " + salida.getName());
                    FileOutputStream fos = new FileOutputStream(file.getPath() + "/" + salida.getName());
                    int leer;
                    byte[] buffer = new byte[1024];
                    while (0 < (leer = zis.read(buffer))) {
                        fos.write(buffer, 0, leer);
                    }
                    fos.close();
                    zis.closeEntry();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new UtilityException("No se encontró el directorio..");
        }
        return file.getPath()+"/";
    }
}
