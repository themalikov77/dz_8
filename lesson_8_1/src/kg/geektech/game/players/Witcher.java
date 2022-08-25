package kg.geektech.game.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.RESCUER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()==0 && heroes[i]!=this && this.getHealth()>0){
                int hp = this.setHealth(this.getHealth());
                heroes[i].setHealth(hp);
                this.setHealth(0);
                System.out.println("Witcher rescuer: "+ heroes[i].getName());
                break;
            }

        }

    }
}
