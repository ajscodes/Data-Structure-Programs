import java.util.Scanner;
public class VowelOrNot {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        char n = ac.next().charAt(0);
        n = Character.toLowerCase(n);
        if(n=='a' || n=='e' || n=='i' || n=='u' || n=='o'){
            System.out.println(""+n+" is vowel");
        }
        else{
            System.out.println(""+n+" is consonant.");
        }
    }
}
