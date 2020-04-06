package cl.tiocomegfas.library.backend.storage;

import android.content.Context;
import android.graphics.Bitmap;

import com.snatik.storage.Storable;
import com.snatik.storage.Storage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

public class FileUtil {

    public static boolean exist(Context context, String path){
        return new Storage(context).isFileExist(path);
    }

    public static boolean create(Context context, String path,String content){
        return new Storage(context).createFile(path,content);
    }

    public static boolean create(Context context, String path, Bitmap bitmap){
        return new Storage(context).createFile(path,bitmap);
    }

    public static boolean create(Context context, String path, byte[] array){
        return new Storage(context).createFile(path,array);
    }

    public static boolean delete(Context context, String path){
        return new Storage(context).deleteFile(path);
    }

    public static boolean rename(Context context,String path,String newName){
        return new Storage(context).getFile(path).renameTo(new File(newName));
    }

    public static String readFile(String path) throws IOException{

        File file = new File(path);

        if (file.exists()) {
            StringBuilder str = new StringBuilder();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while( (line = br.readLine()) != null ){
                str.append(line);
            }
            br.close();
            return str.toString();
        }

        throw new FileNotFoundException();
    }

    public static void writeFile(String path, String data) throws IOException{

        File file = new File(path);

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(data);
        bw.flush();
        bw.close();
    }
}
