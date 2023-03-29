/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.model;

/**
 *
 * @author nguyenvv
 */
public class Svien {
    
    
    private Integer id;
    
    private String tenSinhVien;
    
    private Integer gioiTinh;
    
    private Integer maLop;

    public Svien(Integer id, String tenSinhVien, Integer gioiTinh, Integer maLop) {
        this.id = id;
        this.tenSinhVien = tenSinhVien;
        this.gioiTinh = gioiTinh;
        this.maLop = maLop;
    }

    public Svien() {
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getMaLop() {
        return maLop;
    }

    public void setMaLop(Integer maLop) {
        this.maLop = maLop;
    }
    
    
    
}
