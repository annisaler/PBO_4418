public class Matematika{

    public static void main(String[] args){
        MatematikaDemo matematika1 = new MatematikaDemo();
        matematika1.penjumlahan(20,20);

        matematika1.pengurangan(10,5);
        
        matematika1.perkalian(10,5);

        matematika1.pembagian(20,2);

    }
}

class MatematikaDemo{
    int a;
    int b;
    
    public void penjumlahan(int a, int b){
        int jumlahTambah = a + b;
        System.out.println("pertambahan: "+a+" + "+b+" = "+jumlahTambah);
    }
    public void pengurangan(int a, int b){
        int jumlahKurang = a - b;
        System.out.println("pengurangan: "+a+" - "+b+" = "+jumlahKurang);
    }
    public void pembagian(int a, int b){
        int jumlahBagi = a / b;
        System.out.println("pembagian: "+a+" / "+b+" = "+jumlahBagi);
    }

    public void perkalian(int a, int b){
        int jumlahKali = a * b;
        System.out.println("perkalian: "+a+" * "+b+" = "+jumlahKali);

    }

}