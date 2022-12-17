import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("what is your name:");
        Scanner userInput = new Scanner(System.in);
        player player1 = new player(userInput.nextLine());

        System.out.println("welcome to the maze " + player1.getName());
        System.out.println("you will have to face many trials to get out of here");
        System.out.println("good luck");

        Zombie enemy1 = new Zombie(player1);
        Fight Fight1 = new Fight(player1, enemy1);
        Fight1.fight(userInput);
    }
}
