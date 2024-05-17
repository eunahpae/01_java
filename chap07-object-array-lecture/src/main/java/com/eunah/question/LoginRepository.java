package main.java.com.eunah.question;

public class LoginRepository {

    private final static UserDTO[] users = new UserDTO[10];

    private static int count;
    public boolean join(UserDTO userDTO) {
        if (count < 10){
            users[count++] = userDTO;
            return true;
        }else {
            System.out.println("유저가 꽉 찼습니다.");
            return false;
        }

    }

    public int login(main.java.com.eunah.question.UserDTO userDTO) {

        if (users[0] == null){
            System.out.println("등록된 회원이 없습니다.");
            return 2;
        }


        for (int i = 0; i < users.length; i++) {
            if(users[i].getId().equals(userDTO.getId())){
                if(users[i].getPwd().equals(userDTO.getPwd())){
                    return 0;
                }else {
                    System.out.println(" ");
                    break;
                }
            }else{
                System.out.println(" ");
                break;
            }
        }
        System.out.println("아이디나 비밀번호가 다릅니다.");
        return 1;
    }
}
