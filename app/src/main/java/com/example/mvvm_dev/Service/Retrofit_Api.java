package com.example.mvvm_dev.Service;


import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Retrofit_Api {

//
//    @POST("Save_Phieu_YCDC_RotHang")
//    Call<Retrofit_Resutl> Save_Phieu_YCDC_RotHang(@Body RequestBody param);

    @GET("GetInfoCLPharmacy_showpictures")
    Call<Retrofit_Resutl> getData(@Body RequestBody param);

//    @POST("GetData_DoanhSo_CuoiNgay")
//    Call<Retrofit_Resutl> BCNhanVienTheoNgay(@Body RequestBody param);
//
//    @GET("LoadMaterData_Region_Warehouse")
//    Call<Retrofit_Resutl> LoadMaterData_Region_Warehouse();
}
