import java.util.Scanner;
class DollarConverter{
    static double rate;
    static void setRate(double r){
        rate = r;
    }
    static double toDollar(double won){
        return won/rate;
    }
    static double toWon(double dollar){
        return dollar*rate;
    }
}
public class Dollar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("환율(1달러)>>");
        double rate = scanner.nextDouble();
        DollarConverter.setRate(rate);
        System.out.println("백만원은 $"+DollarConverter.toDollar(1000000)+"입니다.");
        System.out.println("$100은 "+DollarConverter.toWon(100)+"입니다");
        scanner.close();

    }

}
