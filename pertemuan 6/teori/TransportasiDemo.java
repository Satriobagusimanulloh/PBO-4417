public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil Avanza = new Mobil();
        Avanza.setWarna("Putih");
        Avanza.setNopol("G 123 AC");
        System.out.println("Mobil Avanza dengan warna " + Avanza.getWarna() + " dan nopol " + Avanza.getNopol());

        Mobil Pajero = new Mobil("Putih", "G 2 B", 2019, "Solar");
        System.out.println("Mobil Pajero dengan warna " + Pajero.getWarna() + " dan nopol " + Pajero.getNopol() + " tahun produksi " + Pajero.getTahunProduksi() + " dengan bahan bakar " + Pajero.getBahanBakar());

        Bicycle pixy = new Bicycle();
        pixy.setWarna("Putih");
        System.out.println("Sepeda dengan warna " + pixy.getWarna());

        Bicycle a = new Bicycle("Hitam", "Polygon");
        System.out.println("Sepeda dengan warna " + a.getWarna() + " dengan merek " + a.getMerek());
    }
}