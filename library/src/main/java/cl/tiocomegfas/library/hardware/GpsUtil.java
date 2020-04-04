package cl.tiocomegfas.library.hardware;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;

import androidx.core.app.ActivityCompat;
import androidx.core.content.PermissionChecker;

import cl.tiocomegfas.library.hardware.exception.GpsException;

public class GpsUtil {

    public static final int GPS_DEVICE = 1;
    public static final int GPS_NETWORK = 2;

    public static boolean isEnableGps(Context context) {

        try {
            int gpsSignal = Settings.Secure.getInt(context.getContentResolver(), Settings.Secure.LOCATION_MODE);
            return gpsSignal != 0;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void showConfiguration(Context context) {
        context.startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
    }

    public static boolean checkPermission(Context context) {
        return ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED;
    }

    public static LocationManager startGps(Context context, int modeGps, int timeUpdate, int distanceUpdate, LocationListener listener) throws GpsException {

        if (modeGps != GPS_DEVICE && modeGps != GPS_NETWORK) {
            throw new GpsException("modeGps invalid");
        }

        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            throw new GpsException("Permission not enabled");
        }

        LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);

        if(locationManager == null){
            throw new GpsException("LocationManager is null");
        }

        String mode;

        if(modeGps == GPS_DEVICE){
            mode = LocationManager.GPS_PROVIDER;
        }else{
            mode = LocationManager.NETWORK_PROVIDER;
        }

        locationManager.requestLocationUpdates(mode, timeUpdate, distanceUpdate, listener);

        return locationManager;
    }
}
