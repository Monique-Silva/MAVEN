package fr.campus.dnd.characters;

public abstract class Hero {
    //public String keyboardScan;
    protected String name;
    protected int life;
    protected int attack;

    public Hero() {
        this.name = " ";
        this.life = 0;
        this.attack = 0;
    }

    public Hero(String name) {
        this.name = name;
        this.life = 0;
        this.attack = 0;
    }

    public Hero(String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


    public String toString() {
        String convertedToStr;
        convertedToStr = "Name: " + this.getName() + "\n";
        convertedToStr += "Life points: " + this.getLife() + "\n";
        convertedToStr += "Attack points: " + this.getAttack();
        return convertedToStr;
    }
}