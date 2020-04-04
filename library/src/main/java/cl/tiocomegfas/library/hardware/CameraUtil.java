package cl.tiocomegfas.library.hardware;

import android.Manifest;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.Uri;
import android.provider.MediaStore;

import androidx.core.app.ActivityCompat;

import cl.tiocomegfas.library.hardware.exception.CameraException;

public class CameraUtil {

    public static boolean checkPermission(Context context){
        return ActivityCompat.checkSelfPermission(context, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED;
    }

    public static Uri startCamera(Context context, Activity activity, String namePhoto, int codeRequest){
        ContentValues values = new ContentValues();
        values.put(MediaStore.Images.Media.TITLE, namePhoto);
        values.put(MediaStore.Images.Media.DESCRIPTION, "foto de reporte");
        Uri imageUri = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
        activity.startActivityForResult(intent,codeRequest);
        return imageUri;
    }

    public static Bitmap getImage(Context context, Uri uri, int width, int height){
        Bitmap cs;
        Bitmap foto;
        float borde;

        cs = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

        Canvas comboImage = new Canvas(cs);
        comboImage.drawColor(Color.WHITE);

        try {
            Bitmap thumbnail = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);

            if (thumbnail.getWidth() > width) {
                foto = Bitmap.createScaledBitmap(thumbnail, width, (thumbnail.getHeight() * width / thumbnail.getWidth()), true);
            } else {
                foto = thumbnail;
            }

            borde = ((width - foto.getWidth()) / 2);
            comboImage.drawBitmap(foto, borde, 0, null);

        } catch (Exception e) {
            e.printStackTrace();
            throw new CameraException();
        }
        return foto;
    }

}
