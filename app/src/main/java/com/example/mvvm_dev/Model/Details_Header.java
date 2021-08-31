package com.example.mvvm_dev.Model;

public class Details_Header {
    private int RequestId;
    private  String NguoiYeuCau;
    private String ThoiGianThucHien;

    public int getRequestId() {
        return RequestId;
    }

    public void setRequestId(int requestId) {
        RequestId = requestId;
    }

    public String getNguoiYeuCau() {
        return NguoiYeuCau;
    }

    public void setNguoiYeuCau(String nguoiYeuCau) {
        NguoiYeuCau = nguoiYeuCau;
    }

    public String getThoiGianThucHien() {
        return ThoiGianThucHien;
    }

    public void setThoiGianThucHien(String thoiGianThucHien) {
        ThoiGianThucHien = thoiGianThucHien;
    }
}
