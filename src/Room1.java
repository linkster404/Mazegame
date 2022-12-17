import java.util.Scanner;
public class Room1{
    private int answer;
    public Room1(){
        answer = (int)(Math.random() * 50);
    }
    public void puzzle1(Scanner puzzle1Input ){
        System.out.println("you have enteresd a room, with a spinning dial in with the numbers 1 through 50");
        System.out.println("there is an arrow on one side of the dial");

        while(true){
            System.out.print("pick a number to turn it to");
            int guess = puzzle1Input.nextInt();
            if(guess == answer){
                System.out.println("you have escaped");
                break;
            }
        }
    }
}