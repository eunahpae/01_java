package main.java.com.eunah.section05;

public class Job {

    private int num;
    private String jobName;

    public Job(int num, String jobName) {
        this.num = num;
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "Job{" +
                "num=" + num +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
