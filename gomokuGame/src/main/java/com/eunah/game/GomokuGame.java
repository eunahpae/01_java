package main.java.com.eunah.game;

import java.util.Scanner;

public class GomokuGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        Player player1;
        Player player2;

        System.out.println("\n=========================\n오목게임에 오신 것을 환영합니다.\n=========================\n");

        // 플레이어 1 이름 받기
        System.out.print("첫 번째 플레이어의 이름을 입력해주세요. : ");
        String player1Name = sc.nextLine();

        // 해당플레이어가 사용할 심볼과 입력받은 이름을 매개값으로 전달하여 플레이어1 객체 생성
        player1 = new Player(player1Name, 'X');

        // 플레이어 2 이름 받기
        System.out.print("\n두 번째 플레이어의 이름을 입력해주세요. : ");
        String player2Name = sc.nextLine();
        // 플레이어1과 마찬가지로 플레이어2 객체 생성
        player2 = new Player(player2Name, 'O');

        // 게임 진행
        System.out.println("\n한 번 두면 무를 수 없으니 신중히 결정하세요. GAME START!");
        boolean p1Turn = true; // 플레이어 순서 변경을 위한 변수

        while (true) {
            // 보드판을 보여주는 displayBoard() 메소드 호출
            board.displayBoard();
            // 현재 플레이어 변수를 만들고 삼항연산자로 플레이어1,2 객체번지를 참조
            Player currentPlayer = p1Turn ? player1 : player2;
            System.out.println("[" + currentPlayer.getSymbol() + "] " + currentPlayer.getName() + " 님의 순서입니다.");

            // 현재 플레이어로부터 행,열 좌표를 입력 받음
            System.out.print("행 번호를 입력하세요.(0-9) : ");
            int row = sc.nextInt();
            sc.nextLine();
            System.out.print("열 번호를 입력하세요.(0-9) : ");
            int col = sc.nextInt();
            sc.nextLine();

            // isCheckMove() 메소드를 호출하여 입력받은 좌표 유효한지 확인
            if (board.isCheckMove(row, col)) {
                // 좌표가 유효하다면 makeMove() 메소드를 호출하여 플레이어심볼로 변경 저장
                board.makeMove(row, col, currentPlayer.getSymbol());
                // checkWin() 메소드를 호출하여 승리조건이 충족되는지 확인 후 승리시 게임종료
                if (board.checkWin(row, col, currentPlayer.getSymbol())) {
                    board.displayBoard();
                    System.out.println(currentPlayer.getName() + " 님이 이겼습니다! GAME OVER!"); // 승리 메세지 출력
                    break; // 게임 종료
                }
                // 플레이어 턴 변경
                p1Turn = !p1Turn;
            } else {
                System.out.println("\n===== 둘 수 없는 곳입니다. 다른 곳에 두세요. ====="); // 유효자리가 아닌 경우 메세지 출력 후 다시 진행
            }
        }
    }
}
