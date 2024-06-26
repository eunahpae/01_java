package main.java.com.eunah.section04.understand.service;

import main.java.com.eunah.section04.understand.auth.GoogleAuth;
import main.java.com.eunah.section04.understand.auth.KakaoAuth;
import main.java.com.eunah.section04.understand.auth.NaverAuth;
import main.java.com.eunah.section04.understand.auth.SnsAuth;
import main.java.com.eunah.section04.understand.dto.MemberDTO;

public class MemberService {

    public void findMember(String authType, MemberDTO memberDTO) {

        switch (authType) {
            case "google":
                SnsAuth google = new GoogleAuth();
                boolean result = google.login(memberDTO);
                if (result) {
                    System.out.println("구글 아이디로 인증 된 " + memberDTO.getId() + "님 환영합니다.");
                } else {
                    System.out.println("구글에 인증된 회원이 없습니다.");
                }
                break;
            case "naver":
                SnsAuth naver = new NaverAuth();
                boolean result1 = naver.login(memberDTO);
                if (result1) {
                    System.out.println("네이버 아이디로 인증 된 " + memberDTO.getId() + "님 환영합니다.");
                } else {
                    System.out.println("네이버에 인증된 회원이 없습니다.");
                }
                break;
            case "kakao":
                SnsAuth kakao = new KakaoAuth();
                boolean result2 = kakao.login(memberDTO);
                if (result2) {
                    System.out.println("카카오 아이디로 인증 된 " + memberDTO.getId() + "님 환영합니다.");
                } else {
                    System.out.println("카카오에 인증된 회원이 없습니다.");
                }
                break;
            default:
                System.out.println("존재하지 않는 인증 유형입니다.");
        }

    }

}
