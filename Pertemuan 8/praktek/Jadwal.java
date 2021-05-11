import java.util.ArrayList;

public class Jadwal {
    private String kodeJadwal;
    private String hari;
    public ArrayList<MataKuliah> listMatkul = new ArrayList<MataKuliah>();

    public Jadwal() {
        
    }
    public Jadwal(String kodeJadwal, String hari){
        this.kodeJadwal = kodeJadwal;
        this.hari = hari;
    }
    public void setKodeJadwal(String kodeJadwal) {
        this.kodeJadwal = kodeJadwal;
    }
    public String getKodeJadwal() {
        return this.kodeJadwal;
    }
    public void setHari(String hari) {
        this.hari = hari;
    }
    public String getHari() {
        return this.hari;
    }
}