public class MobilDemo2 {
    public static void main(String[] args) {
        Mobil2 mobil1 = new Mobil2();
        mobil1.setWarna("Hitam");
        mobil1.setTahunProduksi(2019);
        mobil1.hidupkanMobil();
        mobil1.ubahGigi(5);
        
        System.out.println("Warna mobil \t\t: " + mobil1.warna);
        System.out.println("Tahun Produksi \t\t: " + mobil1.tahunProduksi);
        System.out.println("Kondisi mobil \t\t: " + mobil1.nyalakan);
        System.out.println("Jumlah gigi mobil \t: " + mobil1.gigi);

        mobil1.speedUp(10, 2);
        System.out.println("Kecepatan mobil \t: " + mobil1.kecepatan);
        mobil1.speedDown(5, 2);
        System.out.println("Kecepatan mobil \t: " + mobil1.kecepatan);
    }
}

class Mobil2 {
    String warna;
    int tahunProduksi;
    boolean nyalakan;
    int gigi;
    int kecepatan;
    boolean dipakai;

    public Mobil2(){
        nyalakan = false;
        gigi = 0; //0 sama dengan R
        kecepatan = 0;
        dipakai = false;
    }

    public void setWarna(String newWarna){
        warna = newWarna;
    }

    public void setTahunProduksi(int newTahunProduksi){
        tahunProduksi = newTahunProduksi;
    }

    public String getWarna(){
        return warna;
    }

    public int getTahunProduksi(){
        return tahunProduksi;
    }

    public void hidupkanMobil(){
        nyalakan = true;
    }

    public void matikanMobil(){
        nyalakan = false;
    }

    public void ubahGigi(int newGigi){
        if (nyalakan = true && newGigi >=1 && newGigi <= 5){
            gigi = gigi + newGigi;
        }else{
            System.out.println("Salah masukkan gigi");
        }
    }

    public void gigiUp(){
        if (nyalakan = true && gigi < 5 && gigi >= 1){
            gigi++;
        }
    }

    public void gigiDown(){
        if (nyalakan = true && gigi >=1 && gigi < 5){
            gigi--;
        }
    }

    public void speedUp(int percepatan, int waktu){
        if (dipakai = true){
            kecepatan = kecepatan + (percepatan * waktu);
        }
    }

    public void speedDown(int perlambatan, int waktu){
        if (dipakai = true){
            kecepatan = kecepatan - (perlambatan * waktu);
        }
    }
}