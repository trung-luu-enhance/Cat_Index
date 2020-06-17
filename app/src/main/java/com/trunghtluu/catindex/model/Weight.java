package com.trunghtluu.catindex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weight {
    @SerializedName("imperial")
    @Expose
    private String imperial;
    @SerializedName("metric")
    @Expose
    private String metric;

    public String getImperial() {
        return imperial;
    }

    public void setImperial(String imperial) {
        this.imperial = imperial;
    }

    public Weight withImperial(String imperial) {
        this.imperial = imperial;
        return this;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public Weight withMetric(String metric) {
        this.metric = metric;
        return this;
    }
}
