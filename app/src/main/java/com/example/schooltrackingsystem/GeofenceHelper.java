package com.example.schooltrackingsystem;

import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;

import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.maps.model.LatLng;

public class GeofenceHelper extends ContextWrapper {

    private static final String TAG = "geofenceHelper";
    PendingIntent pendingIntent;

    public GeofenceHelper(Context base) {
        super(base);
    }

    public GeofencingRequest getGeofencingRequest(Geofence geofence){
        return null;
    }

    public Geofence getGeofence(String ID, LatLng latLng, float radius, int transitionTypes){
        return null;
    }

    public PendingIntent getPendingIntent(){
        return pendingIntent;
    }
}
