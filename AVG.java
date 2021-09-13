import java.util.Scanner;
public class AVG {
    public static void main(String[] args){
        int Array[] = new int[5];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<Array.length;i++){
            Array[i] = scanner.nextInt();
            sum += Array[i];
        }
        System.out.print("평균:" + (double)sum/Array.length);
        scanner.close();
    }
}
