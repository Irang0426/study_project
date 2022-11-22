package irang.chapter3.ch16;

public class MainBoardPlay {
    public static void main(String[] args) {
         Player player = new Player();
         player.play(1);

         player.upgradeLevel(new AdvancedLevel());
         player.play(1);

         player.upgradeLevel(new SuperLevel());
         player.play(1);
    }
}
