//hw1-1
import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int ra1 = scanner.nextInt();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int ra2 = scanner.nextInt();

        if(Math.pow(x1,x2)+Math.pow(y1,y2)<=Math.pow(ra1,ra2)) {
            System.out.print("겹친다");
        }
        else{
            System.out.print("안겹친다");
        }
    }
}
