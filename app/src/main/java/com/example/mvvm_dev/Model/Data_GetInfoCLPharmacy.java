package com.example.mvvm_dev.Model;

public class Data_GetInfoCLPharmacy {
    private int STT;
    private int RequestTypeId;
    private int RequestId;
    private String Title;
    private  String TimeCreate;
    private  String Assigner;
   private   String AssignerName;
    private  int StatusApprove;
    private  String StatusApproveName;
    private int StatusRequest;
    private String StatusRequestName;

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public int getRequestTypeId() {
        return RequestTypeId;
    }

    public void setRequestTypeId(int requestTypeId) {
        RequestTypeId = requestTypeId;
    }

    public int getRequestId() {
        return RequestId;
    }

    public void setRequestId(int requestId) {
        RequestId = requestId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTimeCreate() {
        return TimeCreate;
    }

    public void setTimeCreate(String timeCreate) {
        TimeCreate = timeCreate;
    }

    public String getAssigner() {
        return Assigner;
    }

    public void setAssigner(String assigner) {
        Assigner = assigner;
    }

    public String getAssignerName() {
        return AssignerName;
    }

    public void setAssignerName(String assignerName) {
        AssignerName = assignerName;
    }

    public int getStatusApprove() {
        return StatusApprove;
    }

    public void setStatusApprove(int statusApprove) {
        StatusApprove = statusApprove;
    }

    public String getStatusApproveName() {
        return StatusApproveName;
    }

    public void setStatusApproveName(String statusApproveName) {
        StatusApproveName = statusApproveName;
    }

    public int getStatusRequest() {
        return StatusRequest;
    }

    public void setStatusRequest(int statusRequest) {
        StatusRequest = statusRequest;
    }

    public String getStatusRequestName() {
        return StatusRequestName;
    }

    public void setStatusRequestName(String statusRequestName) {
        StatusRequestName = statusRequestName;
    }
}
