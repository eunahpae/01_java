package main.java.com.eunah.section05;

public class Application01 {
    public static void main(String[] args) {

        Job[] jobList = new Job[5];

        try {
            jobList[0] = new Job(1, "백엔드");
            jobList[1] = new Job(2, "프론트엔드");
            jobList[2] = new Job(3, "데브옵스");
            jobList[3] = new Job(4, "DBA");
            jobList[4] = new Job(5, "PM");

            jobList[5] = new Job(6, "PL");
            jobList[6] = new Job(7, "BogData");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < jobList.length; i++) {
            System.out.println(jobList[i]);
        }

    }
}