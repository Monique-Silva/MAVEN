package fr.campus.dnd;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class PropertiesTest {

    @Test
    public void shouldLoadProperties() {
        Properties prop = new Properties();
        try {
            InputStream in = new FileInputStream(".env");
            prop.load(in);
        } catch (Exception e) {
            assertTrue(".env must be loaded", false);
        }

        String username = prop.getProperty("database.username");
        assertTrue("username must equals to monique_silva, here is : "+ username, username.equalsIgnoreCase("monique_silva"));
    }

}
