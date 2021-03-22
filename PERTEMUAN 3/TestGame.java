
public class TestGame {
    public static void main(String[] args) {
      
            GamePlayer demo1  = new GamePlayer();
            demo1.setPosition(60,90);
            demo1.Run(120);
            demo1.Run();

            GamePlayer demo2 = new GamePlayer();
            demo2.setPosition(70,80);
            demo2.Run(130);
            demo2.Run();
    }
}
