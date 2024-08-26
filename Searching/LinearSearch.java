import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        
        System.out.print("Enter size of an array: ");
        int size = op.nextInt();

        int n [] = new int[size];
        
        System.err.println("Enter elements of array: ");
        for(int i=0; i<size; i++){
            System.out.print("n["+i+"] = ");
            n[i] = op.nextInt();
        }
        
        System.out.print("Enter element to find: ");
        int b = op.nextInt();

        boolean flag = false;
        for(int i=0; i<n.length; i++){
            if(n[i] == b){
                System.out.println("Element "+n[i]+" found at "+i+"th index.");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Element not found.");
        }
    }
}
