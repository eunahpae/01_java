package main.java.com.eunah.game;

public class Board {

    // 필드
    private static final int SIZE = 10;
    private char[][] board;
    private static final char EMPTY = '·';

    // 생성자 - 위에서 선언한 이차원배열에 게임판 모양 값 저장
    public Board() {
        board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    // 게임판 보여주는 메소드
    public void displayBoard() {
        System.out.print("\n   ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + "  "); // 열 번호
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + "  "); // 행 번호
            for (int j = 0; j < SIZE; j++) {
                // 게임판 출력
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 유효한 자리인지 확인 메소드
    public boolean isCheckMove(int row, int col) {
        // 0보다 크고, 게임판사이즈보다 작고, 해당 인덱스에 플레이어심볼이 아닌 EMPTY 문자가 저장되어 있는 경우
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == EMPTY;
    }

    // 입력받은 좌표에 해당 플레이어 심볼 저장 메소드
    public void makeMove(int row, int col, char playerSymbol) {
        board[row][col] = playerSymbol;
    }

    // 승리 확인 메소드
    public boolean checkWin(int row, int col, char playerSymbol) {
        // checkCount() 메소드를 호출하여 상하좌우대각선을 OR연산자를 활용, 하나라도 true 반환시 승리
        return checkCount(row, col, playerSymbol, 0, 1) ||  // 수평
                checkCount(row, col, playerSymbol, 1, 0) || // 수직
                checkCount(row, col, playerSymbol, 1, 1) ||  // 우측 대각선
                checkCount(row, col, playerSymbol, 1, -1); // 좌측 대각선
    }

    // SymbolCount() 메소드에서 해당 플레이어의 연달은 심볼의 개수를 받아 5개 이상인지 확인하는 메소드
    public boolean checkCount(int row, int col, char playerSymbol, int cRow, int cCol) {
        int count = 1; // 현재 위치 1 카운트
        // SymbolCount() 메소드 호출
        count += SymbolCount(row, col, playerSymbol, cRow, cCol); // 우측방향
        count += SymbolCount(row, col, playerSymbol, -cRow, -cCol); // 좌측방향
        return (count >= 5);
    }

    // 해당 플레이어의 심볼 카운트 메소드
    public int SymbolCount(int row, int col, char playerSymbol, int cRow, int cCol) {

        int count = 0;
        int checkRow = row + cRow; // 확인할 행
        int checkCol = col + cCol; // 확인할 열

        // 확인좌표가 0이상이고, 게임판 사이즈보다 작고, 해당플레이어 심볼인 경우 카운트를 1씩 증가하고 확인할 좌표를 계산하여 저장
        while (checkRow >= 0 && checkRow < SIZE && checkCol >= 0 && checkCol < SIZE && board[checkRow][checkCol] == playerSymbol) {
            count++;
            checkRow += cRow;
            checkCol += cCol;
        }
        // 해당 플레이어의 연달아 있는 심볼 개수 반환
        return count;
    }
}

