package transportasi;

public class Bicycle {
    private String Warna = "Hitam";
    private String Merek;

    public Bicycle() {

    }
    public Bicycle(String Warna, String Merek) {
        this.Warna = Warna;
        this.Merek = Merek;
    }
    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
    public String getWarna() {
        return this.Warna;
    }
    public void setMerek(String Merek) {
        this.Merek = Merek;
    }
    public String getMerek() {
        return this.Merek;
    }
}