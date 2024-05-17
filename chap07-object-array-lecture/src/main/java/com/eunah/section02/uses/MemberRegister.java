package main.java.com.eunah.section02.uses;

public class MemberRegister {  // 회원 등록을 repo 명령하는 클래스

    public void regist(Member[] members){
        System.out.println("회원을 등록합니다");
        for (Member member:members) {
            System.out.println(member.getInfo() + "님을 회원 등록 시도 합니다.");
        }

        if(MemberRepository.store(members)){
            System.out.println("총 " + members.length + " 명의 회원 등록에 성공했습니다.");
        }else{
            System.out.println("인원이 마감되어 등록에 실패하였습니다.");
        }

    }

}
