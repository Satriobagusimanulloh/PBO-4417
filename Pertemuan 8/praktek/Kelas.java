public class Kelas {
    private String kodeKelas;
    private int jumlahMahasiswa;
    
    public Kelas() {
            
    }
    public Kelas(String kodeKelas, int jumlahMahasiswa){
        this.kodeKelas = kodeKelas;
        this.jumlahMahasiswa = jumlahMahasiswa;
    }
    public void setKodeKelas(String kodeKelas) {
        this.kodeKelas = kodeKelas;
    }
    public String getKodeKelas() {
        return this.kodeKelas;
    }
    public void setJumlahMahasiswa(int jumlahMahasiswa) {
        this.jumlahMahasiswa = jumlahMahasiswa;
    }
    public int getJumlahMahasiswa() {
        return this.jumlahMahasiswa;
    }
}