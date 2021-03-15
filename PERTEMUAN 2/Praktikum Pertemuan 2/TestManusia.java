class Manusia{

	private String nama = " ";
	private Boolean checkTV = false;

	public Manusia(){

	}

	public Manusia( String nama){
		this.nama = nama;
	}

	public String myName(){
		return nama;
	}

	public void beliTV( TestTV tvku){
		checkTV = true;
	}

	public void jualTV(){
		checkTV = false;
	}


	public Boolean check(){

		return checkTV;
	}



}

public class TestManusia{

	public static void main(String[] args) {
		Manusia manusia1 = new Manusia("Annisa Luthfi");

		System.out.println(manusia1.myName());

		TestTV tvku = new TestTV();
		manusia1.beliTV(tvku);
		System.out.println(manusia1.check());

		manusia1.jualTV();
		System.out.println(manusia1.check());
	}
}
