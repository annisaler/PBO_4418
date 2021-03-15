public class TestTV {
	String nama;
	int channel;
	int volumeLevel;
	boolean on;
	public TestTV(){
		if (on) {
			
			this.volumeLevel = 1;
			this.channel = 1;
		}
		else{
			this.nama = " ";
			this.volumeLevel = 0;
			this.channel = 0;
		}
	}


	public void turnOn(){
		on = true;
	}
	public void turnOff(){
		on = false;
	}
	public void setChannel(int newChannel){
		if (on) {
			channel = newChannel;
		}
		else{
			System.out.println("TV Belum dihidupkan.");
		}
	}
	public void setVolume(int newVolumeLevel){
		if (on) {
			volumeLevel = newVolumeLevel;
		}
		else{
			System.out.println("TV Belum dihidupkan.");
		}
	}
	public void channelUp(){
		if (on) {
			channel++;
		}
		else{
			System.out.println("TV Belum dihidupkan.");
		}
	}
	public void channelDown(){
		if (on) {
			channel--;
		}
		else{
			System.out.println("TV Belum dihidupkan.");
		}
	}
	public void volumeUp(){
		if (on) {
			volumeLevel++;
		}
		else{
			System.out.println("TV Belum dihidupkan.");
		}
	}
	public void volumeDown(){
		if (on) {
			volumeLevel--;
		}
		else{
			System.out.println("TV Belum dihidupkan.");
		}
	}
	public static void main(String[] args) {

	}
}