package com.tusharahmed.simplequizzapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Animal implements Serializable {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("rulling")
    @Expose
    private Integer rulling;
    @SerializedName("reason")
    @Expose
    private String reason;
    @SerializedName("contents")
    @Expose
    private String contents;
    @SerializedName("featured")
    @Expose
    private String featured;

    public Animal(Integer id, String name, String _class, Integer rulling, String reason, String contents, String featured) {
        this.id = id;
        this.name = name;
        this._class = _class;
        this.rulling = rulling;
        this.reason = reason;
        this.contents = contents;
        this.featured = featured;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public Integer getRulling() {
        return rulling;
    }

    public void setRulling(Integer rulling) {
        this.rulling = rulling;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getFeatured() {
        return featured;
    }

    public void setFeatured(String featured) {
        this.featured = featured;
    }


}