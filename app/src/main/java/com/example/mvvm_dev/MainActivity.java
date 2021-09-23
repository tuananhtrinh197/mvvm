package com.example.mvvm_dev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvvm_dev.Adapter.MainAdapter;
import com.example.mvvm_dev.Model.Data_GetInfoCLPharmacy;
import com.example.mvvm_dev.Model.GetInfoCLPharmacy_showpictures;
import com.example.mvvm_dev.Service.Retrofit_Resutl;
import com.example.mvvm_dev.Service.Retrofit_Url;
import com.example.mvvm_dev.databinding.ActivityMainBinding;
import com.example.mvvm_dev.viewModel.ItemMainViewModel;
import com.example.mvvm_dev.viewModel.MainViewModel;
import com.example.mvvm_dev.viewModel.MainViewModelContract;


import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.mvvm_dev.Service.Retrofit_Url.api_retrofit;

public class MainActivity extends AppCompatActivity implements  MainViewModelContract.MainView{
    ActivityMainBinding binding;
    List<Data_GetInfoCLPharmacy> data_getInfoCLPharmacies = new ArrayList<>();
    Context context;
    MainViewModel mainViewModel;
    MainViewModelContract.MainView mMainView =  this;
    MainAdapter adapter;
    ItemMainViewModel itemMainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        context = this;
        Retrofit_Url.api_retrofit = Retrofit_Url.getConnect();
        mainViewModel = new MainViewModel(mMainView, context);
        binding.setMainViewModel(mainViewModel);
        binding.content.home.setOnClickListener(v -> onBackPressed());
        LoadData();
    }
    public void LoadData(){
        JSONObject param = new JSONObject();
        try {
            //      param.put("?User=","13689");
            String params = "13689";
            //  RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"),param.toString());
            Call<GetInfoCLPharmacy_showpictures> call = api_retrofit.getData(params);
            try {
                call.enqueue(new Callback<GetInfoCLPharmacy_showpictures>() {
                    @Override
                    public void onResponse(Call<GetInfoCLPharmacy_showpictures> call, Response<GetInfoCLPharmacy_showpictures> response) {
                        data_getInfoCLPharmacies.clear();
                        if (response.body() != null) {
                            data_getInfoCLPharmacies.addAll(response.body().getData());
                            ///   itemMainViewModel= new ItemMainViewModel(data_getInfoCLPharmacies,context);
                            adapter = new MainAdapter(context,data_getInfoCLPharmacies);
                            binding.listviewMain.setAdapter(adapter);
                        }else {
                            // ShowDialog("Lỗi"+":"+""+response.code());
                        }
                    }

                    @Override
                    public void onFailure(Call<GetInfoCLPharmacy_showpictures> call, Throwable t) {
                        Toast.makeText(context,""+call.request().body(),Toast.LENGTH_SHORT);
                    }
                });
            }catch (Exception ex){
                ex.getMessage();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void loadData(List<Data_GetInfoCLPharmacy> list) {

    }

    @Override
    public Context getContext() {
        return MainActivity.this;
    }
}