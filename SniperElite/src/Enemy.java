public class Enemy extends GameObject{

    public int health;
    public int armour;

    public void hit(int damage, String target){
        switch(target){
            case "armour":
                this.armour = this.armour - damage;
                break;
            case "health":
                this.health = this.health - damage;
                break;
        }
    }

    public void setHealth(int health){
        this.health = health;
    }
    public void setArmour(int armour){
        this.armour = armour;
    }
    public int getArmour(){
        return this.armour;
    }
    public int getHealth(){
        return this.health;
    }

    @Override
    public boolean isEnemy(){
        return true;
    }

}
