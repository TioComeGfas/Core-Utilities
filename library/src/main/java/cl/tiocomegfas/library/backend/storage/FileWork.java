package cl.tiocomegfas.library.backend.storage;

import android.content.Context;
import android.graphics.Bitmap;

import com.snatik.storage.Storable;
import com.snatik.storage.Storage;

import java.io.File;

public class FileWork {

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
}
