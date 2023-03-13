/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.model;

/**
 *
 * @author nguyenvv
 */
public class SinhVien {

    private Integer id;

    private String hoTen;

    private String diaChi;

    private Integer tuoi;

    private Integer trangThai;

    public SinhVien() {
    }

    public SinhVien(Integer id, String hoTen, String diaChi, Integer tuoi, Integer trangThai) {
        this.id = id;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", tuoi=" + tuoi + ", trangThai=" + trangThai + '}';
    }

    
}
