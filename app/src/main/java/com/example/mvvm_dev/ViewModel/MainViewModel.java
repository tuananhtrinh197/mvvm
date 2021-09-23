package com.example.mvvm_dev.viewModel;

import android.content.Context;

import com.example.mvvm_dev.Model.Data_GetInfoCLPharmacy;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel implements MainViewModelContract.ViewModel {

    private MainViewModelContract.MainView mMainView;
    private Context mContext;
    List<Data_GetInfoCLPharmacy> data_getInfoCLPharmacies = new ArrayList<>();

    public MainViewModel(MainViewModelContract.MainView mMainView, Context mContext) {
        this.mMainView = mMainView;
        this.mContext = mContext;
    }

    @Override
    public void destroy() {

    }
}
