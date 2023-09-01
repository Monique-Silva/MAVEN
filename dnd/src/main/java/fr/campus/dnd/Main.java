package fr.campus.dnd;

import fr.campus.dnd.Database.Database;
import fr.campus.dnd.exceptions.PropertiesException;
import fr.campus.dnd.menu.Menu;

public class Main {
    public static void main(String[] args) throws PropertiesException {

        Menu menu = new Menu();
        menu.startGame();
        Database database = new Database();
        }
}