package main.java.com.eunah.section01.conditional;

public class Question {

    /*
     * a, b, c  세 과목의 점수를 스캐너로 입력 받고
     * 세 과목의 점수를 만든 메소드의 매개변수로 전달해 평균을 계산, 평균을 이용하여 합격 / 불합격 처리를 하는 기능을 구현하세요.
     * (합격 조건 : 세 과목의 점수가 각각 40점을 넘어야하고, 평균은 60점을 넘어야 합니다.)
     * 합격했을 경우 그 학생의 평균 점수와 "합격입니다!"를 출력하고,
     * 불합격인 경우에는 "불합격입니다!"를 출력해주세요.
     */


    public int aveScore(int score1, int score2, int score3) {
        return (score1 + score2 + score3) / 3;
    }

    public void testResult(int score1, int score2, int score3) {

        int aveScore = aveScore(score1, score2, score3);

        if (score1 >= 40 && score2 >= 40 && score3 >= 40) {
            if (aveScore >= 60) {
                System.out.println("세 과목 평균 " + aveScore + "점으로 합격입니다.");
            } else {
                System.out.println("세 과목 평균 " + aveScore + "점으로 평균미달 불합격입니다.");
            }
        } else {
            System.out.println("과락 불합격입니다.");

        }

    }

}
