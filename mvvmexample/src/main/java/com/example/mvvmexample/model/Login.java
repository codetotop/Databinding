package com.example.mvvmexample.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Login implements Serializable {

    @SerializedName("username")
    public String username;
}
