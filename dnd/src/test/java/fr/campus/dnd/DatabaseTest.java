package fr.campus.dnd;

import fr.campus.dnd.Database.Database;
import fr.campus.dnd.characters.Hero;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class DatabaseTest {

    @Test
    public void shouldConnectDatabase() {
        try {
            Connection c = Database.getConnection();
            assertTrue("connection must exits", c != null);
        } catch (Exception e) {
            assertTrue("connection must be loaded", false);
        }
    }

    @Test
    public void shouldGetHeroes() {
        try {
            List<Hero> characters = Database.getHero();
            assertTrue("characters list must have 2 heroes, here is : "+ characters.size(), characters.size() == 2);
        } catch (Exception e) {
            assertTrue("connection must be loaded", false);
        }
    }
}
