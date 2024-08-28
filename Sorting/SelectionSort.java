import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = op.nextInt();

        int ar [] = new int[size];
        System.out.println("Enter element of array: ");
        for(int i=0; i<size; i++){
            System.out.print("ar["+i+"] = ");
            ar[i] = op.nextInt();
        }
        
        int min_index;
        int min_Value;
        
        for(int i=0; i<size-1; i++){
            min_index = i;

            for(int j=i+1; j<size; j++){
                if(ar[min_index] > ar[j]){
                    min_index = j;
                    System.out.println("min_index: "+min_index);
                }
            }

            min_Value = ar[min_index];
            ar[min_index] = ar[i];
            ar[i] = min_Value;
        }

        System.out.println();
        System.out.println("Sorted array:");
        for(int i=0; i<size; i++){
    	    System.out.println("ar["+i+"]="+ar[i]);
        }
    }
}
