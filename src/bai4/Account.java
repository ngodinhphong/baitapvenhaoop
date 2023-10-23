package bai4;

public class Account {
	private long soTK;
	private String tenTK;
	private double soDu;
	
	private double hangSo = 0.035;
	
	// Câu a
	public Account() {
		
	}
	
	public Account(long soTK, String tenTK, double soDu) {
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soDu = soDu;
		
	}

	public long getSoTK() {
		return soTK;
	}

	public void setSoTK(long soTK) {
		this.soTK = soTK;
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}
	
	public String toString() {
        return "Số tài khoản: " + soTK + "\nTên tài khoản: " + tenTK + String.format("\nSố dư: $%.2f", soDu);
	}
	
	//câu b
	public Account(long soTK, String tenTK) {
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soDu = 50;
	}
	// phương thức nap tiền
	public void napTien(double tienNap) {
		if(tienNap > 0) {
			soDu += tienNap;
		}
		
	}
	
	//phương thức rút tiền
	public void rutTien(double tienRut, double phiRutTien) {
		if(tienRut > 0 && soDu - (tienRut - phiRutTien) >= 0) {
			soDu -= (tienRut - phiRutTien);
		}
	}
	
	//phương thức đáo hạn
	public void daoHan() {
		soDu = soDu + soDu * hangSo;
		
	}
	
	//phương thức chuyển khoản
	private void chuyenKhoan(double tienChuyen) {
		if(tienChuyen > 0 && (soDu - tienChuyen) >= 0) {
			soDu -= tienChuyen;
		}
	}
	
	
}
