import java.util.ArrayList;

public class Inheritance_ArrayList {
      public static void main(String args[]){
           Warna color = new Warna();
           System.out.println(color.itemWarna());

           color.tambahWarna("Hitam");
           color.tambahWarna("Putih");
           color.tambahWarna("Abu-abu");
           color.tambahWarna("Biru");
           System.out.println(color.itemWarna());
           
           color.gantiWarna(1,"Merah");
           System.out.println(color.itemWarna());

           color.hilangWarna(0);
           System.out.println(color.itemWarna());
      }
}

class Daftar_Warna {
      ArrayList<String> colors = new ArrayList<>();

      public Daftar_Warna(){

      }
      public void setWarna(ArrayList<String> colors) {
            this.colors = colors;
      }
      public ArrayList<String> getWarna(){
            return this.colors;
      }
} 

class Warna extends Daftar_Warna {
      public void tambahWarna(String colors){
            super.getWarna().add(colors);
      }
      public String hilangWarna(int index){
            return super.getWarna().remove(index);
      }
      public void gantiWarna(int index, String colors){
            super.getWarna().set(index, colors);
      }
      public ArrayList<String> itemWarna(){
            return super.getWarna();
      }
}