import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

public class Thor extends Hero {
    public Thor(int health, int damage, String name, SuperAbility ability) {
        super(health, damage, name, ability);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
}
