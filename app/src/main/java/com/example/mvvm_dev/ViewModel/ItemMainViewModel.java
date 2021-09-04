package com.example.mvvm_dev.ViewModel;

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
    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }

    public void onItemClick(View view) {

    }

    public void setPeople(Data_GetInfoCLPharmacy people) {
        data = people;
    }

}
