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

}
