package fr.campus.dnd.exceptions;

public class PropertiesException extends Exception {
    public PropertiesException() {
    }
    public PropertiesException(String message) {
        super(message);
    }
    public PropertiesException(Throwable cause) {
        super(cause);
    }
    public PropertiesException(String message, Throwable cause) {
        super(message, cause);
    }
}
