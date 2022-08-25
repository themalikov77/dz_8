package kg.geektech.game.players;

public class Golem extends Hero {
    public Golem(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.DEFENDER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int damage = boss.getDamage() / 5;
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0 && heroes[i].getHealth() > 0 && this != heroes[i]) {
                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage());
                this.setHealth(this.getHealth() - damage);
                System.out.println(this.getName()+ " defender friend ");
                break;
            }
    }
    }
}
