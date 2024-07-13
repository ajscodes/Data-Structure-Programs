import java.util.Scanner;
public class PowerBase {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double x = op.nextDouble();
        System.out.print("Enter Power: ");
        int y = op.nextInt();
        double ans = 1;
        for(int i = 1;i<=y;i++){
            ans = ans*x;
        }
        System.err.println(ans+ " is your answer.");

    }
}
