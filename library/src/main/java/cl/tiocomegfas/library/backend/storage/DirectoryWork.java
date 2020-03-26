package cl.tiocomegfas.library.backend.storage;

import android.content.Context;

import com.snatik.storage.Storage;

import java.io.File;
import java.util.List;

public class DirectoryWork {

    public static boolean exist(Context context, String path){
        return new Storage(context).isDirectoryExists(path);
    }

    public static List<File> listFiles(Context context, String path){
        return new Storage(context).getFiles(path);
    }

    public static boolean create(Context context, String path){
        return new Storage(context).createDirectory(path,false);
    }

    public static boolean create(Context context, String path,boolean override){
        return new Storage(context).createDirectory(path,override);
    }

    public static boolean delete(Context context, String path){
        return new Storage(context).deleteDirectory(path);
    }

    public static boolean rename(Context context,String oldPath,String newPath){
        return new Storage(context).rename(oldPath,newPath);
    }
}
