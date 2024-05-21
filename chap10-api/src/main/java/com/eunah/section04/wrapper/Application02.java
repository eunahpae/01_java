package main.java.com.eunah.section04.wrapper;

public class Application02 {
    public static void main(String[] args) {

        // parsing : 문자열 (String) 으로 받은 값을 기본 자료형으로 변경하는 것

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("1");
        int i = Integer.parseInt("1");
        long l = Long.parseLong("1");
        float f = Float.parseFloat("1");
        double d = Double.parseDouble("1.0");
        boolean bl = Boolean.parseBoolean("true");

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bl);

        // char 는 parsing 을 제공하지 않는다.

    }
}
