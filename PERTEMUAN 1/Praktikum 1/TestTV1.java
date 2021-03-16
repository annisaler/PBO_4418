public class TestTV1 {
	public static void main(String[] args){
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3); 

		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();


		System.out.println("TV1's Channel: " + tv1.channel + ", volume level: " + tv1.volumeLevel);
		System.out.println("TV2's Channel: " + tv2.channel + ", volume level: " + tv2.volumeLevel);
	}

}

