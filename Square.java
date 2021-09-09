//hw1-2
import java.util.Scanner;
public class Square {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x<=200 && x>=100 && y<=200 && y>100){
            System.out.print("안에있음");
        }
        else{
            System.out.print("안에없음");
        }
    }
}
