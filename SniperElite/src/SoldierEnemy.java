public class SoldierEnemy extends Enemy{

    private String name;

    public SoldierEnemy(){
        this.name = "Soldier Enemy";
        setArmour(0);
        setHealth(100);
    }
    public String toString(){
        return this.name;
    }
}
