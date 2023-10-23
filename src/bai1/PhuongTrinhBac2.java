package bai1;

public class PhuongTrinhBac2 {
	
	private double a;
    private double b;
    private double c;
    
    public PhuongTrinhBac2() {}

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double tinhDelta() {
        return b * b - 4 * a * c;
    }

    public void tinhNghiem1() {
        double delta = tinhDelta();
        double nghiem1, nghiem2;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            nghiem1 = (-b + Math.sqrt(delta)) / (2 * a);
            nghiem2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Nghiệm phương trình là: " + nghiem1 + nghiem2);
        }
    }

}
