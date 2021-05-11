public class Tes {
    public static void main(String[] args) {
        MatkulPokok  MatkulPokok1 = new MatkulPokok(100);
        System.out.println(MatkulPokok1.getNilaiAkhir());
        System.out.println();

        MatkulTambahan  MatkulTambahan1 = new MatkulTambahan(100);
        System.out.println(MatkulTambahan1.getNilaiAkhir());
        System.out.println();

        Kelas Kelas1 = new Kelas();
        Kelas1.setKodeKelas("H.12");
        Kelas1.setJumlahMahasiswa(34);
        System.out.println(Kelas1.getKodeKelas());
        System.out.println(Kelas1.getJumlahMahasiswa());
        System.out.println();

        Jadwal Jadwal1 = new Jadwal();
        Jadwal1.setHari("Senin");
        Jadwal1.setKodeJadwal("A11.4417");
        Jadwal1.getHari();
        Jadwal1.getKodeJadwal();
        System.out.println();
        

        Dosen Dosen1 = new Dosen("Ardiawan Bagus Harisa", "D11.2017.11111", "Laki-laki");
        Dosen1.inputJadwal(Jadwal1);;
        Dosen1.lihatJadwal();
        Dosen1.mengajar();
        System.out.println();

        Mahasiswa Mahasiswa1 = new Mahasiswa("Satrio Bagus Imanulloh", "A11.2019.12341", "Laki-laki");
        Mahasiswa1.inputMatkul(MatkulPokok1);
        Mahasiswa1.inputMatkul(MatkulTambahan1);
        Mahasiswa1.lihatJadwal();
        Mahasiswa1.lihatMatkul();
        System.out.println();
    }
}