import java.util.Stack;

public class Inheritance_Stack {
      public static void main(String args[]){
            Warna color = new Warna();
            System.out.println(color.itemWarna());
 
            color.tambahWarna("Hitam");
            color.tambahWarna("Putih");
            color.tambahWarna("Abu-abu");
            color.tambahWarna("Biru");
            System.out.println(color.itemWarna());
 
            color.gantiWarna(2,"Kuning");
            System.out.println(color.itemWarna());
 
            color.hilangWarna();
            System.out.println(color.itemWarna());
      }
}
 
class Daftar_Warna {
      Stack<String> colors = new Stack<String>();
 
      public Daftar_Warna(){
 
      }
      public void setWarna(Stack<String> colors) {
            this.colors = colors;
      }
      public Stack<String> getWarna(){
            return this.colors;
      }
} 
 
class Warna extends Daftar_Warna {
      public void tambahWarna(String colors){
            super.getWarna().push(colors);
      }
      public String hilangWarna(){
            return super.getWarna().pop();
      }
      public void gantiWarna(int index,String colors){
            super.getWarna().set(index, colors);
      }
      public Stack<String> itemWarna(){
            return super.getWarna();
      }
}

