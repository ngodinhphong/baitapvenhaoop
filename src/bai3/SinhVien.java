package bai3;

public class SinhVien {
	private int maSinhVien;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	
	public SinhVien() {}
	
	public SinhVien(int maSinhVien, String hoTen, float diemLH, float diemTH) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diemLT = diemLH;
		this.diemTH = diemTH;
	}
	
	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDiemLH() {
		return diemLT;
	}

	public void setDiemLH(float diemLH) {
		this.diemLT = diemLH;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	
	public float tinhDiemTrungBinh() {
		return (diemLT + diemTH)/2;
		
	}
	
	public String toString() {
		return "Mã SV: " + maSinhVien + "\nHọ tên: " + hoTen + "\nĐiểm LT: " + diemLT + "\nĐiểm TH: " + diemTH;
              
    }

}
