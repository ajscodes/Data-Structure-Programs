import java.util.Scanner;
public class FactorialUsingLoop {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = op.nextInt();
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans = ans*i;
        }
        System.out.println(ans);
    }
}
