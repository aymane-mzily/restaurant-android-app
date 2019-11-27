package com.aymsou.rstaurantsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Aymane on 5/31/2017.
 */

public class Category {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
