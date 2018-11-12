package com.example.thmotaun.coj;

/**
 * Created by thmotaun on 2017/11/11.
 */
import android.app.ListActivity;
import android.widget.ArrayAdapter;
import android.os.AsyncTask;
import android.widget.ListView;

import java.util.ArrayList;

public class TwitterAsyncTask extends AsyncTask<Object, Void, ArrayList<TwitterTweet>> {
    ListActivity callerActivity;

    final static String TWITTER_API_KEY = "funtww56NFuYAqGoxVj4nEWN5";
    final static String TWITTER_API_SECRET = "OQCiQ775x8nQoSPiHLbY5YcEAePDxf4esAc4b1AKD6lumqpKnr";

    @Override
    protected ArrayList<TwitterTweet> doInBackground(Object... params) {
        ArrayList<TwitterTweet> twitterTweets = null;
        callerActivity = (ListActivity) params[1];
        if (params.length > 0) {
            TwitterAPI twitterAPI = new TwitterAPI(TWITTER_API_KEY,TWITTER_API_SECRET);
            twitterTweets = twitterAPI.getTwitterTweets(params[0].toString());
        }
        return twitterTweets;
    }

    @Override
    protected void onPostExecute(ArrayList<TwitterTweet> twitterTweets) {
        ArrayAdapter<TwitterTweet> adapter =
                new ArrayAdapter<TwitterTweet>(callerActivity, R.layout.find_tab,
                        R.id.listTextView, twitterTweets);
        callerActivity.setListAdapter(adapter);
        ListView lv = callerActivity.getListView();
        lv.setDividerHeight(0);
        lv.setBackgroundColor(callerActivity.getResources().getColor(R.color.white));
    }
}