package src.main.fr.campus.java.dnd.characters.wizard;

public class Spell {
    private String spell;
    private int attack;
    private String filter;

    public Spell() {
        this.spell = "Avada Kedavra!";
        this.attack = 3;
        this.filter = "Invisible coat";
    }

    public Spell(String spell) {
        this.spell = spell;
        this.attack = 3;
        this.filter = "Invisible coat";
    }

    public Spell(String spell, int attack) {
        this.spell = spell;
        this.attack = attack;
        this.filter = "Invisible coat";
    }

    public Spell(String spell, int attack, String filter) {
        this.spell = spell;
        this.attack = attack;
        this.filter = filter;
    }

    public String toString() {
        return this.spell;
    }

    public String getSpell() {
        return this.spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public int getAttack() {
        return this.attack = attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getFilter() {
        return this.filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
