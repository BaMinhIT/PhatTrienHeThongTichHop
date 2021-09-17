package Tuan02.Class;

/**
 * ToaDo
 */
public class ToaDo {
    int x;
    int y;

    public void khoiTaoToaDo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getToaDoX() {
        return x;
    }
    public void setToaDoX(int x) {
        this.x = x;
    }
    public int getToaDoY() {
        return y;
    }
    public void setToaDoY(int y) {
        this.y = y;
    }

    public void inThongTin() {
        System.out.println("Toa do:("+x+","+y+")");
    }

    public double tinhKhoangCach() {
        return Math.sqrt(x*x+y*y);
    }

    public static void main(String[] args) {
        ToaDo t1 = new ToaDo();
        t1.khoiTaoToaDo(10, 9);
        System.out.println("\n");
        t1.inThongTin();
        System.out.printf("Khoang cach T1 = %.2f", t1.tinhKhoangCach());
        System.out.println("\n-------------------------------------");
        ToaDo t2 = new ToaDo();
        t2.setToaDoX(6);
        t2.setToaDoY(8);
        t2.inThongTin();
        System.out.printf("Khoang cach T2 = %.2f", t2.tinhKhoangCach());
        System.out.println("\n");
    }    
}