package main.java.com.eunah.question;

public class LoginRepository { // 사용자 정보 저장 및 로그인 처리

    // 최대 10명의 사용자를 저장할 수 있는 배열
    private final static UserDTO[] users = new UserDTO[10];
    // 현재 저장된 사용자 수
    private static int count;

    // 회원가입 메소드
    public boolean join(UserDTO userDTO) {
        // 위에서 지정한 배열의 길이는 10으로, 사용자가 10명 미만일 때만 가입 가능
        if (count < 10) {
            users[count++] = userDTO; // 배열에 사용자 정보 저장
            return true;
        } else {
            System.out.println("유저가 꽉 찼습니다.");
            return false;
        }
    }

    // 로그인 메소드
    public int login(UserDTO userDTO) {
        // 저장된 첫 번째 사용자가 없는 경우
        if (users[0] == null) {
            System.out.println("등록된 회원이 없습니다.");
            return 2;
        }

        // 모든 사용자 정보를 찾아 비교하여 로그인 시도
        for (int i = 0; i < users.length; i++) {
            // 사용자의 정보가 배열에 존재하고 && ID 가 일치하는 경우
            if (users[i] != null && users[i].getId().equals(userDTO.getId())) {
                if (users[i].getPwd().equals(userDTO.getPwd())) {
                    return 0;
                }
            }
        }
        System.out.println("아이디나 비밀번호가 다릅니다.");
        return 1;
    }

    // 회원탈퇴 메소드
    public boolean deleteUser(String userId) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId().equals(userId)) {
                users[i] = null;
                for (int j = 0; j < users.length - 1; j++) {
                    users[j] = users[j + 1];
                }
                users[users.length - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }
}
