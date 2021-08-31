package com.example.mvvm_dev.Model;

import java.util.List;

public class GetInfoCLPharmacy_showpictures {
    private  int status;
    private String message;
    private List<Data_GetInfoCLPharmacy> data;


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

    public List<Data_GetInfoCLPharmacy> getData() {
        return data;
    }

    public void setData(List<Data_GetInfoCLPharmacy> data) {
        this.data = data;
    }


}
