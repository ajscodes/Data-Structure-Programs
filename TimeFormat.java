import java.util.Scanner;
public class TimeFormat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int second = sc.nextInt();
        int minute = 00;
        int hour = 00;
        int hh = second/3600;
        int rs = second-(hh*3600);
        int mm = rs/60;
        int ns = rs - (mm*60);
        System.out.println(hh+":"+mm+":"+ns);
        
    }
}