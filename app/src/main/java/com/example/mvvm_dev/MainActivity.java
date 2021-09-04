package com.example.mvvm_dev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;

import com.example.mvvm_dev.Model.Data_GetInfoCLPharmacy;
import com.example.mvvm_dev.Service.Retrofit_Resutl;
import com.example.mvvm_dev.ViewModel.MainViewModel;
import com.example.mvvm_dev.ViewModel.MainViewModelContract;
import com.example.mvvm_dev.databinding.ActivityMainBinding;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.mvvm_dev.Service.Retrofit_Url.api_retrofit;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    List<Data_GetInfoCLPharmacy> data_getInfoCLPharmacies = new ArrayList<>();
    Context context;
    MainViewModel mainViewModel;
    private MainViewModelContract.MainView mMainView = (MainViewModelContract.MainView) this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        context = this;
        LoadData();
        mainViewModel = new MainViewModel(mMainView, context);
        binding.setMainViewModel(mainViewModel);
    }
    public void LoadData(){
        JSONObject param = new JSONObject();
        try {
            param.put("?User=","Usercode");

            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"),param.toString());
            Call<Retrofit_Resutl> call = api_retrofit.getData(requestBody);
            call.enqueue(new Callback<Retrofit_Resutl>() {
                @Override
                public void onResponse(Call<Retrofit_Resutl> call, Response<Retrofit_Resutl> response) {
                    data_getInfoCLPharmacies.clear();
                    if (response.body() != null) {
                    data_getInfoCLPharmacies.addAll(response.body().getResult_data().get(0).getData());

                    }else {
                       // ShowDialog("Lỗi"+":"+""+response.code());
                    }
                }

                @Override
                public void onFailure(Call<Retrofit_Resutl> call, Throwable t) {

                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}