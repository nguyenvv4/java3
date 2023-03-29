/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.repository;

import demo.model.SinhVien;
import demo.viewModel.SanPhamViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nguyenvv
 */
public class QLRepository {

    private DbConnection dbConnection;

    public ArrayList<SanPhamViewModel> getList() {
        ArrayList<SanPhamViewModel> list = new ArrayList<>();
        String sql = "SELECT SanPham.id, tenSanPham, "
                + "soLuong,giaBan,trangThai, "
                + "DanhMuc.tenDanhMuc \n"
                + "FROM SanPham INNER JOIN DanhMuc \n"
                + "ON DanhMuc.id = SanPham.maDanhMuc";
        try (Connection con = dbConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamViewModel sanPhamViewModel = new SanPhamViewModel();
                sanPhamViewModel.setId(rs.getInt("id"));
                sanPhamViewModel.setTenDanhMuc(rs.getString("tenDanhMuc"));
                list.add(sanPhamViewModel);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
//        ArrayList<SanPhamViewModel> list = new ArrayList<>();
//        list = new QLRepository().getList();
//        for (SanPhamViewModel spvm : list) {
//            System.out.println(spvm.toString());
//        }

        System.out.println(new Date());
    }

}
