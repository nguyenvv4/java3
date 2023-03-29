/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.model;

/**
 *
 * @author nguyenvv
 */
public class LopHoc {
    
    private Integer id;
    
    private String maLop;
    
    private String tenLop;

    public LopHoc(Integer id, String maLop, String tenLop) {
        this.id = id;
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    public LopHoc() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return tenLop ;
    }
    
    
    
}
