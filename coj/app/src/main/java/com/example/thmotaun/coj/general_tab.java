package com.example.thmotaun.coj;

import android.content.Context;
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

import android.widget.TextView;

import com.mindorks.placeholderview.ExpandablePlaceHolderView;
import com.mindorks.placeholderview.Utils;

/**
 * Created by thmotaun on 2017/11/10.
 */

public class general_tab extends Fragment {

    private ExpandablePlaceHolderView mExpandableView;
    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.general_tab, container, false);
        /*mContext = this.getContext();
        mExpandableView = rootView.findViewById(R.id.expandableView);

        for(general_feed feed : general_utils.loadFeeds(this.getContext())){
            mExpandableView.addView(new general_heading_view(mContext, feed.getHeading()));
            for(general_info info : feed.getInfoList()){
                mExpandableView.addView(new general_info_view(mContext, info));
            }
        }*/
        return rootView;
    }
}
