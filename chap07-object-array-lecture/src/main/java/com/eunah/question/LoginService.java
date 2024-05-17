package main.java.com.eunah.question;

import java.util.Scanner;

public class LoginService {

    Scanner scr = new Scanner(System.in);
    LoginRepository loginRepository = new LoginRepository();

    public int login() {

        System.out.println("아이디를 입력 해주세요 : ");
        String a = scr.nextLine();
        System.out.println("비밀번호를 입력 해주세요 : ");
        String b = scr.nextLine();

        UserDTO userDTO = new UserDTO(a, b);
        int isTrue = loginRepository.login(userDTO);
        if (isTrue == 0) {
            System.out.println("로그인 완료 되었습니다.");
            return 1;
        } else  {
            return 2;
        }


    }

    public void signUp() {

        System.out.println("======회원 가입 창======");
        System.out.println("아이디를 입력 해주세요 : ");
        String a = scr.nextLine();
        System.out.println("이름을 입력 해주세요 : ");
        String b = scr.nextLine();

        while (true) {
            System.out.println("비밀번호를 입력 해주세요 : ");
            String c = scr.nextLine();
            System.out.println("비밀번호를 다시 한 번 입력 해주세요 : ");
            String d = scr.nextLine();
            if (c.equals(d)) {
                UserDTO userDTO = new UserDTO(a, c, b);
                boolean isTrue = loginRepository.join(userDTO);
                if (isTrue) {
                    System.out.println("등록 완료 되었습니다.");
                    System.out.println(" ");
                    return;
                }
                System.out.println(" ");
                return;
            } else {
                System.out.println("비밀번호가 서로 다릅니다.");
            }
        }
    }
}
