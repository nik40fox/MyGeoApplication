package com.nikolay.mygeoapplication;

import android.location.Location;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;

/**
 * Created by Nikolay on 01.04.2016.
 */
public class Geolacator implements
        GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener {

        /**
         * Provides the entry point to Google Play services.
         */
        protected GoogleApiClient myGoogleApiClient;





        @Override
        public void onConnected(Bundle bundle) {

        }

        @Override
        public void onConnectionSuspended(int i) {

        }

        @Override
        public void onLocationChanged(Location location) {

        }

        @Override
        public void onConnectionFailed(ConnectionResult connectionResult) {

        }
}
