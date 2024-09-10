import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
       Scanner op = new Scanner(System.in);
       System.out.print("Enter size of array: ");
       int size = op.nextInt();
    
       int array [] = new int [size];
       System.out.println("Enter a element: ");
       for(int i=0; i<array.length; i++){
        array[i] = op.nextInt();
       }

       System.out.print("Your array is: ");
       for(int i=0; i<array.length; i++){
        System.out.print(array[i]+" ");
       }


       //Insertion Sort Logic
        int i=1;
        while(i < array.length){
            int key = array[i];
            int j = i-1;
            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
            i++;
        }

        //print sorted array
        System.out.println("\n");
        System.out.println("Sorted array: ");
        for(int j=0; j<array.length; j++){
            System.out.print(array[j]+" ");
        }
    }
}