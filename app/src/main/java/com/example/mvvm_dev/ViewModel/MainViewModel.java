package com.example.mvvm_dev.ViewModel;

import android.content.Context;

import com.example.mvvm_dev.Model.Data_GetInfoCLPharmacy;
import com.example.mvvm_dev.Service.Retrofit_Resutl;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.mvvm_dev.Service.Retrofit_Url.api_retrofit;

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
