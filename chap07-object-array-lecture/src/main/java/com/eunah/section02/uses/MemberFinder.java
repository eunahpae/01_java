package main.java.com.eunah.section02.uses;

public class MemberFinder {  // 멤버를 조회하겠다는 명령을 repo 에게 내리는 클래스

    public Member[] findAllMembers(){
        return MemberRepository.findAllMembers();
    }

}
