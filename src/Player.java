import java.util.Scanner;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int pickAField() {
        int pickedField;
        System.out.println("what field do you want?");
        Scanner scanner = new Scanner(System.in);
        pickedField = scanner.nextInt();

        return pickedField;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
