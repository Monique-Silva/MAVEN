package fr.campus.dnd.menu;
import fr.campus.dnd.Database.Database;
import fr.campus.dnd.characters.Hero;
import fr.campus.dnd.characters.Wizard;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
public class Menu {
    private String keyboardScan;
    private Hero avatar;
    private String hero;

    public Menu() {
        this.keyboardScan = null;
        this.avatar = null;
        this.hero = null;
    }

    public void startGame() {
        System.out.println("Welcome to the Dungeons and Dragons adventure!\nShould we begin?");
        this.showMenu1();
        do {
            this.showMenu2();
            switch (keyboardScan) {
                case "I" -> {
                    this.showInfo();
                }
                case "M" -> {
                    this.modifyHero();
                }
                case "P" -> {
                    //this.toPlay();
                }
                case "Q" -> {
                    this.toQuit();
                }
            }
        } while (!(keyboardScan.equals("Q")));
    }

    public void showMenu1() {
        System.out.println("Menu:\nChoose character(C)\nQuit(Q)");
        keyboardScan = scanKeyboard();
        switch (keyboardScan) {
            case "C" -> {
                hero = this.chooseHero();
            }
            case "Q" -> {
                this.toQuit();
            }
        }
    }

    public void showMenu2() {
        do {
            System.out.println("Menu:\nShow character information(I)\nModify your character(M)\nPlay(P)\nQuit(Q)");
            keyboardScan = scanKeyboard();
        } while (!(keyboardScan.equals("I") || keyboardScan.equals("M") || keyboardScan.equals("P") || keyboardScan.equals("Q")));
    }

    public String scanKeyboard() {
        String optionChosen;
        Scanner keyboard = new Scanner(System.in);
        optionChosen = keyboard.nextLine().toUpperCase();
        return optionChosen;
    }

    public String chooseHero() {
        String heroChosen;
        do {
            System.out.println("Ok! Let's choose your character:");
            List<Hero> hero = Database.getHero();
            for (int i = 0; i < hero.size(); i++) {
                System.out.println(hero.get(i));
            }
            System.out.println("Choose an option: She-Ra(WR), Hermione(WZ) or Quit(Q)");
            Scanner keyboard = new Scanner(System.in);
            heroChosen = keyboard.nextLine().toUpperCase();
        } while (!(heroChosen.equals("WR") || heroChosen.equals("WZ") || heroChosen.equals("Q")));
        switch (heroChosen) {
            case "WR" -> {
                System.out.println( /*trouver comment insérer le name du personnage ici */ "Good choice!");
                this.createHero(hero);
            }
            case "WZ" -> {
                //avatar = new Wizard();
                hero = "wizard";
                System.out.println("A " + hero + "? Good choice!");
                this.createHero(hero);
            }
            case "Q" -> {
                toQuit();
            }
        }
        return hero;
    }

    public void createHero(String hero) {
        System.out.println("How do you want to call your " + hero + "?");
        keyboardScan = scanKeyboard();
        avatar.setName(keyboardScan);
        switch (hero) {
            case "warrior" -> {
                defineLevel("life", 5, 10);
            }
            case "wizard" -> {
                defineLevel("life", 3, 6);
            }
        }
        keyboardScan = scanKeyboard();
        avatar.setLife(Integer.parseInt(keyboardScan));
        switch (hero) {
            case "warrior" -> {
                defineLevel("attack", 5, 10);
            }
            case "wizard" -> {
                defineLevel("attack", 8, 15);
            }
        }
        keyboardScan = scanKeyboard();
        avatar.setAttack(Integer.parseInt(keyboardScan));
        System.out.println("Welcome to life, " + avatar.getName() + "! Are you ready to start?\nLet's go!");
    }

    public void defineLevel(String points, int min, int max) {
        System.out.println("Choose your " + points + " points (" + min + "-" + max + "):");
    }

    public void toQuit() {
        System.out.println("Are you sure you want to quit (Y/N)?");
        Scanner keyboard2 = new Scanner(System.in);
        keyboardScan = keyboard2.nextLine().toUpperCase();
        switch (keyboardScan) {
            case "Y" -> {
                System.out.println("Ok, see you next time!");
                System.exit(0);
            }
            case "N" -> {
                System.out.println("Ok, let's start from the beginning.");
                this.startGame();
            }
        }
    }

    public void showInfo() {
        System.out.println("This is you:\n" + avatar);
    }

    public void modifyHero() {
        do {
            System.out.println("What do you want to change?\n" + avatar + "\nName(N)\nLife Points(L)\nAttack points(A)\nBack to menu(B)");
            keyboardScan = scanKeyboard();
            switch (keyboardScan) {
                case "N":
                    System.out.println("New name:");
                    keyboardScan = scanKeyboard();
                    avatar.setName(keyboardScan);
                    break;
                case "L":
                    System.out.println("New life points:");
                    keyboardScan = scanKeyboard();
                    avatar.setLife(Integer.parseInt(keyboardScan));
                    break;
                case "A":
                    System.out.println("New attack points:");
                    keyboardScan = scanKeyboard();
                    avatar.setAttack(Integer.parseInt(keyboardScan));
                    break;
                case "B":
                    this.showMenu2();
            }
            System.out.println("Do you want to change anything else?(Y/N)");
            keyboardScan = scanKeyboard();
        } while (!keyboardScan.equals("N"));
    }

}
