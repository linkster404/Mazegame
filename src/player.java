public class player {
    private String name;
    private int level;
    private int health;
    private int attack;
    private boolean dead;

    public player(String playerName){
        name = playerName;
        level = 1;
        dead = false;
        setHealth();
        setAttack();
    }

    public int setHealth(){
        health = level*(int)(Math.random() * 5 + 1);
        return health;
    }

    public int setAttack(){
        attack = level*(int)(Math.random()*5 + 1);
        return attack;
    }
    public void updateLevel(){
        level++;
    }
    public int getHealth(){
        return health;
    }
    public void healthDown(int num){
        health = health - num;
    }
    public void heal(){
        health = health + level * (int)(Math.random()*2+1);
    }
    public int getAttack(){
        return attack;
    }
    public int attack(){
        return attack*(int)(Math.random()*5);
    }
    public int getLevel(){
        return level;
    }
    public String getName(){
        return name;
    }
    public void killPlayer(){
        dead = true;
    }
    public boolean getDead(){
        return dead;
    }
    public String toString(){
        return name + ": \n health:" + health + "\n attack: " + attack + "\n level";
    }
}
