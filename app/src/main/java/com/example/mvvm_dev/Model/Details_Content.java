package com.example.mvvm_dev.Model;

public class Details_Content {

    private int DetailId;
    private String TenHangMuc;
    private String MoTaHangMuc;
    private String LinkHinhMau;
    private String LinkHinhShopUp;
    private String LyDoKhongDuyet;
    private boolean AllowUpload;

    public int getDetailId() {
        return DetailId;
    }

    public void setDetailId(int detailId) {
        DetailId = detailId;
    }

    public String getTenHangMuc() {
        return TenHangMuc;
    }

    public void setTenHangMuc(String tenHangMuc) {
        TenHangMuc = tenHangMuc;
    }

    public String getMoTaHangMuc() {
        return MoTaHangMuc;
    }

    public void setMoTaHangMuc(String moTaHangMuc) {
        MoTaHangMuc = moTaHangMuc;
    }

    public String getLinkHinhMau() {
        return LinkHinhMau;
    }

    public void setLinkHinhMau(String linkHinhMau) {
        LinkHinhMau = linkHinhMau;
    }

    public String getLinkHinhShopUp() {
        return LinkHinhShopUp;
    }

    public void setLinkHinhShopUp(String linkHinhShopUp) {
        LinkHinhShopUp = linkHinhShopUp;
    }

    public String getLyDoKhongDuyet() {
        return LyDoKhongDuyet;
    }

    public void setLyDoKhongDuyet(String lyDoKhongDuyet) {
        LyDoKhongDuyet = lyDoKhongDuyet;
    }

    public boolean isAllowUpload() {
        return AllowUpload;
    }

    public void setAllowUpload(boolean allowUpload) {
        AllowUpload = allowUpload;
    }
}
