import java.util.Scanner;
public class WhileSample{
    public static void main(String[] args){
        int cnt = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

        int n = scanner.nextInt();
        while(n!=-1){
            sum += n;
            cnt++;
            n=scanner.nextInt();
        }
        if(cnt == 0){
            System.out.println("입력된 수가 없습니다.");
        }else{
            System.out.println("정수의 개수는 "+ cnt+"개입니다.");
            System.out.println("평균은"+(double)sum/cnt+"입니다.");
        }
        scanner.close();
    }
}