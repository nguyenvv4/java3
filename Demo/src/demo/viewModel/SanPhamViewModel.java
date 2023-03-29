/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.viewModel;

/**
 *
 * @author nguyenvv
 */
public class SanPhamViewModel {

    private Integer id;

    private String tenSanPham;

    private Integer soLuong;

    private Integer giaBan;

    private Integer trangThai;

    private String tenDanhMuc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Integer getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Integer giaBan) {
        this.giaBan = giaBan;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public SanPhamViewModel() {
    }

    public SanPhamViewModel(Integer id, String tenSanPham, Integer soLuong, Integer giaBan, Integer trangThai, String tenDanhMuc) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
        this.tenDanhMuc = tenDanhMuc;
    }

    @Override
    public String toString() {
        return "SanPhamViewModel{" + "id=" + id + ", tenSanPham=" + tenSanPham + ", soLuong=" + soLuong + ", giaBan=" + giaBan + ", trangThai=" + trangThai + ", tenDanhMuc=" + tenDanhMuc + '}';
    }
    
    

}
