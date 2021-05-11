public class MatkulPokok extends MataKuliah {
    private double nilai;

    public MatkulPokok() {

    }
    public MatkulPokok(double nilai) {
        this.nilai=nilai;
    }
    public void setNilaiAkhir(double nilai) {
        this.nilai = nilai;
    }
    public double getNilaiAkhir() {
        return 0.6*this.nilai;
    }
}