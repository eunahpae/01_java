package main.java.com.eunah.question;

import java.util.Scanner;

public class LoginService { // 회원가입 및 로그인 서비스

    Scanner scr = new Scanner(System.in);
    LoginRepository loginRepository = new LoginRepository();
    private UserDTO loggedInUser;

    public int login() {

        System.out.println("아이디를 입력 해주세요 : ");
        String id = scr.nextLine();
        System.out.println("비밀번호를 입력 해주세요 : ");
        String pwd = scr.nextLine();

        UserDTO userDTO = new UserDTO(id, pwd);
        int isTrue = loginRepository.login(userDTO);
        if (isTrue == 0) {
            System.out.println("로그인 완료 되었습니다.");
            loggedInUser = userDTO;
            return 1;
        } else  {
            return 2;
        }
    }

    public void signUp() {

        System.out.println("======회원 가입 창======");
        System.out.println("아이디를 입력 해주세요 : ");
        String id = scr.nextLine();
        System.out.println("이름을 입력 해주세요 : ");
        String name = scr.nextLine();

        while (true) {
            System.out.println("비밀번호를 입력 해주세요 : ");
            String pwd = scr.nextLine();
            System.out.println("비밀번호를 다시 한 번 입력 해주세요 : ");
            String checkPwd = scr.nextLine();
            if (pwd.equals(checkPwd)) {
                UserDTO userDTO = new UserDTO(id, pwd, name);
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

    public void deleteUser() {
        if (loggedInUser != null) {
            System.out.println("정말 탈퇴하시겠습니까? 복구 불가능합니다. (Y/N)");
            String answer = scr.nextLine();

            if (answer.equals("Y")) {
                boolean isDelete = loginRepository.deleteUser(loggedInUser.getId());
                if (isDelete) {
                    System.out.println("회원 탈퇴가 완료되었습니다.");
                    loggedInUser = null; // 현재 로그인된 사용자 정보 초기화
                    System.out.println("메인화면으로 돌아갑니다.");
                    System.out.println("");
                    // System.exit(0);  탈퇴한 아이디로 로그인 확인이 필요해서, 프로그램 종료하지 않고 메인으로 돌아감.
                }
            } else {
                System.out.println("잘 생각하셨습니다.");
            }
        } else {
            System.out.println("로그인 상태가 아닙니다.");
        }
    }
}
