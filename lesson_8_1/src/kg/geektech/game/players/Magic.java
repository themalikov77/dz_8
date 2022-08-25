package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int n = 15;
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + n);
            System.out.println(this.getName() + " Uvelichil damage " + heroes[i].getName() + " na: " + (heroes[i].getDamage() + n));
            break;

        }

    }
}
