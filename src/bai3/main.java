package bai3;

import bai3.SinhVien;

public class main {

	public static void main(String[] args) {
		
		SinhVien sinhVien1 = new SinhVien(61134172, "Ngô Đình Phong", 8.4f, 7.5f);
		
		System.out.println("Sinh viên 1:");
        System.out.println(sinhVien1);
        System.out.println("Điểm trung bình: " + sinhVien1.tinhDiemTrungBinh());

		
		SinhVien sinhVien2 = new SinhVien(61134178, "PhạmTrung Khoa", 7.5f, 8.2f);
		
		System.out.println("Sinh viên 2:");
        System.out.println(sinhVien2);
        System.out.println("Điểm trung bình: " + sinhVien2.tinhDiemTrungBinh());
		
		SinhVien sinhVien3 = new SinhVien();
		
		sinhVien3.setMaSinhVien(61134715);
		sinhVien3.setHoTen("Nguyễn Trung Dũng");
		sinhVien3.setDiemTH(7.2f);
		sinhVien3.setDiemLH(7.6f);
		
		System.out.println("Sinh viên 3:");
        System.out.println(sinhVien3);
        System.out.println("Điểm trung bình: " + sinhVien3.tinhDiemTrungBinh());
		
	}
}
