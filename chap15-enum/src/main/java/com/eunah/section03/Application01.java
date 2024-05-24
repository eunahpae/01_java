package main.java.com.eunah.section03;

import java.util.EnumSet;
import java.util.Iterator;

public class Application01 {
    public static void main(String[] args) {

        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin);
        System.out.println(admin.getNameToLowerCase());

        UserRole2 consumer = UserRole2.CONSUMER;
        System.out.println(consumer.ordinal() + " " + consumer.name() + " " + consumer.getDescription());

        UserRole2 consumer2 = UserRole2.CONSUMER;

        if (consumer2.equals(consumer)) {
            System.out.println("동일 비교");
        }

        // EnumSet 을 활용하여 여러 열거형 타입들을 set 으로 취급할 수 있다.
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iterator = roles.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().name());
        }

        // 특정 상수만 골라서 set 에 추가할 수 있다.
        System.out.println("=====================");
        EnumSet<UserRole2> users = EnumSet.of(UserRole2.CONSUMER, UserRole2.PRODUCER);
        Iterator<UserRole2> iterator2 = users.iterator();
        while (iterator2.hasNext()) {
            UserRole2 role2 = iterator2.next();
            System.out.println(role2.ordinal() + " " + role2.getDescription());
        }

        // 특정 상수를 제외하여 set 에 추가할 수 있다.
        EnumSet<UserRole2> notGuest = EnumSet.complementOf(EnumSet.of(UserRole2.GUEST));
        Iterator<UserRole2> notGuestiter = notGuest.iterator();
        while (notGuestiter.hasNext()) {
            UserRole2 role3 = notGuestiter.next();
            System.out.println(role3.ordinal() + " " + role3.getDescription());
        }
    }
}
