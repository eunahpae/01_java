package main.java.com.eunah.section05.parameter;

public class RactAngle {

    private double width;

    private double height;

    public RactAngle() {
    }

    public RactAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public void calcArea() {
        double area = width * height;
        System.out.println("사각형의 넓이 = " + area + "입니다.");
    }

    public void calcRound() {
        double round = (width + height) * 2;
        System.out.println("사각형의 둘레 = " + round + "입니다.");
    }

    @Override // 부모가 가진 기능을 자손이 재정의 해서 사용할 수 있다.
    public String toString() {
        return "RactAngle [width=" + width + ", height=" + height + "]";
    }
}
