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

    public Boolean addNew(SinhVien sinhVien) {
        String sql = "insert into sinh_vien(id, ho_ten, dia_chi, nam_sinh, trang_thai) "
                + " VALUES(?,?,?,?,?)";
        try (Connection con = dbConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, sinhVien.getId());
            ps.setObject(2, sinhVien.getHoTen());
            ps.setObject(3, sinhVien.getDiaChi());
            ps.setObject(4, sinhVien.getTuoi());
            ps.setObject(5, sinhVien.getTrangThai());
            int result = ps.executeUpdate();
            return result > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public Boolean update(int id, SinhVien sinhVien) {
        String sql = "update sinh_vien set "
                + "ho_ten =?, "
                + "dia_chi=?, "
                + "nam_sinh=?, "
                + "trang_thai=? "
                + "WHERE id = ?";
        try (Connection con = dbConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, sinhVien.getHoTen());
            ps.setObject(2, sinhVien.getDiaChi());
            ps.setObject(3, sinhVien.getTuoi());
            ps.setObject(4, sinhVien.getTrangThai());
            ps.setObject(5, id);
            int result = ps.executeUpdate();
            return result > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public SinhVien getById(int id) {
        SinhVien sinhVien = new SinhVien();
        String sql = "select * from sinh_vien where id =? ";
        try (Connection con = dbConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sinhVien.setId(rs.getInt("id"));
                sinhVien.setHoTen(rs.getString("ho_ten"));
                sinhVien.setDiaChi(rs.getString("dia_chi"));
                sinhVien.setTuoi(rs.getInt("nam_sinh"));
                sinhVien.setTrangThai(rs.getInt("trang_thai"));
                return sinhVien;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        SinhVienRepository sinhVienRepository = new SinhVienRepository();
        ArrayList<SinhVien> list = sinhVienRepository.getList();
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien.toString());
        }
    }

}
