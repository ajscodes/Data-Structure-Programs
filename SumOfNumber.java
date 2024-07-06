import java.util.Scanner;
public class SumOfNumber{
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int m = op.nextInt();
        System.out.print("Enter second number: ");
        int n = op.nextInt();
        int result = 0;
        for(int i=m;i<=n;i++){
            result += i;
        }
        System.out.print("Sum of number "+m+" to "+n+" is "+result);
    }
}