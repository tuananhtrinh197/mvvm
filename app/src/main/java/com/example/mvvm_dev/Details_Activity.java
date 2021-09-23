package com.example.mvvm_dev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mvvm_dev.Adapter.MainAdapter;
import com.example.mvvm_dev.Model.GetDetailsCLPharmacy_showpictures;
import com.example.mvvm_dev.Model.GetInfoCLPharmacy_showpictures;
import com.example.mvvm_dev.databinding.ActivityDetailsBinding;
import com.google.gson.annotations.Until;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.mvvm_dev.Service.Retrofit_Url.api_retrofit;

public class Details_Activity extends AppCompatActivity {
ActivityDetailsBinding binding;
Context context;
String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_details);
        context = this;
        LoadDataDetails(id);
    }
    public void LoadDataDetails(String params){
        JSONObject param = new JSONObject();
        try {
            //      param.put("?User=","13689");
          //  String params = "13689";
            //  RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"),param.toString());
            Call<GetDetailsCLPharmacy_showpictures> call = api_retrofit.getDataDetails(params);
            try {
                call.enqueue(new Callback<GetDetailsCLPharmacy_showpictures>() {
                    @Override
                    public void onResponse(Call<GetDetailsCLPharmacy_showpictures> call, Response<GetDetailsCLPharmacy_showpictures> response) {

                        if (response.body() != null) {

                            ///   itemMainViewModel= new ItemMainViewModel(data_getInfoCLPharmacies,context);
//                            adapter = new MainAdapter(context,data_getInfoCLPharmacies);
//                            binding.listviewMain.setAdapter(adapter);
                        }else {
                            // ShowDialog("Lỗi"+":"+""+response.code());
                        }
                    }

                    @Override
                    public void onFailure(Call<GetDetailsCLPharmacy_showpictures> call, Throwable t) {
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
}