package main.java.com.eunah.section02.uses;

public class MemberRepository {  // db 연결부 - 데이터 수행

    private final static Member[] members;
    
    private static int count;
    
    static{
        members = new Member[10];
    }
    
    public static boolean store(Member[] newMembers){
        for (int i = 0; i < newMembers.length; i++) {

            if(count != 10){
                members[count++] = newMembers[i];

            }else{
                System.out.println("정원 초과");
                return false;
            }
        }

        return true;
    }

    public static Member[] findAllMembers() {
        return members;
    }
}
