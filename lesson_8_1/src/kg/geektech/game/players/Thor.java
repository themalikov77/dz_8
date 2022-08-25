package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

boolean boolear= RPG_Game.random.nextBoolean();
if (this.getHealth()>0 && boolear== true){
    boss.setDamage(0);
    System.out.println(this.getName() + " stun" );

}else {boss.setDamage(100);

}
    }
}
