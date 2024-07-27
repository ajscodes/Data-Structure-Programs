/*
 * Basic Operations on linkedlist:
 * 1. INSERT NODE AT FIRST POSITION.
 * 2. INSERT NODE AT LAST POSITION.
 * 3. DELETE NODE FROM FIRST POSITION.
 * 4. DELETE NODE FROM LAST POSITION.
 * 5. DISPLAY LINKED LIST.
 * 6. SIZE OF LINKED LIST.
 * 7. EXIT THE PROCESS.
 * 
 * Author: Ayush Maradia
 * Date: 07-07-24
*/

import java.util.Scanner;

public class OperationsOnLinkedList {
    class Node{
        // Represents a node of a singly linked list
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node first = null; //declare first node as null at starting
    
    //add at first
    public void addFirst(int data){
        Node newNode = new Node(data);
        //if first not exist then new node is first 
        if(first == null){
            first = newNode;
            return;
        }
        //if nodes exists then
        newNode.next = first;
        first = newNode;
    }

    //add at last
    public void addLast(int data){
        Node newNode = new Node(data);
         //if first not exist then new node is first 
         if(first == null){
            first = newNode;
            return;
        }
        //if nodes exists then
        Node currNode = first;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        //now newNode is currNode
        currNode.next = newNode;
    }

    //display linked list
    public void display(){
        if(first == null){
            System.out.print("List is empty.");
            return;
        }
        Node currNode = first;
        while(currNode != null){
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    //delete first
    public void delFirst(){
        if(first == null){
            System.out.print("List is empty.");
            return;
        }
        if(first.next == null){
            first = null;
            System.out.print("Node deleted successfully! Now, Linked list is empty.");
            return;
        }
        first = first.next;
        System.out.print("First node deleted successfully!");
    }

    //delete last
    public void delLast(){
        if(first == null){
            System.out.print("List is empty.");
            return;
        }
        //single node in list
        if(first.next == null){
            first = null;
            System.out.print("Node deleted successfully! Now, Linked list is empty.");
            return;
        }

        Node secondLast = first;
        Node lastNode = first.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null; 
        System.out.print("Last node deleted successfully.");
    }

    //count size of linked list or number of node
    public int sizeOfLinkedList(){
        if(first == null){
            return 0;
        }
        int count = 0;
        Node traveller = first;
        while(traveller != null){
            count++;
            traveller = traveller.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        OperationsOnLinkedList list = new OperationsOnLinkedList(); //make list of linked list


        System.out.println("----------\"This is Menu Driven Program of Linked List\"----------");
        System.out.println("1. INSERT NODE AT FIRST POSITION.");
        System.out.println("2. INSERT NODE AT LAST POSITION.");
        System.out.println("3. DELETE NODE FROM FIRST POSITION.");
        System.out.println("4. DELETE NODE FROM LAST POSITION.");
        System.out.println("5. DISPLAY LINKED LIST.");
        System.out.println("6. SIZE OF LINKED LIST.");
        System.out.println("7. EXIT THE PROCESS.");

        boolean isEnd = false; //control loop

        while(true){
            System.out.println();
            System.out.print("Please enter operation,you want to do?: ");
            int n = op.nextInt();

            //diffirent operations
            switch(n){
                case 1:
                System.out.print("Please enter element to insert at first position: ");
                int firstadd = op.nextInt();
                list.addFirst(firstadd);
                break;

                case 2:
                System.out.print("Please enter element to insert at last position: ");
                int lastadd = op.nextInt();
                list.addLast(lastadd);
                break;

                case 3:
                list.delFirst();
                break;

                case 4:
                list.delLast();
                break;

                case 5:
                list.display();
                break;

                case 6:
                System.out.print("Size of Linked list is "+list.sizeOfLinkedList());
                break;

                case 7:
                System.out.println("----------Exited Successfully----------");
                System.out.println("Thank you, see you again.");
                isEnd = true;
                break;

                default:
                System.out.println("Invalid choice");
            }
            if(isEnd){
                break;
            }
        }
        
    }
}