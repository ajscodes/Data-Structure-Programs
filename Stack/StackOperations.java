import java.util.Scanner;
class Stack{
    int top;
    int size;
    int[] s;

    public Stack(int size){
        this.size = size;
        s = new int[size];
        top = -1;
    }

    public void push(int x){
        if(top >= size-1){
            System.out.println("Stack Overflow!");
            return;
        }
        top++;
        s[top] = x;
        System.out.println("Pushed successfully!");
        return;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack underflow!");
        }
        top--;
        System.out.println("Poped successfully!");
        return s[top + 1];
    } 

    public void peep(int i){
        if(top == -1){
            System.out.println("Empty Stack, can't view ith element.");
        }
        else{
            if(i<s.length){
                if (top - i + 1 <= -1) { //s.length <= i-1
                    System.out.println("Stack underflow!");
        
                }
                else if(top - i < 0){
                    System.out.println("Index out of bound.");
                }
                else {
                    System.out.println("Element at position "+i+" from top is: "+ s[top - i]);   
                }
            }
        }
    }

    public void change(int j,int y){
        if(top == -1){
            System.out.println("Stack is empty, can't change.");
            return;
        }
        else{
            if(j<s.length){
                if (top - j + 1 <= -1) { 
                    System.out.println("Stack underflow!");
        
                }
                else if(top - j < 0){
                    System.out.println("Index out of bound.");
                }
                else {
                    s[top-j] = y; 
                }
            }
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Empty Stack!");
        }
        else{
            // System.out.println("Stack elements are: ");
            for (int i = top; i >= 0; i--) {
            System.out.println(s[i]);
            }
        }
    }
}
public class StackOperations {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        int size = op.nextInt();

        //Create stack s
        Stack s = new Stack(size);

        boolean isTrue = true;
        while (isTrue) {
            System.out.println();
            System.out.println("----------Stack operations----------");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEP");
            System.out.println("4. CHANGE");
            System.out.println("5. DISPLAY");
            System.out.println("6. EXIT");
            System.out.print("CURRENT STACK: ");
            System.out.println();
            s.display();
            System.out.print("\n");
            // System.out.println();
            System.out.print("Enter a choice: ");
            
            //For choise
            int n = op.nextInt();
            switch(n){
                case 1:
                System.out.print("Enter element to push: ");
                int x = op.nextInt();
                s.push(x);
                break;

                case 2:
                s.pop();
                break;

                case 3:
                System.out.print("Enter index: ");
                int i = op.nextInt();
                s.peep(i);
                break;

                case 4:
                System.out.print("Enter index where you want to change: ");
                int j = op.nextInt();
                System.out.print("Enter element to change: ");
                int y = op.nextInt();
                s.change(j, y);
                break;

                case 5:
                System.out.println("Stack elements are: ");
                s.display();
                break;

                case 6:
                System.out.println("----------Exited Successfully----------");
                System.out.println("Thank you, see you again.");
                isTrue = false;
                op.close();
                return;

                default:
                System.out.println("Invalid choice");
            }
        }

    }
}
