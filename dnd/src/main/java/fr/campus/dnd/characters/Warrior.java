package fr.campus.dnd.characters;

import fr.campus.dnd.characters.Hero;

public class Warrior extends Hero {
    private String weapon;
    private String shield;

    public Warrior() {
        super();
        this.weapon = "Sword";
        this.shield = "Wooden shield";
    }

    public Warrior(String name) {
        super(name);
        this.weapon = "Sword";
        this.shield = "Wooden shield";
    }

    public Warrior(String name, int life, int attack) {
        super(name, life, attack);
        this.weapon = "Sword";
        this.shield = "Wooden shield";
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getShield() {
        return this.shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public String toString() {
        String convertedToStr = super.toString() + "\n";
        convertedToStr += "Weapon: " + this.getWeapon() + "\n";
        convertedToStr += "Shield: " + this.getShield();
        return convertedToStr;
    }
}