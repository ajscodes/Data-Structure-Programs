import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = op.nextInt();
        int count = 0;
        for(int i = 1;i<=(n/2);i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 1){
            System.out.print(n+" is prime number.");
        }
        else{
            System.out.print(n+" is non prime number.");
        }
    }
}