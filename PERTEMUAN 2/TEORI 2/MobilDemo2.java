class Mobil2{
    String warna;
    int tahunProduksi;
    boolean mobilNyala = false;
    int posisiGigi = 0;

    public void hidupkanMobil(){
        mobilNyala = true;
        System.out.println("Kondisi mobil: Nyala" + "("+ mobilNyala+")");
    }

    public void matikanMobil(){
        mobilNyala = false;
        System.out.println("Kondisi mobil: Mati" + "("+ mobilNyala+")");
    }

    public void ubahGigi(int posisiGigi){
        this.posisiGigi = posisiGigi;
        System.out.println("Posisi gigi sekarang:" +this.posisiGigi);

    }
}

public class MobilDemo2{
    public static void main(String[]args){
        Mobil2 mobilku1 = new Mobil2();

        mobilku1.warna = "hitam";
        mobilku1.tahunProduksi = 2006;
        System.out.println("warna:" + mobilku1.warna);
        System.out.println("tahun:" + mobilku1.tahunProduksi);

        mobilku1.hidupkanMobil();
        mobilku1.ubahGigi(4);
        mobilku1.ubahGigi(2);
        mobilku1.matikanMobil();
    }
}