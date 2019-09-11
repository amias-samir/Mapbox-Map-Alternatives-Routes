package com.naxa.np.myapplication.constants;

import android.Manifest;

public class Constants {

    public Constants() {
    }

    public class PermissionID {
        public static final int RC_STORAGE = 1994;
        public static final int RC_CAMERA= 1995;
        public static final int RC_LOCATION= 1996;
    }

    public class Permission {
        public static final String CAMERA = Manifest.permission.CAMERA;
        public static final String STORAGE_WRITE = Manifest.permission.WRITE_EXTERNAL_STORAGE;
        public static final String STORAGE_READ = Manifest.permission.READ_EXTERNAL_STORAGE;
        public static final String LOCATION_FINE = Manifest.permission.ACCESS_FINE_LOCATION;
        public static final String LOCATION_COURSE = Manifest.permission.ACCESS_COARSE_LOCATION;
    }

    public class MapKey {
        public static final  String mapBoxApiKey = "pk.eyJ1IjoicGVhY2VuZXBhbCIsImEiOiJjajZhYzJ4ZmoxMWt4MzJsZ2NnMmpsejl4In0.rb2hYqaioM1-09E83J-SaA";
        public static final int GEOPOINT_RESULT_CODE = 1994;
        public static final String MAP_BASE_LAYER = "base_layer";
        public static final String MAP_OVERLAY_LAYER = "overlay_layer";
        public static final String MAP_BOARDER_OVERLAY_LAYER_ID = "boarder_overlay_layer";
        public static final int KEY_STREET = 0 ;
        public static final int KEY_SATELLITE = 1;
        public static final int KEY_OPENSTREET = 2;
        public static final int KEY_CHANGUNARAYAN_BOARDER = 3;
        public static final int GPS_REQUEST = 101;
        public static final int KEY_NAGARKOT_BOARDER = 4;
    }

}
