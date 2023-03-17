/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.service.impl;

import demo.model.SinhVien;
import demo.repository.SinhVienRepository;
import demo.service.QuanLySinhVienService;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class QuanLySinhVienServiceImpl implements QuanLySinhVienService {

    private SinhVienRepository sinhVienRepository = new SinhVienRepository();

    @Override
    public ArrayList<SinhVien> getList() {
        return sinhVienRepository.getList();
    }

    @Override
    public String them(SinhVien sinhVien) {
        if (sinhVienRepository.addNew(sinhVien)) {
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }
    }

    @Override
    public String update(int id, SinhVien sinhVien) {
        // kiem tra sinh vien co ton tai hay khong??
        // lay sinh vien theo id . neu khong co sinh vien nao => khong tim thay sinh vien de sua
        // nguoc lai => tien hanh update
        SinhVien sinhVienDetail = sinhVienRepository.getById(id);
        if (sinhVienDetail == null) {
            return "Khong tim thay sinh vien tuong ung";
        } else if (sinhVienRepository.update(id, sinhVien)) {
            return "Update thanh cong";
        } else {
            return "update that bai";
        }
    }

}
