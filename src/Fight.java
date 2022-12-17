import java.util.Scanner;

public class Fight {
    private player newPlayer;
    private Zombie newZombie;

    public Fight(player newPlayer, Zombie newZombie){
        this.newPlayer = newPlayer;
        this.newZombie = newZombie;
    }

   public void fight(Scanner fightInput){
    System.out.print("you have been engaged by a zombie"); 
   
        while(true){
            //is the player dead
            if(newPlayer.getHealth() <= 0){
                System.out.println("you have been killed");
                newPlayer.killPlayer();
                break;
            }

            //is the enemy dead
            if(newZombie.getHealth() <= 0){
                System.out.println("you have defeated the enemy.");
                newZombie.killZombie();
                break;
            }
            //player turn
            System.out.println("it is you turn. chose an action");
            System.out.println("1. attack");
            System.out.println("2. heal");
            System.out.println("enter a number: ");
            String choice = fightInput.nextLine();
            if(choice.equals("1")){
                int playerAttack = newPlayer.attack();
                newZombie.setHealth(playerAttack);
                System.out.println("you attacked doing " + playerAttack + " damage");
            }
            if(choice.equals("2")){ 
                newPlayer.heal();
                System.out.print("you healed");
            }

            //enemy turn
            int enemyAttack = newZombie.attack();
            newPlayer.healthDown(enemyAttack);
            System.out.println("the enemy attacked doing: "+ enemyAttack);

            //player stats
            System.out.println(newPlayer);
            System.out.println(" the enemey has: " + newZombie.getHealth() + " health");
        } 
        
   } 
}
