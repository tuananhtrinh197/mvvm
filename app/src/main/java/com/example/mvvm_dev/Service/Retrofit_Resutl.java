package com.example.mvvm_dev.Service;

import com.example.mvvm_dev.Model.GetInfoCLPharmacy_showpictures;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;




public class Retrofit_Resutl {
//    /** Dat hang le - OrderProductGetAllOrders */
//    @SerializedName("GetAllOrders")
//    @Expose
//    private List<PO_Search_Model> resultPO_Search = new ArrayList<>();
//
//    public List<PO_Search_Model> getresultPO_Search() {
//        return resultPO_Search;
//    }
//
//    public void setresultPO_Search(List<PO_Search_Model> result) {
//        this.resultPO_Search = result;
//    }
//
//    @SerializedName("Region")
//    @Expose
//    private List<Region> result_Region = new ArrayList<>();
//
//    public List<Region> getResult_Region() {
//        return result_Region;
//    }
//
//    public void setResult_Region(List<Region> result_Region) {
//        this.result_Region = result_Region;
//    }
//
//    @SerializedName("Warehouse")
//    @Expose
//    private List<Warehouse> result_Warehouse= new ArrayList<>();
//
//    public List<Warehouse> getResult_Warehouse() {
//        return result_Warehouse;
//    }
//
//    public void setResult_Warehouse(List<Warehouse> result_Warehouse) {
//        this.result_Warehouse = result_Warehouse;
//    }
//
//    /** Duyet Rot Phieu - Save_Phieu_YCDC_RotHang */
//    @SerializedName("Save_Phieu_YCDC_RotHang")
//    @Expose
//    private List<Save_Phieu_YCDC_RotHang> result_Save = new ArrayList<>();
//
//    public List<Save_Phieu_YCDC_RotHang> getResult_Save() {
//        return result_Save;
//    }
//
//    public void seResult_Save(List<Save_Phieu_YCDC_RotHang> result) {
//        this.result_Save = result;
//    }
//    @SerializedName("Load_Phieu_YCDC_RotHang")
//    @Expose
//    private List<Load_Phieu_YCDC_RotHang> result_LoadPhieu = new ArrayList<>();
//
//    public List<Load_Phieu_YCDC_RotHang> getResult_LoadPhieu() {
//        return result_LoadPhieu;
//    }
//
//    public void setResult_LoadPhieu(List<Load_Phieu_YCDC_RotHang> result) {
//        this.result_LoadPhieu = result;
//    }
//    /**end*/
//
//    @SerializedName("Data_DoanhSo_CuoiNgay")
//    @Expose
//    private List<GetDataBCNhanVienTheoNgay> result_bcnv = new ArrayList<>();
//
//    public List<GetDataBCNhanVienTheoNgay> getresult_bcnv() {
//        return result_bcnv;
//    }
//    public void setresult_bcnv(List<GetDataBCNhanVienTheoNgay> resultnv) {
//        this.result_bcnv = resultnv;
//    }



    @Expose
    private List<GetInfoCLPharmacy_showpictures> result_data = new ArrayList<>();

    public List<GetInfoCLPharmacy_showpictures> getResult_data() {
        return result_data;
    }

    public void setResult_data(List<GetInfoCLPharmacy_showpictures> result_) {
        this.result_data = result_;
    }
}
