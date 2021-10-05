public class Game {

    private int random;
    private boolean areEnemiesAlive = true;
    GameObject entities[];
    SniperRifle rifle = new SniperRifle();

    public void createGameObjects(int numberOfEntities){
        entities = new GameObject[numberOfEntities];
        for (int i = 0; i < entities.length; i++){
            this.random = (int) (Math.random() * 10);
            if(this.random >= 0 && this.random < 5){
                this.random = (int) (Math.random() * 10);
                if(this.random >= 0 && this.random < 8){
                    entities[i] = new SoldierEnemy();
                    continue;
                }else{
                    entities[i] = new ArmouredEnemy();
                    continue;
                }
            }else{
                this.random = (int) (Math.random() * 10);
                if(this.random <= 5){
                    entities[i] = new Tree();
                    continue;
                }else{
                    entities[i] = new Barrel();
                    continue;
                }
            }
        }
    }

    public void start(){
        while(this.areEnemiesAlive){
            for (int i = 0; i < entities.length; i++) {
                if(entities[i].isEnemy() || entities[i].isDestroyable()){
                    rifle.shoot(entities[i]);
                }else{
                    System.out.println("------------------------------------------------------------------------------------------------");
                    System.out.println("Can't shoot " + entities[i].toString() + "s");
                }
            }
            this.areEnemiesAlive = false;
        }
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("All the targets have been killed with " + rifle.getShotsFired() + " shots");
    }



}
