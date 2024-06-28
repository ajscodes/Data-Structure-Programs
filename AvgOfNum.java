import java.util.Scanner;
public class AvgOfNum {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = op.nextInt();
        double result = 0;
        for(int i=1;i<=n;i++){
            result += i;
        }
        System.out.print(result/n);
        
    }
}