package fr.campus.dnd.characters;

import fr.campus.dnd.characters.Hero;
/**
 Classe du personnage guerrier, qui hérite de la classe Hero
 */
public class Warrior extends Hero {
    private String weapon;
    private String shield;

    /**
     Constructeur du guerrier qui hérite d'Hero sans paramètres
     */
    public Warrior() {
        super();
        this.weapon = "Sword";
        this.shield = "Wooden shield";
    }

    /**
     Constructeur du guerrier qui hérite d'Hero avec le paramètre nom
     */
    public Warrior(String name) {
        super(name);
        this.weapon = "Sword";
        this.shield = "Wooden shield";
    }

    /**
     Constructeur du guerrier qui hérite d'Hero avec le paramètre nom, points de vie et points d'attack
     */
    public Warrior(String name, int life, int attack) {
        super(name, life, attack);
        this.weapon = "Sword";
        this.shield = "Wooden shield";
    }


    /**
     Setter de l'arme
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    /**
     Getter de l'arme
     */
    public String getWeapon() {
        return this.weapon;
    }

    /**
     Setter du bouclier
     */
    public void setShield(String shield) {
        this.shield = shield;
    }
    /**
     Getter du bouclier
     */
    public String getShield() {
        return this.shield;
    }

    /**
     * Méthode pour permettre de convertir les attibuts de l'arme et du bouclier en String
     */
    public String toString() {
        String convertedToStr = super.toString() + "\n";
        convertedToStr += "Weapon: " + this.getWeapon() + "\n";
        convertedToStr += "Shield: " + this.getShield();
        return convertedToStr;
    }
}