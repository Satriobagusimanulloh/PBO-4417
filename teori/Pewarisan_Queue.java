import java.util.*;

class Garasi {
    private Queue<String> kendaraan = new LinkedList<String>();

    public Queue<String> getKendaraan() {
        return kendaraan;
    }
    public void setKendaraan(Queue<String> kendaraan) {
        this.kendaraan = kendaraan;
    }
}

class Kendaraan extends Garasi{
    
    public Kendaraan() {

    }
    public boolean isEmpty() {
        return super.getKendaraan().isEmpty();
    }
    public void beliKendaraan(String obj) {
        super.getKendaraan().add(obj);
    }
    public String jualKendaraan() {
        return super.getKendaraan().remove();
    }
    public String kendaraanTerbaru() { // method peek
        return super.getKendaraan().peek();
    }

    public int jumlahKendaraan() { // method size
        return super.getKendaraan().size();
    }

    public Queue<String> lihatKendaraan() {
        return super.getKendaraan();
    }
}

public class Pewarisan_Queue{
    public static void main(String[] args) {
        Kendaraan dataKendaraan = new Kendaraan();
        System.out.println(dataKendaraan.lihatKendaraan());
        System.out.println("Jumlah Kendaraan \t: " + dataKendaraan.jumlahKendaraan());
        System.out.println("Apakah garasi kosong ? \t: " + dataKendaraan.isEmpty());
        System.out.println("Kendaraan Terbaru \t: " + dataKendaraan.kendaraanTerbaru());
        System.out.println();

        dataKendaraan.beliKendaraan("Honda C-RV");
        dataKendaraan.beliKendaraan("Honda Vario");
        dataKendaraan.beliKendaraan("Vespa Matic");
        System.out.println(dataKendaraan.lihatKendaraan());
        System.out.println("Jumlah Kendaraan \t: " + dataKendaraan.jumlahKendaraan());
        System.out.println("Apakah garasi kosong ? \t: " + dataKendaraan.isEmpty());
        System.out.println("Kendaraan Terbaru \t: " + dataKendaraan.kendaraanTerbaru());
        System.out.println();

        dataKendaraan.jualKendaraan();
        System.out.println(dataKendaraan.lihatKendaraan());
        System.out.println("Jumlah Kendaraan \t: " + dataKendaraan.jumlahKendaraan());
        System.out.println("Apakah garasi kosong ? \t: " + dataKendaraan.isEmpty());
        System.out.println("Kendaraan Terbaru \t: " + dataKendaraan.kendaraanTerbaru());
        System.out.println();
    }
}