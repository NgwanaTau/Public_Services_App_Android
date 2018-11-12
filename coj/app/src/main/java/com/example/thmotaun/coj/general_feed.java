package com.example.thmotaun.coj;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by thmotaun on 2017/11/11.
 */

public class general_feed {

    @SerializedName("category")
    @Expose
    private String heading;

    @SerializedName("data")
    @Expose
    private List<general_info> infoList;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public List<general_info> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<general_info> infoList) {
        this.infoList = infoList;
    }
}
