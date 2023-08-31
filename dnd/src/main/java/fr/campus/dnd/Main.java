package fr.campus.dnd;

import fr.campus.dnd.menu.Menu;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {

        Menu menu = new Menu();
        menu.startGame();
        List<Hero> hero = Database.getHero();
        while(int i=0;i<hero.size();i++) {
            System.out.println(hero.get(i));
        }

    }
}