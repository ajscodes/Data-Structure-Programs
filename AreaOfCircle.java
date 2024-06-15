import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = ac.nextInt();
        System.out.print(""+Math.PI*r*r);
    }
}