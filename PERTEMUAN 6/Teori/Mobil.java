// Annisa Luthfi
// A11.2019.11658

public class Mobil {
    String merkMobil;
    String Plat;
    String warna;
    public Mobil(){
        this.merkMobil = " ";
        this.Plat = " ";
        this.warna = " ";
    }
    
    public String setMerkMobil(String MerkMobil){
        return this.merkMobil = MerkMobil;    
    }

    public String setPlat(String Plat){
        return this.Plat = Plat;
    }
    
    public String setWarna(String warna){
        return this.warna = warna;
    }
    
    public String getMerkMobil(){
        return merkMobil;
    }

    public String getPlat(){
        return Plat;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void Cetak(){
        System.out.println("Merek mobil: "+merkMobil);
        System.out.println("Plat nomor:"+Plat);
        System.out.println("Warna mobil: "+warna);
        
    }
}
