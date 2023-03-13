/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  nguyenvv
 * Created: Mar 13, 2023
 */

CREATE TABLE sinh_vien(
    id INT PRIMARY KEY,
    ho_ten VARCHAR(50),
    dia_chi VARCHAR(200),
    nam_sinh INT,
    trang_thai INT
)

insert into sinh_vien VALUES(1,'Nguyen Van A', 'Ha Noi',2000,1)
insert into sinh_vien VALUES(2,'Nguyen Van B', 'Thai Binh',2000,1)
insert into sinh_vien VALUES(3,'Nguyen Van C', 'Nam Dinh',2000,1)