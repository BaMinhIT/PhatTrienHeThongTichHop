package Tuan02.Class;

public class PhanSo {
    int tuSo;
    int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tu_so) {
        this.tuSo=tu_so;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mau_so) {
        this.mauSo=mau_so;
    }

    public void nghichDaoPhanSo() {
        double check =(tuSo*mauSo)/(mauSo*tuSo);
        if(check == 1) {
            System.out.println("Phan so nghich dao = "+getMauSo()+"/"+getTuSo());
        }
        else {
            System.out.println(" ");
        }
    }
    public void inThongTin() {
        System.out.println("\nPhan so = "+ getTuSo()+ "/"+ getMauSo());
    }

    public void tongPhanSo(PhanSo ps) {
        int ts = this.getTuSo()*ps.getMauSo() + this.getMauSo()*ps.getTuSo(); 
        int ms = this.getMauSo()*ps.getMauSo();
        PhanSo phanSoCong = new PhanSo(ts, ms);
        System.out.println("Tong phan so = "+phanSoCong.tuSo+"/"+phanSoCong.mauSo);
    }

    public void hieuPhanSo(PhanSo ps) {
        int ts = this.getTuSo()*ps.getMauSo() - this.getMauSo()*ps.getTuSo(); 
        int ms = this.getMauSo()*ps.getMauSo();
        PhanSo phanSoTru = new PhanSo(ts, ms);
        System.out.println("Hieu phan so = "+phanSoTru.tuSo+"/"+phanSoTru.mauSo);
    }

    public void tichPhanSo(PhanSo ps) {
        int ts = this.getTuSo()*ps.getTuSo(); 
        int ms = this.getMauSo()*ps.getMauSo();
        PhanSo phanSoNhan = new PhanSo(ts, ms);
        System.out.println("Tich phan so = "+phanSoNhan.tuSo+"/"+phanSoNhan.mauSo);
    }

    public void ThuongPhanSo(PhanSo ps) {
        int ts = this.getTuSo()*ps.getMauSo(); 
        int ms = this.getMauSo()*ps.getMauSo();
        PhanSo phanSoChia = new PhanSo(ts, ms);
        System.out.println("Thuong phan so = "+phanSoChia.tuSo+"/"+phanSoChia.mauSo);
    }

    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(14, 2);
        PhanSo ps2 = new PhanSo(8, 5);
        ps1.inThongTin();
        ps1.nghichDaoPhanSo();
        ps1.tongPhanSo(ps2);
        ps1.hieuPhanSo(ps2);
        ps1.tichPhanSo(ps2);
        ps1.ThuongPhanSo(ps2);
        System.out.println("\n-----------------------");
    }
}
