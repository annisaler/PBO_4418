import java.util.Queue;
import java.util.LinkedList;
public class Inheritance_Queue {
      public static void main(String args[]){
            Warna color = new Warna();
            System.out.println(color.itemWarna());
 
            color.tambahWarna("Hitam");
            color.tambahWarna("Putih");
            color.tambahWarna("Abu-abu");
            color.tambahWarna("Biru");
            color.tambahWarna("Hijau");
            System.out.println(color.itemWarna());
            
            color.hilangWarna(4);
            System.out.println(color.itemWarna());
      }      
}

class Daftar_Warna {
      Queue<String> colors = new LinkedList<String>();
 
      public Daftar_Warna(){
 
      }
      public void setWarna(Queue<String> colors) {
            this.colors = colors;
      }
      public Queue<String> getWarna(){
            return this.colors;
      }
}

class Warna extends Daftar_Warna {
      public void tambahWarna(String colors){
            super.getWarna().add(colors);
      }
      public void hilangWarna(int index){
            System.out.println(super.getWarna().poll());
      }
      public Queue<String> itemWarna(){
            return super.getWarna();
      }
} 