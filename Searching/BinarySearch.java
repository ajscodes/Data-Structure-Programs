import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int size = op.nextInt();
        
        int[] n = new int[size];
        
        System.out.println("Enter elements of array: ");
        for (int j = 0; j < size; j++) {
            System.out.print("n[" + j + "] = ");
            n[j] = op.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int e = op.nextInt();

        int left = 0;
        int right = n.length - 1;
        Arrays.sort(n);
        
        boolean found = false;
        
        while (left <= right) {
            int middle = (left + right) / 2;
            System.out.println("Middle element is at index " + middle);
            if (n[middle] == e) {
                System.out.println(e + " is found at index " + middle + ".");
                found = true;
                break; 
            } else if (n[middle] < e) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        if (!found) {
            System.out.println("404 Not Found.");
        }
    }
}
