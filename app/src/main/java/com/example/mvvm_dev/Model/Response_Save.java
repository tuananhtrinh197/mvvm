package com.example.mvvm_dev.Model;

import java.util.List;

public class Response_Save {
   private int status;
   private String message;
   private List<Response_Save_Data> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Response_Save_Data> getData() {
        return data;
    }

    public void setData(List<Response_Save_Data> data) {
        this.data = data;
    }
}
