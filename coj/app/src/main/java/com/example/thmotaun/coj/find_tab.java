package com.example.thmotaun.coj;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by thmotaun on 2017/11/10.
 */

public class find_tab extends Fragment implements OnMapReadyCallback {

    Spinner spinner, spinner2;

    private GoogleMap jozi_map, regionA_map, regionB_map, regionC_map, regionD_map, regionE_map, regionG_map;
    private Marker jozi_mark, region_A_mark, region_B_mark, region_C_mark, region_D_mark, region_E_mark, region_G_mark, jozi_pol_mark, region_A_pol_mark, region_B_pol_mark, region_C_pol_mark, region_D_pol_mark, region_E_pol_mark, region_G_pol_mark;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.find_tab, container, false);

        spinner = rootView.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.areas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner2 = rootView.findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getActivity(), R.array.services, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        /*jozi_mark.setVisible(false);
        region_A_mark.setVisible(false);
        region_B_mark.setVisible(false);
        region_C_mark.setVisible(false);
        region_D_mark.setVisible(false);
        region_E_mark.setVisible(false);
        region_G_mark.setVisible(false);*/

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                if (pos == 0) {
                    /*Toast.makeText(getActivity(), "Clicked Jozi", Toast.LENGTH_LONG).show();
                    jozi_mark.setVisible(true);
                    region_A_mark.setVisible(false);
                    region_B_mark.setVisible(false);
                    region_C_mark.setVisible(false);
                    region_D_mark.setVisible(false);
                    region_E_mark.setVisible(false);
                    region_G_mark.setVisible(false);*/
                    getJoziMuni();
                    //getPolice();
                } else if (pos == 1) {
                    /*Toast.makeText(getActivity(), "Clicked A", Toast.LENGTH_LONG).show();
                    jozi_mark.setVisible(false);
                    region_A_mark.setVisible(true);
                    region_B_mark.setVisible(false);
                    region_C_mark.setVisible(false);
                    region_D_mark.setVisible(false);
                    region_E_mark.setVisible(false);
                    region_G_mark.setVisible(false);*/
                    getRegionA();
                } else if (pos == 2) {
                    /*Toast.makeText(getActivity(), "Clicked B", Toast.LENGTH_LONG).show();
                    jozi_mark.setVisible(false);
                    region_A_mark.setVisible(false);
                    region_B_mark.setVisible(false);
                    region_C_mark.setVisible(false);
                    region_D_mark.setVisible(false);
                    region_E_mark.setVisible(false);
                    region_G_mark.setVisible(false);*/
                    getRegionB();
                } else if (pos == 3) {
                    /*Toast.makeText(getActivity(), "Clicked C", Toast.LENGTH_LONG).show();
                    jozi_mark.setVisible(false);
                    region_A_mark.setVisible(false);
                    region_B_mark.setVisible(true);
                    region_C_mark.setVisible(false);
                    region_D_mark.setVisible(false);
                    region_E_mark.setVisible(false);
                    region_G_mark.setVisible(false);*/
                    getRegionC();
                } else if (pos == 4) {
                    /*Toast.makeText(getActivity(), "Clicked D", Toast.LENGTH_LONG).show();
                    jozi_mark.setVisible(false);
                    region_A_mark.setVisible(false);
                    region_B_mark.setVisible(false);
                    region_C_mark.setVisible(true);
                    region_D_mark.setVisible(false);
                    region_E_mark.setVisible(false);
                    region_G_mark.setVisible(false);*/
                    getRegionD();
                } else if (pos == 5) {
                    /*Toast.makeText(getActivity(), "Clicked E", Toast.LENGTH_LONG).show();
                    jozi_mark.setVisible(false);
                    region_A_mark.setVisible(false);
                    region_B_mark.setVisible(false);
                    region_C_mark.setVisible(false);
                    region_D_mark.setVisible(true);
                    region_E_mark.setVisible(false);
                    region_G_mark.setVisible(false);*/
                    getRegionE();
                } else if (pos == 6) {
                    /*Toast.makeText(getActivity(), "Clicked F", Toast.LENGTH_LONG).show();
                    jozi_mark.setVisible(false);
                    region_A_mark.setVisible(false);
                    region_B_mark.setVisible(false);
                    region_C_mark.setVisible(false);
                    region_D_mark.setVisible(false);
                    region_E_mark.setVisible(true);
                    region_G_mark.setVisible(false);*/
                    getRegionF();
                } else if (pos == 7) {
                    /*Toast.makeText(getActivity(), "Clicked G", Toast.LENGTH_LONG).show();
                    jozi_mark.setVisible(false);
                    region_A_mark.setVisible(false);
                    region_B_mark.setVisible(false);
                    region_C_mark.setVisible(false);
                    region_D_mark.setVisible(false);
                    region_E_mark.setVisible(false);
                    region_G_mark.setVisible(true);*/
                    getRegionG();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        SupportMapFragment mapFragment = (SupportMapFragment) this.getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        return rootView;
    }

    public void onMapReady(GoogleMap googleMap) {

        jozi_map = googleMap;
        regionA_map = googleMap;
        regionB_map = googleMap;
        regionC_map = googleMap;
        regionD_map = googleMap;
        regionE_map = googleMap;
        regionG_map = googleMap;

        getJoziMuni();
        getRegionA();
        getRegionB();
        getRegionC();
        getRegionD();
        getRegionE();
        getRegionG();
        //getPolice();
    }

    public void getJoziMuni() {
        jozi_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));
        jozi_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2507239, 28.088367999999946))
                .title("South Hills Housing")
                .snippet("cnr Lindley & Geneva Streets, South Hills"));
        jozi_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2320092, 28.030075699999998))
                .title("Reuven Customer Service Centre")
                .snippet("40 Heronmere Road, Booysens"));
        jozi_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.20051, 28.040899999999965))
                .title("CJ Cronje Building")
                .snippet("80 Loveday Street, Marshalltown"));
        region_A_mark = regionA_map.addMarker(new MarkerOptions()
                .position(new LatLng(-25.9623919, 28.133946400000013))
                .title("Midrand Customer Service Centre")
                .snippet("300 15th Road, Randjespark, Midrand")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        region_A_mark = regionA_map.addMarker(new MarkerOptions()
                .position(new LatLng(-25.9973681, 28.178768200000036))
                .title("Ebony Park Customer Services Centre")
                .snippet("1605 Acacia Street, Ebony Park, Midrand"));
        region_A_mark = regionA_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.002219, 28.20186799999999))
                .title("Diepsloot Customer Service Centre")
                .snippet("383 Ngonyama Road, Ivory Park, Midrand"));
        /*map.addMarker(new MarkerOptions()
                    .position(new LatLng(-26.19216, 28.03756999999996))
                    .title("Revenue Shared Services Centre")
                    .snippet("61 Jorissen Street, Braamfontein"));
                map.addMarker(new MarkerOptions()
                    .position(new LatLng(-26.1915065, 28.039094400000067))
                    .title("City Offices Headquarters")
                    .snippet("158 Civic Boulevard, Braamfontein"));
                map.addMarker(new MarkerOptions()
                    .position(new LatLng(-26.19216, 28.03756999999996))
                    .title("Revenue Shared Services Centre")
                    .snippet("61 Jorissen Street, Braamfontein"));*/
        region_B_mark = regionB_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.0933847, 28.00640169999997))
                .title("Randburg Customer Service Centre")
                .snippet("cnr Bram Fischer Drive and Jan Smuts Avenue, Randburg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        region_B_mark = regionB_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2129792, 27.977525600000035))
                .title("Riverlea Customer Service Centre")
                .snippet("Colarado Drive, Riverlea"));
        region_B_mark = regionB_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1764042, 27.95693879999999))
                .title("Claremont Customer Service Centre")
                .snippet("100 Clemont street, Claremont"));
        region_B_mark = regionB_map.addMarker(new MarkerOptions()
                .position(new LatLng(-25.94208, 28.12609999999995))
                .title("Vrededorp Customer Service Centre")
                .snippet("3 Sonneblom street, Vrededorp"));
        /* map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1915065, 28.039094400000067))
                .title("City Offices Headquarters")
                .snippet("158 Civic Boulevard, Braamfontein"));*/
        region_C_mark = regionC_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1541854, 27.900909800000022))
                .title("Roodepoort Civic Centre")
                .snippet("100 Christiaan De Wet Road, Florida Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        region_C_mark = regionC_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.160224, 27.866736899999978))
                .title("Roodepoort City Hall")
                .snippet("Berlandina St & Dieperink St, Roodepoort"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.22332, 27.86315000000002))
                .title("Dobsonville Customer Service Centre")
                .snippet("2332 Luthuli St, Dobsonville, Soweto")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.250871, 27.854747999999972))
                .title("Jabulani Civic Centre")
                .snippet("1 Koma St, Jabulani, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.239991, 27.838217999999983))
                .title("Zola Customer Service Centre")
                .snippet("3700 Masizakhe St, Zola, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2552832, 27.877862800000003))
                .title("Moroka / Jabavu Customer Service Centre")
                .snippet("1235 Mlangeni St, Jabavu, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2725901, 27.864703299999974))
                .title("Senaoane Customer Service Centre")
                .snippet("448 Mabalane St, Senaoane, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.280195, 27.87097300000005))
                .title("Chiawelo Customer Service Centre")
                .snippet("989 Tshabuse St, Chiawelo, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2713479, 27.836824999999976))
                .title("Protea North Customer Service Centre")
                .snippet("299/49 Kunene St, Protea North, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2373619, 27.928367999999978))
                .title("Orlando East Customer Service Centre")
                .snippet("1425 Sofasonke St, Orlando East, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2255691, 27.904954999999973))
                .title("Orlando West Customer Service Centre")
                .snippet("Pela St, Meadowlands East, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2677886, 27.903157400000055))
                .title("Pimville Customer Service Centre")
                .snippet("2943 Modjaji St, Pimville Zone 7, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2606293, 27.885369200000014))
                .title("Mofolo Customer Service Centre")
                .snippet("666 Elias Motsoaledi Rd, Mofolo South, Soweto"));
        /*map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));*/
        region_E_mark = regionE_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.10929, 28.096035400000005))
                .title("Alexandra Community Centre")
                .snippet("Roosevelt St & 8th Ave, Alexandra"));
        region_E_mark = regionE_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1032265, 28.15508049999994))
                .title("Modderfontein Customer Service Centre")
                .snippet("Thornhill Rd, Thornhill Estate, Lethabong"));
        region_E_mark = regionE_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.10037999999999, 28.06308999999999))
                .title("Sandton Customer Service Centre")
                .snippet("137 Daisy St, Sandown, Sandton")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        region_G_mark = regionG_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.320135, 27.825444699999935))
                .title("Lenasia Civic Centre")
                .snippet("Eland St & Rose Ave, Lenasia")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        region_G_mark = regionG_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.4022429, 27.830284300000017))
                .title("Ennerdale Customer Service Centre")
                .snippet("Katz Rd & Street B/ Smith Walk, Ennerdale"));
        region_G_mark = regionG_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2906631, 27.90190659999996))
                .title("Eldorado Park Customer Service Centre")
                .snippet("4046 Link Crescent Avenue, Eldorado Park, Soweto"));
        /*map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1915065, 28.039094400000067))
                .title("City Offices Headquarters")
                .snippet("158 Civic Boulevard, Braamfontein"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));*/
        jozi_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1918251, 28.03931160000002))
                .title("Metropolitan Civic Centre")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
                .snippet("158 Loveday Street, Braamfontein"));
        jozi_map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-26.1918251, 28.03931160000002), 9));
    }

    public void getRegionA()
    {
        region_A_mark = regionA_map.addMarker(new MarkerOptions()
                .position(new LatLng(-25.9973681, 28.178768200000036))
                .title("Ebony Park Customer Services Centre")
                .snippet("1605 Acacia Street, Ebony Park, Midrand"));
        region_A_mark = regionA_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.002219, 28.20186799999999))
                .title("Diepsloot Customer Service Centre")
                .snippet("383 Ngonyama Road, Ivory Park, Midrand"));
        region_A_mark = regionA_map.addMarker(new MarkerOptions()
            .position(new LatLng(-25.9623919, 28.133946400000013))
            .title("Midrand Customer Service Centre")
            .snippet("300 15th Road, Randjespark, Midrand")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        regionA_map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-25.9623919, 28.133946400000013), 11));
        /*map.addMarker(new MarkerOptions()
                    .position(new LatLng(-26.19216, 28.03756999999996))
                    .title("Revenue Shared Services Centre")
                    .snippet("61 Jorissen Street, Braamfontein"));
                map.addMarker(new MarkerOptions()
                    .position(new LatLng(-26.1915065, 28.039094400000067))
                    .title("City Offices Headquarters")
                    .snippet("158 Civic Boulevard, Braamfontein"));
                map.addMarker(new MarkerOptions()
                    .position(new LatLng(-26.19216, 28.03756999999996))
                    .title("Revenue Shared Services Centre")
                    .snippet("61 Jorissen Street, Braamfontein"));*/
    }

    public void getRegionB() {

        region_B_mark = regionB_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2129792, 27.977525600000035))
                .title("Riverlea Customer Service Centre")
                .snippet("Colarado Drive, Riverlea"));
        region_B_mark = regionB_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1764042, 27.95693879999999))
                .title("Claremont Customer Service Centre")
                .snippet("100 Clemont street, Claremont"));
        region_B_mark = regionB_map.addMarker(new MarkerOptions()
                .position(new LatLng(-25.94208, 28.12609999999995))
                .title("Vrededorp Customer Service Centre")
                .snippet("3 Sonneblom street, Vrededorp"));
        region_B_mark = regionB_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.0933847, 28.00640169999997))
                .title("Randburg Customer Service Centre")
                .snippet("cnr Bram Fischer Drive and Jan Smuts Avenue, Randburg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        regionB_map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-26.0933847, 28.00640169999997), 11));
        /* map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1915065, 28.039094400000067))
                .title("City Offices Headquarters")
                .snippet("158 Civic Boulevard, Braamfontein"));*/
    }

    public void getRegionC() {

        region_C_mark = regionC_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.160224, 27.866736899999978))
                .title("Roodepoort City Hall")
                .snippet("Berlandina St & Dieperink St, Roodepoort"));
        region_C_mark = regionC_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1541854, 27.900909800000022))
                .title("Roodepoort Civic Centre")
                .snippet("100 Christiaan De Wet Road, Florida Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        regionC_map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-26.1541854, 27.900909800000022), 12));
    }

    public void getRegionD() {
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.250871, 27.854747999999972))
                .title("Jabulani Civic Centre")
                .snippet("1 Koma St, Jabulani, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.239991, 27.838217999999983))
                .title("Zola Customer Service Centre")
                .snippet("3700 Masizakhe St, Zola, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2552832, 27.877862800000003))
                .title("Moroka / Jabavu Customer Service Centre")
                .snippet("1235 Mlangeni St, Jabavu, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2725901, 27.864703299999974))
                .title("Senaoane Customer Service Centre")
                .snippet("448 Mabalane St, Senaoane, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.280195, 27.87097300000005))
                .title("Chiawelo Customer Service Centre")
                .snippet("989 Tshabuse St, Chiawelo, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2713479, 27.836824999999976))
                .title("Protea North Customer Service Centre")
                .snippet("299/49 Kunene St, Protea North, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2373619, 27.928367999999978))
                .title("Orlando East Customer Service Centre")
                .snippet("1425 Sofasonke St, Orlando East, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2255691, 27.904954999999973))
                .title("Orlando West Customer Service Centre")
                .snippet("Pela St, Meadowlands East, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2677886, 27.903157400000055))
                .title("Pimville Customer Service Centre")
                .snippet("2943 Modjaji St, Pimville Zone 7, Soweto"));
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2606293, 27.885369200000014))
                .title("Mofolo Customer Service Centre")
                .snippet("666 Elias Motsoaledi Rd, Mofolo South, Soweto"));
        /*map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));*/
        region_D_mark = regionD_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.22332, 27.86315000000002))
                .title("Dobsonville Customer Service Centre")
                .snippet("2332 Luthuli St, Dobsonville, Soweto")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        regionD_map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-26.22332, 27.86315000000002), 11));
    }

    public void getRegionE() {
        region_E_mark = regionE_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.10929, 28.096035400000005))
                .title("Alexandra Community Centre")
                .snippet("Roosevelt St & 8th Ave, Alexandra"));
        region_E_mark = regionE_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1032265, 28.15508049999994))
                .title("Modderfontein Customer Service Centre")
                .snippet("Thornhill Rd, Thornhill Estate, Lethabong"));
        region_E_mark = regionE_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.10037999999999, 28.06308999999999))
                .title("Sandton Customer Service Centre")
                .snippet("137 Daisy St, Sandown, Sandton")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        regionE_map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-26.10037999999999, 28.06308999999999), 11));
    }

    public void getRegionF() {
        jozi_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));
        jozi_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2507239, 28.088367999999946))
                .title("South Hills Housing")
                .snippet("cnr Lindley & Geneva Streets, South Hills"));
        jozi_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2320092, 28.030075699999998))
                .title("Reuven Customer Service Centre")
                .snippet("40 Heronmere Road, Booysens"));
        jozi_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.20051, 28.040899999999965))
                .title("CJ Cronje Building")
                .snippet("80 Loveday Street, Marshalltown"));
        jozi_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1918251, 28.03931160000002))
                .title("Metropolitan Civic Centre")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
                .snippet("158 Loveday Street, Braamfontein"));
        jozi_map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-26.1918251, 28.03931160000002), 11));
    }

    public void getRegionG() {

        region_G_mark = regionG_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.4022429, 27.830284300000017))
                .title("Ennerdale Customer Service Centre")
                .snippet("Katz Rd & Street B/ Smith Walk, Ennerdale"));
        region_G_mark = regionG_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2906631, 27.90190659999996))
                .title("Eldorado Park Customer Service Centre")
                .snippet("4046 Link Crescent Avenue, Eldorado Park, Soweto"));
        region_G_mark = regionG_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.320135, 27.825444699999935))
                .title("Lenasia Civic Centre")
                .snippet("Eland St & Rose Ave, Lenasia")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        regionG_map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-26.320135, 27.825444699999935), 11));
        /*map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1915065, 28.039094400000067))
                .title("City Offices Headquarters")
                .snippet("158 Civic Boulevard, Braamfontein"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));*/
    }

    /*public void getHosp()
    {
        region_G_mark = regionG_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.2906631, 28.04255009999997))
                .title("Zuzimpilo Clinic")
                .snippet("59 Joubert Street, Johannesburg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        region_G_mark = regionG_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1748446, 28.04563889999997))
                .title("Charlotte Maxeke Johannesburg Academic Hospital")
                .snippet("Jubilee Rd, Parktown, Johannesburg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        region_G_mark = regionG_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.320135, 27.825444699999935))
                .title("Lenasia Civic Centre")
                .snippet("Eland St & Rose Ave, Lenasia")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        regionG_map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-26.320135, 27.825444699999935), 11));
        /*map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1915065, 28.039094400000067))
                .title("City Offices Headquarters")
                .snippet("158 Civic Boulevard, Braamfontein"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));
    }*/

    public void getPolice()
    {
        region_G_pol_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1877846, 28.044955200000004))
                .title("Hillbrow SAPS")
                .snippet("01 Clarendon Pl, Hillbrow, Johannesburg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        region_G_pol_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1596319, 28.02675099999999))
                .title("Parkview SAPS")
                .snippet("71 Dundalk Ave, Parkview, Johannesburg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        region_G_pol_mark = jozi_map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1831956, 28.062251999999944))
                .title("Yeoville SAPS")
                .snippet("51 Becker St, Yeoville, Johannesburg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        jozi_map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-26.1918251, 28.03931160000002), 11));
        /*map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.1915065, 28.039094400000067))
                .title("City Offices Headquarters")
                .snippet("158 Civic Boulevard, Braamfontein"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-26.19216, 28.03756999999996))
                .title("Revenue Shared Services Centre")
                .snippet("61 Jorissen Street, Braamfontein"));*/
    }
}
