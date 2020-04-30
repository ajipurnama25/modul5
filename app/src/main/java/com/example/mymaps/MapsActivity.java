package com.example.mymaps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng rumah = new LatLng(-8.6521683,116.524281);
       //add a marker in sekolah
        LatLng sekolah = new LatLng(-8.6493076,116.5140037);
        LatLng s1 = new LatLng(-8.6516312,116.5331789);
        LatLng s2 = new LatLng(-8.6515694,116.5355739);
       //add a market in SPBU
        LatLng pom = new LatLng(-8.6497086,116.5175611);
        LatLng pm1 = new LatLng(-8.6497086,116.5175611);
        LatLng pm2= new LatLng(-8.6327252,116.5019594);
        // marker rumah
        mMap.addMarker(new MarkerOptions().position(rumah).title("rumahku"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rumah));
        // marker sekolah
        mMap.addMarker(new MarkerOptions().position(sekolah).title("sman 2 selong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah));
        mMap.addMarker(new MarkerOptions().position(s1).title("man 1 selong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(s1));
        mMap.addMarker(new MarkerOptions().position(s2).title("sman 3 selong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(s2));
        // marker SPBU
        mMap.addMarker(new MarkerOptions().position(pom).title("PSBU pancor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pom));

        mMap.addMarker(new MarkerOptions().position(pm1).title("PSBU sekarteja"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pm1));

        mMap.addMarker(new MarkerOptions().position(pm2).title("PSBU masbagek"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pm2));


}
}
