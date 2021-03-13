public class matematikaDemo{
    public static void main(String[] args) {
        matematika operator = new matematika();
    
        operator.setAngka(20, 20);
        System.out.println("Pertambahan \t: " + operator.angkaPertama + " + " + operator.angkaKedua + " \t= " + operator.pertambahan());

        operator.setAngka(10, 5);
        System.out.println("Pengurangan \t: " + operator.angkaPertama + " - " + operator.angkaKedua + " \t= "  + operator.pengurangan());

        operator.setAngka(10, 20);
        System.out.println("Perkalian \t: " + operator.angkaPertama + " x " + operator.angkaKedua + " \t= "  + operator.perkalian());

        operator.setAngka(20, 2);
        System.out.println("Pembagian \t: " + operator.angkaPertama + " / " + operator.angkaKedua + " \t= "  + operator.pembagian());
    }
}

class matematika {
    public int angkaPertama;
    public int angkaKedua;

    public matematika(){

    }

    public void setAngka(int angka1, int angka2){
        angkaPertama = angka1;
        angkaKedua = angka2;
    }

    public int pertambahan(){
        return angkaPertama + angkaKedua;
    }

    public int pengurangan(){
        return angkaPertama - angkaKedua;
    }

    public int perkalian(){
        return angkaPertama * angkaKedua;
    }

    public int pembagian(){
        return angkaPertama / angkaKedua;
    }
}