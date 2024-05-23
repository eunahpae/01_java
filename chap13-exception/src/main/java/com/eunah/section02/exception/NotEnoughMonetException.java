package main.java.com.eunah.section02.exception;

public class NotEnoughMonetException extends Exception{

    public NotEnoughMonetException() {
    }

    public NotEnoughMonetException(String message) {
        super(message);
    }
}
