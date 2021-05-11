import java.util.ArrayList;

//import jdk.internal.icu.impl.Punycode;

public class Dosen implements Biodata {
    private String nama;
    private String npp;
    private String jenisKelamin;
    public ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
    public ArrayList<Jadwal> listJadwal = new ArrayList<Jadwal>();
    
    public Dosen() {

    }
    public Dosen(String nama, String npp, String jenisKelamin) {
        this.nama = nama;
        this.npp = npp;
        this.jenisKelamin = jenisKelamin;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNpp(String npp) {
        this.npp = npp;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getNama() {
        return this.nama;
    }
    public String getNpp() {
        return this.npp;
    }
    public String getJenisKelamin() {
        return this.jenisKelamin;
    } 
    public void inputJadwal(Jadwal jadwal) {
        this.listJadwal.add(jadwal);
    }
    public void lihatJadwal() {
        if (this.listJadwal == null) {
            System.out.println("Input jadwal dahulu!");
        }
        System.out.println(this.listJadwal);
    }
    public void lihatMahasiswa() {
        if (this.listJadwal == null) {
            System.out.println("Input data mahasiswa dahulu!");
        }
        System.out.println(this.listMahasiswa);
    }
    public void mengajar() {
        System.out.println("Dosen mengajar");
    }
}