package com.example.B2thang2ontap.entity;

public class SinhVien {
    private int id;
    private String masv;
    private String hoten;
    private String que;
    private String nganh;
    private boolean gioitinh;
    private int namsinh;

    public SinhVien() {
    }

    public SinhVien(int id, String masv, String hoten, String que, String nganh, boolean gioitinh, int namsinh) {
        this.id = id;
        this.masv = masv;
        this.hoten = hoten;
        this.que = que;
        this.nganh = nganh;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
}
