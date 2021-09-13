import java.util.Scanner;
public class whilebreak {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("exit을 입력하면 종료합니다.");
        while(true){
            System.out.print(">>");
            String s = scanner.nextLine();
            if(s.equals("exit")){
                break;
            }
        }
        System.out.println("종료합니다.");
        scanner.close();
    }
}
