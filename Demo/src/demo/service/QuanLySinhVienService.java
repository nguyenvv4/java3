/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package demo.service;

import demo.model.SinhVien;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public interface QuanLySinhVienService {

    ArrayList<SinhVien> getList();

    String them(SinhVien sinhVien);

    String update(int id, SinhVien sinhVien);
}
