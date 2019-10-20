package com.gka.gkamobile.models;

import java.io.Serializable;

public class Content implements Serializable {

    private String access_token;

    public Content() {
    }

    public Content(String access_token) {
        this.access_token = access_token;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    @Override
    public String toString() {
        return "Content{" +
                "access_token='" + access_token + '\'' +
                '}';
    }
}
