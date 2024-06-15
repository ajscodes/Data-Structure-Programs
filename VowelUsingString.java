import java.util.Scanner;
public class VowelUsingString {
    public static void main(String[] args) {
        Scanner ps = new Scanner(System.in);
        String input = ps.nextLine();
        if(input.length()!=1){
            System.out.print("Please enter exactly one character.");
        }
        else{
            char input2 = input.toLowerCase().charAt(0);
            if("aeiou".indexOf(input2)!=-1){
                System.out.print(input2 +" is vowel.");
            }
            else{
                System.out.print(input2+" is not vowel.");
            }
        }
    }
}
