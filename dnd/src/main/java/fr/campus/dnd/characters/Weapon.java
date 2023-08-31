package src.main.fr.campus.java.dnd.characters.warrior;
public class Weapon {


    private String weapon;
    private int attack;
    private String shield;

    public Weapon(String weapon) {
        this.weapon = weapon;
        this.attack = 2;
        this.shield = "Wooden shield";
    }

    public Weapon(String weapon, int attack) {
        this.weapon = weapon;
        this.attack = attack;
        this.shield = "Wooden shield";
    }

    public Weapon(String weapon, int attack, String shield) {
        this.weapon = weapon;
        this.attack = attack;
        this.shield = shield;
    }
    public String toString() {
        return this.weapon;
    }

    public String getWeapon() {
        return this.weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public int getAttack() {
        return this.attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public String getShield(){
        return this.shield;
    }
    public void setShield(String shield){
        this.shield = shield;
    }
}
