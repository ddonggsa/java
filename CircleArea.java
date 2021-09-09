import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        final double PI = 3.141592;
        Scanner a = new Scanner(System.in);

        double radius = a.nextDouble();
        double circleArea = radius*radius*PI;
        System.out.println("원의면적 ="+circleArea);

    }
}
