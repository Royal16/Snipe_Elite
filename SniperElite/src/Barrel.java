public class Barrel extends GameObject implements Destroyable {
    @Override
    public boolean isDestroyable(){
        return true;
    }
    private String name;
    private int resistance;
    private int random;

    public Barrel(){
        random = (int) (Math.random() * BarrelType.values().length);
        BarrelType barrelType = BarrelType.values()[random];
        switch(barrelType){
            case PLASTIC:
                this.name = "Plastic barrel";
                setResistance(1);
                break;
            case WOOD:
                this.name = "Wood barrel";
                setResistance(2);
                break;
            case METAL:
                this.name = "Metal barrel";
                setResistance(3);
                break;
        }
    }
    public String toString(){
        return this.name;
    }

    public int getResistance(){
        return this.resistance;
    }
    public void setResistance(int resistance){
        this.resistance = resistance;
    }
    public void reduceResistance(){
        this.resistance--;
    }


}
