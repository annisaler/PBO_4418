// Annisa Luthfi
 // A11.2019.11658
 

public class Bicycle {
    String merkSepeda;
    String warna;
    
    public Bicycle(){
        this.merkSepeda = " ";
        this.warna = " ";
    }
    
    public String setMerkSepeda (String merkSepeda){
        return this.merkSepeda = merkSepeda;    
    }
    
    public String setWarna(String warna){
        return this.warna = warna;
    }
    
    public String getmerkSepeda(){
        return merkSepeda;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void Cetak(){
        System.out.println("Merk Sepeda: "+merkSepeda);
        System.out.println("Warna: "+warna);
    }
    
}
