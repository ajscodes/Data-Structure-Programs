import java.util.Scanner;
public class FactorialUsingRecursion {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        long n2 = factorial(n);
        System.out.print("Factorial of "+n+" = "+n2);
    }
    public static long factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}

