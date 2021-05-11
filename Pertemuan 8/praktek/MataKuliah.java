public abstract class MataKuliah {
    private String kodeMatkul;
    private String namaMatkul;

    protected MataKuliah(){

    }
    protected MataKuliah(String kodeMatkul, String namaMatkul){
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
    }
    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul=kodeMatkul;
    }
    public String getKodeMatkul() {
        return this.kodeMatkul;
    }
    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul=namaMatkul;
    }
    public String getNamaMatkul() {
        return this.namaMatkul;
    }
    public abstract void setNilaiAkhir(double nillai);
    public abstract double getNilaiAkhir();
}