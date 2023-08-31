package fr.campus.dnd.Database;

import fr.campus.dnd.characters.Hero;
import fr.campus.dnd.characters.Warrior;
import fr.campus.dnd.characters.Wizard;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.sql.*;

public class Database {
    private static Connection connection; //objet pour se connecter a la base de données

    public static Connection getConnection() throws DatabaseException {
        if (connection == null) {
            try {
                InputStream in = new FileInputStream(".env");
                Properties prop = new Properties();
                prop.load(in);

                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/Heroes", prop.getProperty("database.username"), prop.getProperty("database.password"));
            } catch (Exception e) {
                throw new DatabaseException(e.getMessage());
            }
        }
        return connection;
    }

    //etape 2. connexion à la base:
    public static List<Hero> getHero() throws DatabaseException {
        List<Hero> heroes = new ArrayList<Hero>(); //initialisation de la liste des hero

        try {
            Statement statement = getConnection().createStatement();

            //etape 3. execution de la requete:
            ResultSet result = statement.executeQuery("SELECT * FROM Hero;");

            //etape 4. recuperation des données:
            while (result.next()) {
                Hero hero = null;
                String type = result.getString("type");
                if (type.equals("Warrior")) {
                    hero = new Warrior(result.getString("name"), result.getInt("life"), result.getInt("attack"));
                }
                if (type.equals("Wizard")) {
                    hero = new Wizard(result.getString("name"), result.getInt("life"), result.getInt("attack"));
                }
                String name = result.getString("name");
                Integer life = result.getInt("life");
                Integer attack = result.getInt("attack");
                String power = result.getString("power");
                String shield = result.getString("shield");

                heroes.add(hero);
            }
        } catch (Exception e) {
            throw new DatabaseException(e.getMessage());
        }

        return heroes;
    }
}