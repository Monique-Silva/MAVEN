package fr.campus.dnd.characters;
import fr.campus.dnd.characters.Hero;
/**
 Classe du personnage magicien, qui hérite de la classe Hero
 */
public class Wizard extends Hero {
    public String spell;
    public String filter;

    /**
     Constructeur du magicien qui hérite d'Hero sans paramètres
     */
    public Wizard() {
        super();
        this.spell = "Avada Kedavra!";
        this.filter = "Invisibility coat";
    }
    /**
     Constructeur du magicien qui hérite d'Hero avec le paramètre nom
     */
    public Wizard(String name) {
        super(name);
        this.spell = "Avada Kedavra!";
        this.filter = "Invisibility coat";
    }
    /**
     Constructeur du magicien qui hérite d'Hero avec le paramètre nom, points de vie et points d'attack
     */
    public Wizard(String name, int life, int attack) {
        super(name, life, attack);
        this.spell = "Avada Kedavra!";
        this.filter = "Invisibility coat";
    }
    /**
     Getter du sort
     */
    public String getSpell() {
        return this.spell;
    }

    /**
     Setter du sort
     */
    public void setSpell(String spell){
        this.spell = spell;
    }
    /**
     Getter du filtre
     */
    public String getFilter() {
        return this.filter;
    }
    /**
     Setter du filtre
     */
    public void setFilter(String filter){
        this.filter = filter;
    }

    /**
     * Méthode pour permettre de convertir les attibuts du sort et du filtre en String
     */
    public String toString() {
        String convertedToStr = super.toString() + "\n";
        convertedToStr += "Spell: " + this.getSpell() + "\n";
        convertedToStr += "Filter: " + this.getFilter();
        return convertedToStr;
    }
}