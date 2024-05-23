package main.java.com.eunah.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application02 {
    public static void main(String[] args) {

        /*
         * Properties 란?
         * HashMap 으로 구현하여 사용 용법이 거의 유사하지만 key 와 value 모두 문자열만 사용할 수 있는 자료구조이다.
         * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
         */

        Properties prop = new Properties();
        prop.setProperty("driver", "mysql.jdbc.driver.MysqlDriver");
        prop.setProperty("url", "localhost");
        prop.setProperty("user", "user");
        prop.setProperty("pass", "pass");
        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbcDriver");
            prop.store(new FileWriter("driver.txt"), "jdbc Diver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc diver");
        }catch (FileNotFoundException e ){
            e.printStackTrace();
        }catch (IOException e ){
            e.printStackTrace();
        }



        Properties prop2 = new Properties();
        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));
            prop2.list(System.out);

            System.out.println(prop2.getProperty("driver"));
            System.out.println(prop2.getProperty("url"));
            System.out.println(prop2.getProperty("user"));
            System.out.println(prop2.getProperty("pass"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
