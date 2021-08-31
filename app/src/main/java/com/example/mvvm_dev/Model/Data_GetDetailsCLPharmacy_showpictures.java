package com.example.mvvm_dev.Model;

import java.util.ArrayList;
import java.util.List;

public class Data_GetDetailsCLPharmacy_showpictures {
    List<Details_Header> Header = new ArrayList<>();
    List<Details_Content> Details = new ArrayList<>();

    public List<Details_Header> getHeader() {
        return Header;
    }

    public void setHeader(List<Details_Header> header) {
        Header = header;
    }

    public List<Details_Content> getDetails() {
        return Details;
    }

    public void setDetails(List<Details_Content> details) {
        Details = details;
    }
}
