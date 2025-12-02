package com.example.B2thang2ontap.repo;

import com.example.B2thang2ontap.entity.SinhVien;
import com.example.B2thang2ontap.util.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Repo_SinhVien {
    private Connection con = null;
    private String sql = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    public Repo_SinhVien(){
        con = DBConnect.getConnection();
    }
    public ArrayList<SinhVien> getAll(){
        sql = "select * from sinhvien";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ArrayList<SinhVien> lstsv = new ArrayList<>();
            while(rs.next()){
                int id = rs.getInt(1);
                String masv = rs.getString(2);
                String hoten = rs.getString(3);
                String que = rs.getString(4);
                String nganh = rs.getString(5);
                boolean gioitinh = rs.getBoolean(6);
                int namsinh = rs.getInt(7);
                lstsv.add(new SinhVien(id,masv,hoten,que,nganh,gioitinh,namsinh));
            }
            return lstsv;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public SinhVien getRow(String idtk){
        sql = "select * from sinhvien where id = ?";
        SinhVien sv = new SinhVien();
        try{
            ps = con.prepareStatement(sql);
            ps.setObject(1,idtk);
            rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt(1);
                String masv = rs.getString(2);
                String hoten = rs.getString(3);
                String que = rs.getString(4);
                String nganh = rs.getString(5);
                boolean gioitinh = rs.getBoolean(6);
                int namsinh = rs.getInt(7);
                sv = new SinhVien(id,masv,hoten,que,nganh,gioitinh,namsinh);

            }
            return sv;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
