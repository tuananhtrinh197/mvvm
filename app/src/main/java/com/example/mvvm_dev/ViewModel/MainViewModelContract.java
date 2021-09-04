package com.example.mvvm_dev.ViewModel;

import android.content.Context;

import com.example.mvvm_dev.Model.Data_GetInfoCLPharmacy;

import java.util.List;

public interface MainViewModelContract {

    interface MainView{
        void loadData(List<Data_GetInfoCLPharmacy> list);
        Context getContext();
    }
    interface  ViewModel{
        void destroy();
    }
}
