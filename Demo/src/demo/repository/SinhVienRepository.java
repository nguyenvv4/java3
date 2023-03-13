/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.repository;

import demo.model.SinhVien;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author nguyenvv
 */
public class SinhVienRepository {

    private DbConnection dbConnection;

    public ArrayList<SinhVien> getList() {
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        String sql = "select * from sinh_vien";
        try (Connection con = dbConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sinhVien = new SinhVien();
                sinhVien.setId(rs.getInt("id"));
                sinhVien.setHoTen(rs.getString("ho_ten"));
                sinhVien.setDiaChi(rs.getString("dia_chi"));
                sinhVien.setTuoi(rs.getInt("nam_sinh"));
                sinhVien.setTrangThai(rs.getInt("trang_thai"));
                listSinhVien.add(sinhVien);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return listSinhVien;
    }
    
    public static void main(String[] args) {
        SinhVienRepository sinhVienRepository = new SinhVienRepository();
        ArrayList<SinhVien> list = sinhVienRepository.getList();
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien.toString());
        }
    }

}
