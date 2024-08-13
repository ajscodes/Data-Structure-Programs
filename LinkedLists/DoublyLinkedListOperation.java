/*
 * Basic Operations on linkedlist:
 * 1. INSERT NODE AT FIRST POSITION.
 * 2. INSERT NODE AT LAST POSITION.
 * 3. DELETE NODE FROM FIRST POSITION.
 * 4. DELETE NODE FROM LAST POSITION.
 * 5. DISPLAY LINKED LIST.
 * 6. EXIT THE PROCESS.
 * 
 * Author: Ayush Maradia
 * Date: 09-08-24
*/

import java.util.Scanner;

public class DoublyLinkedListOperation {
    class Node{
        // Represents a node of a doubly linked list
        int info;
        Node rptr;
        Node lptr;

        public Node(int info){
            this.info = info;
            this.lptr = null;
            this.rptr = null;
        }
    }

    public Node head = null;

    //insert at given position
    public void addWithPosition(int add,int i){
        Node newNode = new Node(add);

        // Case 1: List is empty
        if(head == null){
            if(i==0){
                head = newNode;
                System.out.println("Added at position 0.");
            }
            else{
                System.out.println("Available position is only 0!!");
            }
            return;
        }
        else{

            // Case 2: Adding at the head
            if(i==0){
                newNode.rptr = head;
                head.lptr = newNode;
                head = newNode;
                System.out.println("Added at 0th index.");
                return;
            }

            // Case 3: Adding at position i where i > 0
            else{
                Node before = head;

                for(int j=0; j<i-1; j++){
                    if(before == null){
                        System.out.println("Position not available!!");
                        return;
                    }
                    before = before.rptr;
                }

                Node after = before.rptr;

                //adjust all link 
                newNode.rptr = after;
                newNode.lptr = before;
                before.rptr = newNode;

                if(after != null){
                    after.lptr = newNode;
                }
            
                System.out.println("Node added successfully at position " + i + ".");
                return;
            }
        }
    }

    //insert at last
    public void addLast(int x){
        Node newNode = new Node(x);
        //if node not available then add at first position.
        if(head == null){
            head = newNode;
            System.out.println("Added as a frist node.");
            return;
        }
        //add at last 
        else{
            Node traveller = head;
            while(traveller.rptr != null){
                traveller = traveller.rptr;
            }
            traveller.rptr = newNode;
            newNode.lptr = traveller;
            System.out.println("Node successfully added at last position.");
            return;
        }
    }

    //delete from given position
    public void deleteWithPosition(int j){
        if(head == null)
        {
            System.out.println("Can't delete because List is Empty.");
            return;
        }
        // Special case: delete the head node
        if (j == 0) {
            if (head.rptr == null) {
                head = null;  // List will be empty after deleting the head
                System.out.println("Node deleted successfully! Now, Linked list is empty.");
            } else {
                head = head.rptr;  // Move head to the next node
                head.lptr = null;   // Disconnect the old head
                System.out.println("Deleted Successfully!");
            }
            return;
        }
        else{
            Node before = head;
            Node joiner = head.rptr;
        
            for(int k=0;k<j-1;k++)
            {

                if(joiner == null){
                    System.out.println("Index out of bounds.");
                    return;
                }

                before = before.rptr;
                joiner = joiner.rptr;
            }

            if(joiner == null || joiner.rptr == null){
                before.rptr = null;
            }
            else{
                before.rptr = joiner.rptr; //bypass node which you want to delete
                joiner.rptr.lptr = before; // backward linkage
            }

            System.out.println("Deleted successfully");
            return;
        }
    }

    //delete from last
    public void deleteLast(){
        if(head == null){
            System.out.print("List is empty.");
            return;
        }

        if(head.rptr == null && head.lptr == null){
            head = null;
            System.out.print("Node deleted successfully! Now, Linked list is empty.");
            return;
        }

        Node secondLast = head;
        Node lastNode = head.rptr;

        while(lastNode.rptr != null){
            lastNode = lastNode.rptr;
            secondLast =  secondLast.rptr;
        }

        secondLast.rptr = null;
    }

    //display
    public void display(){
        if(head == null){
            System.out.print("List is empty!!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.info+"<-->");
            currNode = currNode.rptr;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        DoublyLinkedListOperation list = new DoublyLinkedListOperation();             

        boolean isEnd = true;
        while(isEnd){
            System.out.println();
            System.out.println("----------You have following choises:----------");
            System.out.println("(1) INSERT NODE AT GIVEN POSITION.");
            System.out.println("(2) INSERT NODE AT LAST POSITION.");
            System.out.println("(3) DELETE NOTE FROM GIVEN POSITION.");
            System.out.println("(4) DELETE NODE FROM LAST POSITION.");
            System.out.println("(5) DISPLAY LINKED LIST.");
            System.out.println("(6) EXIT THE PROCESS.");
            System.out.println("*(NOTE: STARTING POSITION IS 0.)");
            System.out.print("CURRENT LIST: ");
            list.display();
            System.out.print("\n");
            System.out.print("Enter choise: ");
            int n = op.nextInt();

            switch(n){
                case 1:
                System.out.print("Provide element to insert: ");
                int add = op.nextInt();
                System.out.print("Specify position: ");
                int i = op.nextInt();
                list.addWithPosition(add,i);
                break;

                case 2:
                System.out.print("Enter element to insert at last: ");
                int x = op.nextInt();
                list.addLast(x);
                break;

                case 3:
                System.out.println("Enter a position: ");
                int j = op.nextInt();
                list.deleteWithPosition(j);
                break;

                case 4:
                list.deleteLast();
                break;

                case 5:
                list.display();
                System.out.println();
                break;

                case 6:
                System.out.println("----------Exited Successfully----------");
                System.out.println("Thank you, see you again.");
                isEnd = false;
                break;

                default:
                System.out.println("Invalid choice!!");
            }
        }
    }
}