public class BukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Berbasis Objek dengan Java", "Indrayani", "Elexmedia komputido", 2007);
        buku1.cetakBuku();
        Buku buku2 = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);
        buku2.cetakBuku();
    }
}

class Buku {
    private String judul;
    private String pengarang;
    private String penerbit;
    private Integer tahun;

    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public void cetakBuku() {
        if (this.judul == null && this.pengarang == null && this.penerbit == null && this.tahun == null) {
            System.out.println("Input judul, pengarang, penerbit, tahun produksi");
        } else {
            System.out.println(judul + ", " + pengarang + ", " + penerbit + ", " + tahun);
        }
    }
}