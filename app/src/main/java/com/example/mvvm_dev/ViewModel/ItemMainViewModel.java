package com.example.mvvm_dev.viewModel;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BaseObservable;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.example.mvvm_dev.Model.Data_GetInfoCLPharmacy;

public class ItemMainViewModel extends BaseObservable {
    private Data_GetInfoCLPharmacy data;
    private Context context;

    public ItemMainViewModel(Data_GetInfoCLPharmacy data, Context context) {
        this.data = data;
        this.context = context;
    }

    public  String getTextDate(){
        return data.getTitle();
    }
    public  String getNguoiXuly(){
        return  data.getAssignerName();
    }
    public String getNgayTao(){
        return  data.getTimeCreate();
    }
    public String getTinhTrangDuyet(){

        return data.getStatusRequestName();
    }
    public String getTrangThaiCal(){
        return data.getStatusApproveName();
    }
    public String getColorTinhTrangDuyet(){
        if(data.getStatusApproveName().equalsIgnoreCase("Duyệt")){
            return "#04A861";
        }else if (data.getStatusApproveName().equalsIgnoreCase("Chờ duyệt")){
            return  "#666666";
        }else if (data.getStatusApproveName().equalsIgnoreCase("Từ chối")) {
            return "#FF0000";
        }else {
            return "#424242";
        }
    }
    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }

    public void onItemClick(View view) {

    }

    public void setData(Data_GetInfoCLPharmacy data) {
        this.data = data;
    }

}
