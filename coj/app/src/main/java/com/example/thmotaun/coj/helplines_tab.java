package com.example.thmotaun.coj;

import android.content.Intent;
import android.net.Uri;
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
import android.widget.Toast;

/**
 * Created by thmotaun on 2017/11/10.
 */

public class helplines_tab extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.helplines_tab, container, false);

        final Button btn_emerg, btn_lawe, btn_fire, btn_anti, btn_emerg_con, btn_revn, btn_stat, btn_hous, btn_watr, btn_sold, btn_req;

        btn_emerg = rootView.findViewById(R.id.emerg);
        btn_emerg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Describe:" +
                        "The nature of the emergency.\n" +
                        "Exact location of the incident and nearby landmarks).\n" +
                        "Details of injuries and possible suspects.\n" +
                        "Personal information.", Toast.LENGTH_LONG).show();
                Intent DialIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:0113755911"));
                DialIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(DialIntent);
            }
        });
        btn_lawe = rootView.findViewById(R.id.lawe);
        btn_lawe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Describe:" +
                        "The nature of the emergency.\n" +
                        "Exact location of the incident and nearby landmarks).\n" +
                        "Details of injuries and possible suspects.\n" +
                        "Personal information.", Toast.LENGTH_LONG).show();
                Intent DialIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:10111"));
                DialIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(DialIntent);
            }
        });
        btn_fire = rootView.findViewById(R.id.fire);
        btn_fire.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Describe:" +
                        "The nature of the emergency.\n" +
                        "Exact location of the incident and nearby landmarks).\n" +
                        "Details of injuries and possible suspects.\n" +
                        "Personal information.", Toast.LENGTH_LONG).show();
                Intent DialIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:112"));
                DialIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(DialIntent);
            }
        });
        btn_emerg_con = rootView.findViewById(R.id.emerg_con);
        btn_emerg_con.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent DialIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:0113755911"));
                DialIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(DialIntent);
            }
        });
        btn_revn = rootView.findViewById(R.id.revn);
        btn_revn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent DialIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:0860562874"));
                DialIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(DialIntent);
            }
        });
        btn_watr = rootView.findViewById(R.id.watr);
        btn_watr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent DialIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:0116881400"));
                DialIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(DialIntent);
            }
        });
        /*btn_stat = rootView.findViewById(R.id.button7);
        btn_stat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent DialIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:5551212"));
                DialIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(DialIntent);
            }
        });*/
        btn_anti = rootView.findViewById(R.id.anti);
        btn_anti.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent DialIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:0860562874"));
                DialIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(DialIntent);
            }
        });

        return rootView;
    }
}
