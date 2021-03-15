public class buku{
    String judul;
    String pengarang;
    String penerbit;
    int tahun;



    public buku(String judul, String pengarang, String penerbit,int tahun){
        this.judul = judul ;
        this.pengarang = pengarang ;
        this.penerbit = penerbit ;
        this.tahun = tahun ;

    }

    public void cetakBuku(){
        System.out.println("judul:"+this.judul);
        System.out.println("pengarang:"+this.pengarang);
        System.out.println("penerbit:"+this.penerbit);
        System.out.println("tahun:"+this.tahun);

    }

}
