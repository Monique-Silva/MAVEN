package fr.campus.dnd.characters;

/**
 Classe parent Hero
 */
public abstract class Hero {
    //public String keyboardScan;
    protected String name;
    protected int life;
    protected int attack;

    /**
     Constructeur du hero sans paramètres
     */
    public Hero() {
        this.name = " ";
        this.life = 0;
        this.attack = 0;
    }

    /**
     Constructeur du hero avec le paramètre nom
     */
    public Hero(String name) {
        this.name = name;
        this.life = 0;
        this.attack = 0;
    }

    /**
     Constructeur du hero avec le paramètre nom, points de vie et points d'attack
     */
    public Hero(String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
    }

    /**
     Getter du nom
     */
    public String getName() {
        return this.name;
    }

    /**
     Setter du nom
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     Getter des points de vie
     */
    public int getLife() {
        return this.life;
    }
    /**
     Setter des points de vie
     */
    public void setLife(int life) {
        this.life = life;
    }
    /**
     Getter des points d'attack
     */
    public int getAttack() {
        return this.attack;
    }
    /**
     Setter des points d'attack
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * Méthode pour permettre de convertir les attibuts du nom, points de vie et points d'attack en String
     */
    public String toString() {
        String convertedToStr;
        convertedToStr = "Name: " + this.getName() + "\n";
        convertedToStr += "Life points: " + this.getLife() + "\n";
        convertedToStr += "Attack points: " + this.getAttack();
        return convertedToStr;
    }
}