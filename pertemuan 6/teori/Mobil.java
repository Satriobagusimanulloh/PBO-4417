package Transportasi;

public class Mobil {
    private String Warna = "Hitam";
    private String Nopol = "G 1 B";
    private int TahunProduksi;
    private String BahanBakar;

    public Mobil() {

    }
    public Mobil(String Warna, String Nopol, int TahunProduksi, String BahanBakar) {
        this.Warna = Warna;
        this.Nopol = Nopol;
        this.TahunProduksi = TahunProduksi;
        this.BahanBakar = BahanBakar;
    }
    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
    public String getWarna() {
        return this.Warna;
    }
    public void setNopol(String Nopol) {
        this.Nopol = Nopol;
    }
    public String getNopol() {
        return this.Nopol;
    }
    public void setTahunProduksi(int TahunProduksi) {
        this.TahunProduksi = TahunProduksi;
    }
    public int getTahunProduksi() {
        return this.TahunProduksi;
    }
    public void setBahanBakar(String BahanBakar) {
        this.BahanBakar = BahanBakar;
    }
    public String getBahanBakar() {
        return this.BahanBakar;
    }
}