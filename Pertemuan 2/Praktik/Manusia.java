class Manusia {
    private String nama;
    private boolean punyaTV;

    public Manusia() {
        nama = "noname";
        punyaTV = false;
    }

    public Manusia(String nama) {
        this.nama = nama;
    }

    public String namaSaya(){
        return nama;
    }

    public void beliTV() {
        punyaTV = true;
    }

    public void jualSemuaTV() {
        punyaTV = false;
    }

    public boolean cekTV(){
        return punyaTV;
    }
}