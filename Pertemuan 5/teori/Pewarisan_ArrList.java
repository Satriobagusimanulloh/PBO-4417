import java.util.ArrayList;

class Kebun_Binatang {
    ArrayList<String> animal = new ArrayList<>();

    public Kebun_Binatang() {

    }
    public void setHewan(ArrayList<String> animal) {
        this.animal = animal;
    }
    public ArrayList<String> getHewan() {
        return this.animal;
    }
}

class Hewan extends Kebun_Binatang {
    
    public void tambahHewan(String animal) {
        super.getHewan().add(animal);
    }
    public String hewanMati(int index){
        return super.getHewan().remove(index);
    }
    public void pertukaranHewan(int index, String animal) {
        super.getHewan().set(index, animal);
    }
    public ArrayList<String> koleksiHewan() {
        return super.getHewan();
    }
}

public class Pewarisan_ArrList {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        System.out.println(hewan.koleksiHewan());

        hewan.tambahHewan("Unta");
        hewan.tambahHewan("Monyet");
        hewan.tambahHewan("Gajah");
        System.out.println(hewan.koleksiHewan());

        hewan.pertukaranHewan(1, "Ular");
        System.out.println(hewan.koleksiHewan());

        hewan.hewanMati(1);
        System.out.println(hewan.koleksiHewan());
    }
}