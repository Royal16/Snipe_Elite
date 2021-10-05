public class ArmouredEnemy extends Enemy{
    private String name;

    public ArmouredEnemy(){
        this.name = "ArmouredEnemy";
        setArmour(100);
        setHealth(100);
    }
    public String toString(){
        return this.name;
    }
}
