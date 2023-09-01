package fr.campus.dnd;

import fr.campus.dnd.Database.Database;
import fr.campus.dnd.exceptions.PropertiesException;
import fr.campus.dnd.menu.Menu;

/**
 * Classe principal pour démarrer le programme
 */
public class Main {
    /**
     * @param args Reçoit l'argument classique Main du type String
     *             * Méthode main pour démarrer le programme avec l'instanciation de l'objet Menu et l'appel de la méthode startGame() à partir du menu pour démarrer le jeu
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.startGame();
    }
}