import java.util.ArrayList;

// import jdk.internal.jshell.tool.resources.version;
// import jdk.internal.util.xml.impl.Input;

public class Mahasiswa implements Biodata {
    private String nama;
    private String nim;
    private String jenisKelamin;
    public ArrayList<MataKuliah> listMatkul = new ArrayList<MataKuliah>();
    public ArrayList<Jadwal> listJadwal = new ArrayList<Jadwal>();
    
    public Mahasiswa(){

    }
    public Mahasiswa(String nama, String nim, String jenisKelamin){
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getNama() {
        return this.nama;
    }
    public String getNim() {
        return this.nim;
    }
    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    public void inputMatkul(MataKuliah matkul) {
        this.listMatkul.add(matkul);
    }
    public void lihatMatkul() {
        if (listMatkul == null){
            System.out.println("Input mata kuliah dahulu!");
        }
        System.out.println(this.listMatkul);
    }
    public void lihatJadwal() {
        if (this.listJadwal == null) {
            System.out.println("Input jadwal dahulu!");
        }
        System.out.println(this.listJadwal);
    }
}