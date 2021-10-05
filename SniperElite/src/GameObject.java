public class GameObject {
    private String name;

    public String toString(){
        return this.name;
    }

    public boolean isEnemy(){
        return false;
    }

    public boolean isDestroyable(){
        return false;
    }
}
