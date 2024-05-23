package main.java.com.eunah.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application02 {

    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new FileReader("test.dat"))) {
            String s;
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

