// Annisa Luthfi
// A11.2019.11658

public class TransportasiDemo {
    public static void main(String[] args){
        Mobil mobils = new Mobil();
        mobils.setMerkMobil("Mazda");
        mobils.setPlat("H 111 BR");
        mobils.setWarna("Putih");
        
        mobils.Cetak();
        
        Bicycle sepeda = new Bicycle();
        sepeda.setMerkSepeda("Wimcycle");
        sepeda.setWarna("Hitam  Abu-abu");
        
        System.out.println("\n");
        sepeda.Cetak();
    }
}
