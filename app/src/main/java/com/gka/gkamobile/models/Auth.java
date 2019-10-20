package com.gka.gkamobile.models;

import java.io.Serializable;

public class Auth implements Serializable {

    private String code;
    private String message;
    private Content content;

    public Auth() {
    }

    public Auth(String code, String message, Content content) {
        this.code = code;
        this.message = message;
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", content=" + content +
                '}';
    }
}
