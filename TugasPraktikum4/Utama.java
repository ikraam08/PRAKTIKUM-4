package TugasPraktikum4;

public class Utama {
    public static void main(String[] args) {
        //objek bangunDatar,Persegi,Segitiga dan Lingkaran
        BangunDatar bangunDatar = new BangunDatar();
        //memasukan nilai parameter sisi
        Persegi persegi = new Persegi(4);
        //memasukan nilai parameter alas dan tinggi
        Segitiga segitiga = new Segitiga(8,6);
        //memasukan nilai parameter jari pada lingkaran
        Lingkaran lingkaran = new  Lingkaran(30);

        //memanggil method
        bangunDatar.luas();
        bangunDatar.keliling();
        System.out.println("Luas Persegi\t:" + persegi.luas());
        System.out.println("Keeliling Persegi\t:" + persegi.keliling());
        System.out.println("Luas Segitiga\t:" + segitiga.luas());
        System.out.println("Keliling Segitiga\t:" +segitiga.keliling());
        System.out.println("Luas Lingkaran\t:" + lingkaran.luas());
        System.out.println("Keliling Lingkaran\t;"+ lingkaran.keliling());

    }
}