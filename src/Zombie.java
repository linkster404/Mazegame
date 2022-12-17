public class Zombie {
    private int health;
    private int attack;
    private boolean dead;

    public Zombie(player newPlayer){
        health = (newPlayer.getLevel()/2)*(int)(Math.random()*5);
        attack = (newPlayer.getLevel()/2)*(int)(Math.random()*5);
        dead = false;
    }

    public int getHealth(){
        return health;
    }
    public int getAttack(){
        return attack;
    }
    public void setHealth(int num){
        health = health - num;
    }
    public int attack(){
        return attack*(int)(Math.random()*5);
    }
    public void killZombie(){
        dead = true;
    }
    public boolean getDead(){
        return dead;
    }
}
