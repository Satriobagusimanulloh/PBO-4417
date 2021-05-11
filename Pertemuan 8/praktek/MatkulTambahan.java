public class MatkulTambahan extends MataKuliah {
    private double nilai;

    public MatkulTambahan() {

    }
    public MatkulTambahan(double nilai) {
        this.nilai=nilai;
    }
    public void setNilaiAkhir(double nilai) {
        this.nilai = nilai;
    }
    public double getNilaiAkhir() {
        return 0.4*this.nilai;
    }
}