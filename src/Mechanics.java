import java.util.Scanner;

public class Mechanics {
   private String player1Name;
   private String player2Name;

   public void setupGame() {
       createPlayers();
   }

    public void createPlayers() {


        System.out.println("what is the name of player1?");
        Scanner scanner = new Scanner(System.in);
        player1Name = scanner.nextLine();
        Player player1 = new Player(player1Name);

        System.out.println("what is the name of player2?");
        Scanner scanner2 = new Scanner(System.in);
        player2Name = scanner2.nextLine();
        Player player2 = new Player(player2Name);

    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }
}
