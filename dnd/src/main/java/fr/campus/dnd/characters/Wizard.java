package fr.campus.dnd.characters;
import fr.campus.dnd.characters.Hero;

public class Wizard extends Hero {
    public String spell;
    public String filter;

    public Wizard() {
        super();
        this.spell = "Avada Kedavra!";
        this.filter = "Invisibility coat";
    }

    public Wizard(String name) {
        super(name);
        this.spell = "Avada Kedavra!";
        this.filter = "Invisibility coat";
    }

    public Wizard(String name, int life, int attack) {
        super(name, life, attack);
        this.spell = "Avada Kedavra!";
        this.filter = "Invisibility coat";
    }

    public String getSpell() {
        return this.spell;
    }
    public void setSpell(String spell){
        this.spell = spell;
    }
    public String getFilter() {
        return this.filter;
    }
    public void setFilter(String filter){
        this.filter = filter;
    }
    public String toString() {
        String convertedToStr = super.toString() + "\n";
        convertedToStr += "Spell: " + this.getSpell() + "\n";
        convertedToStr += "Filter: " + this.getFilter();
        return convertedToStr;
    }
}