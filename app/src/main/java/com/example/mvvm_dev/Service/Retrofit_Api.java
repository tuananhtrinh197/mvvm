package com.example.mvvm_dev.Service;


import com.example.mvvm_dev.Model.GetDetailsCLPharmacy_showpictures;
import com.example.mvvm_dev.Model.GetInfoCLPharmacy_showpictures;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Retrofit_Api {

//
//    @POST("Save_Phieu_YCDC_RotHang")
//    Call<Retrofit_Resutl> Save_Phieu_YCDC_RotHang(@Body RequestBody param);

    @GET("GetInfoCLPharmacy_showpictures")
    Call<GetInfoCLPharmacy_showpictures> getData(@Query("Usercode") String param);
    @GET("GetInfoCLPharmacy_showpictures")
    Call<GetDetailsCLPharmacy_showpictures> getDataDetails(@Query("RequestId") String param);
//    @POST("GetData_DoanhSo_CuoiNgay")
//    Call<Retrofit_Resutl> BCNhanVienTheoNgay(@Body RequestBody param);
//
//    @GET("LoadMaterData_Region_Warehouse")
//    Call<Retrofit_Resutl> LoadMaterData_Region_Warehouse();
}
