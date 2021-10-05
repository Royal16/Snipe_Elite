import java.awt.*;

public class SniperRifle {

    private int damage = 25;
    private int shotsFired = 0;
    private int random;

    public void shoot(GameObject target){
        if(!target.isEnemy() && target.isDestroyable()){
            Barrel barrel = (Barrel) target;
            System.out.println("------------------------------------------------------------------------------------------------");
            switch(barrel.getResistance()){
                case 1:
                    System.out.println("You're shooting a Plastic Barrel");
                    break;
                case 2:
                    System.out.println("You're shooting a Wood Barrel");
                    break;
                case 3:
                    System.out.println("You're shooting a Metal Barrel");
            }
            System.out.println("Barrel's resistance: " + barrel.getResistance());
            while(barrel.getResistance() > 0){
                barrel.reduceResistance();
                System.out.println("Barrel's resistance left: " + barrel.getResistance());
                this.shotsFired++;
            }
            System.out.println("Barrel has been destroyed");
        }else {
            Enemy enemy = (Enemy) target;
            System.out.println("------------------------------------------------------------------------------------------------");
            if(enemy.getArmour() > 0){
                System.out.println("You're shooting an Armoured Enemy");
            }else{
                System.out.println("You're shooting a Soldier Enemy");
            }
            System.out.println("Target's stats: Armour: " + ((Enemy) target).getArmour() + ", Health: " + ((Enemy) target).getHealth());
            while (enemy.getHealth() > 0) {
                random = (int) (Math.random() * 11);
                if (random >= 0 && random < 7) {
                    System.out.println("You shot the target");
                    if (enemy.getArmour() > 0) {
                        enemy.hit(this.damage, "armour");
                    } else {
                        enemy.hit(this.damage, "health");
                    }
                    System.out.println("Target's stats: Armour: " + ((Enemy) target).getArmour() + ", Health: " + ((Enemy) target).getHealth());
                    this.shotsFired++;
                } else if (random >= 7 && random < 10) {
                    System.out.println("You missed the shot");
                    this.shotsFired++;
                } else if (random == 10) {
                    System.out.println("You executed the target");
                    enemy.hit(((Enemy) target).getArmour(), "armour");
                    enemy.hit(((Enemy) target).getHealth(), "health");
                    System.out.println("Target's stats: Armour: " + ((Enemy) target).getArmour() + ", Health: " + ((Enemy) target).getHealth());
                    this.shotsFired++;
                }
            }
        }
    }

    public int getShotsFired(){
        return this.shotsFired;
    }
}
