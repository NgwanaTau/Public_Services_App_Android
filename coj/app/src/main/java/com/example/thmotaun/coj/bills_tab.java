package com.example.thmotaun.coj;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

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

public class bills_tab extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.bills_tab, container, false);
        final Button btn_bill, btn_prep;

        btn_bill = rootView.findViewById(R.id.button14);
        btn_bill.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), billActivity.class);
                startActivity(intent);
            }
        });

        btn_prep = rootView.findViewById(R.id.button12);
        btn_prep.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), prepaidActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
