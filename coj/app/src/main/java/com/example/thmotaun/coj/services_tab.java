package com.example.thmotaun.coj;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;
/**
 * Created by thmotaun on 2017/11/10.
 */

public class services_tab extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.services_tab, container, false);

        final Button btn_road, btn_elec, btn_fire, btn_law, btn_park, btn_traf, btn_stat, btn_hous, btn_watr, btn_sold, btn_req;

        btn_road = rootView.findViewById(R.id.button1);
        btn_road.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), roadsActivity.class);
                startActivity(intent);
            }
        });
        btn_elec = rootView.findViewById(R.id.button2);
        btn_elec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), elecActivity.class);
                startActivity(intent);
            }
        });
        btn_fire = rootView.findViewById(R.id.button3);
        btn_fire.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), fireActivity.class);
                startActivity(intent);
            }
        });
        btn_law = rootView.findViewById(R.id.button4);
        btn_law.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), lawActivity.class);
                startActivity(intent);
            }
        });
        btn_park = rootView.findViewById(R.id.button5);
        btn_park.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), parkActivity.class);
                startActivity(intent);
            }
        });
        btn_traf = rootView.findViewById(R.id.button6);
        btn_traf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), trafActivity.class);
                startActivity(intent);
            }
        });
        btn_stat = rootView.findViewById(R.id.button7);
        btn_stat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), statActivity.class);
                startActivity(intent);
            }
        });
        btn_hous = rootView.findViewById(R.id.button8);
        btn_hous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), housActivity.class);
                startActivity(intent);
            }
        });
        btn_watr = rootView.findViewById(R.id.button9);
        btn_watr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), watrActivity.class);
                startActivity(intent);
            }
        });
        btn_sold = rootView.findViewById(R.id.button10);
        btn_sold.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), soldActivity.class);
                startActivity(intent);
            }
        });
        btn_req = rootView.findViewById(R.id.button11);
        btn_req.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), reqActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
