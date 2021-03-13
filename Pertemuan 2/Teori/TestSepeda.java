public class TestSepeda {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda();
        sepeda1.setMerek("Polygon");
        sepeda1.setWarna("Putih");

        System.out.println("Merek Sepeda \t: " + sepeda1.merek);
        System.out.println("Warna Sepeda \t: " + sepeda1.warna);

        sepeda1.speedUp(10, 2);
        System.out.println("Kecepatan sepeda yang dipercepat \t: " + sepeda1.kecepatan + " M/S");

        sepeda1.speedDown(5, 2);
        System.out.println("Kecepatan sepeda yang diperlambat \t: " + sepeda1.kecepatan + " M/S");

        Manusia man1 = new Manusia("Budi");
        System.out.println("Nama \t\t: " + man1.namaSaya());
        man1.gowes();
        System.out.println(man1.cekGowes());

    }
}

class Sepeda {
    public String merek;
    public String warna;
    public int kecepatan;

    public Sepeda(){
        kecepatan = 0;
    }

    public void setMerek(String newMerek){
        merek = newMerek;
    }

    public void setWarna(String newWarna){
        warna = newWarna;
    }

    public String getMerek(){
        return merek;
    }

    public String getWarna(){
        return warna;
    }

    public void speedUp(int percepatan, int waktu){
        kecepatan = kecepatan + (percepatan * waktu);
    }

    public void speedDown(int perlambatan, int waktu){
        kecepatan = kecepatan - (perlambatan * waktu);
    }

    public int cekKecepatan(){
        return kecepatan;
    }
}

class Manusia {
    public String nama;
    public boolean gowes;

    public Manusia() {
        nama = "noname";
        gowes = false;
    }

    public Manusia(String nama) {
        this.nama = nama;
    }

    public String namaSaya(){
        return nama;
    }

    public void gowes() {
        gowes = true;
    }

    public void tidakGowes() {
        gowes = false;
    }

    public boolean cekGowes(){
        return gowes;
    }
}