/*
 * This program is about:
 * (1) Insert element with ordered linkedlist.
 * (2) Delete element from ordered likedlist.
 * Author: Ayush Maradia
 * Date: 20-07-24
 */

import java.util.Scanner;

//here we can create separate file to declare Node class

//main class
public class IntAndDelOrdered{
    // Node head;

    // //constructor for head
    // public IntAndDelOrdered(){
    //     this.head = null;
    // }
    public Node head = null;

    //delete first
    public void delFirst(){
        if(head == null){
            System.out.print("linkedlist is empty, can't delete anything.");
            return;
        }
        else if(head.link == null){
            head = null;
            System.out.print("Node deleted successfully! Now, Linked list is empty.");
            return;
        }
        else{
            head = head.link;
            System.out.print("First node deleted successfully!");
        }
    }

    //Add element
    public void addWithOrdered(int add){
        Node newNode = new Node(add);
        if(head == null){
            head = newNode;
            System.out.println("First node successfully added at 0th index.");
            return;
        }
        else{
            //insert before head node
            if(newNode.info <= head.info){
                newNode.link = head;
                head = newNode;
                return;
            }
            //search and insert
            else{
                Node pred = head;
                while(pred.link != null && newNode.info >= pred.link.info){
                    pred = pred.link;
                }
                newNode.link = pred.link;
                pred.link = newNode;
                return;
            }
        }
    }

    //delete element
    public void delWithOrdered(int del){
        if(head.info == del || head == null){
            delFirst();
            return;
        }
        else{
            Node finderNode = head;
            Node joinerNode = finderNode.link.link;
            while(finderNode.link.info != del && joinerNode != null){
                finderNode = finderNode.link;
                joinerNode = joinerNode.link;
            }
            if(finderNode.link.info != del){
                System.out.println("Not found in linked list.");
                return;
            }
            else{
                finderNode.link = joinerNode;
                System.out.println("Deleted successfully.");
                return;
            }
        }  
    }

    //display linkedlist
    public void display(){
        if(head == null)
        {
            System.out.print("List is empty.");
            return;
        }
        else
        {
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.info+"-->");
            currNode = currNode.link;
        }
        System.out.print("NULL");
        return;
        }
    }

    //delete whole linkedlist
    public void delLinkedlist(){
        if(head == null){
            System.out.println("linkedlist is empty, can't delete anything.");
            return;
        }
        else{
            head = null;
            System.out.println("Linkedlist deleted successfully.");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        IntAndDelOrdered list = new IntAndDelOrdered();

        boolean isEnd = true;
        while(isEnd){
            System.out.println();
            System.out.println("----------You have following choises:----------");
            System.out.println("(1) INSERT NODE.");
            System.out.println("(2) DELETE NOTE.");
            System.out.println("(3) DELETE LINKEDLIST.");
            System.out.println("(4) EXIT THE PROCESS.");
           //System.out.println("(NOTE: STARTING INDEX IS 0.)");
            System.out.print("CURRENT LIST: ");
            list.display();
            System.out.print("\n");
            System.out.print("Enter choise: ");
            int n = op.nextInt();

            switch(n){
                case 1:
                System.out.print("Provide element to insert: ");
                int add = op.nextInt();
                list.addWithOrdered(add);
                break;

                case 2:
                System.out.print("Enter element to delete: ");
                int del = op.nextInt();
                list.delWithOrdered(del);
                break;

                case 3:
                list.delLinkedlist();
                break;

                case 4:
                System.out.println("----------Exited Successfully----------");
                System.out.println("Thank you, see you again.");
                isEnd = false;
                break;

                default:
                System.out.println("Invalid choice.");
            }
        }
    }
}