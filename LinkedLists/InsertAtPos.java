/*
 * (1) Insert node at any position using index.
 * (2) Display LinkedList.
 * Author: Ayush Maradia
 * Date: 13-07-2024
 */
import java.util.Scanner;

 public class InsertAtPos{

    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
        
    public Node head = null;

    //add element at specific index
    public void addWithIndex(int data, int i){
        Node newNode = new Node(data);

        if(head == null){
            if(i==0){
                head = newNode;
                System.out.println("Node added at first position or 0th index.");
                return;
            }
            else{
                System.out.println("Available index is only 0 because list is empty.");
            }
        }
        else{
            if(i==0){
                newNode.link = head;
                head = newNode;
                System.out.println("Node added at 0th index.");
                return;
            }
            else{
                Node before = head;

                for(int j=0;j<i-1;j++){
                    before = before.link;
                }

                if(before == null){
                    System.out.println("Index out of bounds.");
                    return;
                }
                else{
                    newNode.link = before.link;
                    before.link = newNode;
                    System.out.println("Node added successfully.");
                    return;
                }
            }
        }
    }
        
    //del element from specific index
    public void delWithIndex(int j){
        if(head == null)
        {
            System.out.print("Can't delete because List is Empty.");
            return;
        }
        else if(head.link == null)
        {
            head = null;
            System.out.print("Node deleted successfully! Now, Linked list is empty.");
            return;
        }
        else{
            Node before = head;
            if(j==0){
                before = before.link;
                head = before;
            }
            else{
                for(int k=0;k<j-1;k++)
                {
                    before = before.link;
                }
                before.link = before.link.link;
                System.out.println("Deleted Successfully!");
                return;
            }
        }
    }


    //display ll
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
        System.out.print("NULL\n");
        return;
        }
    }



    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        InsertAtPos list = new InsertAtPos();

        boolean isEnd = true;
        while(isEnd){
            System.out.println("----------You have following choises:----------");
            System.out.println("(1) INSERT NODE AT GIVEN POSITION.");
            System.out.println("(2) DELETE NOTE AT GIVEN POSITION.");
            System.out.println("(3) DISPLAY LINKED LIST.");
            System.out.println("(4) EXIT THE PROCESS.");
            System.out.println("(NOTE: STARTING INDEX IS 0.)");
            System.out.print("CURRENT LIST: ");
            list.display();
            System.out.print("\n");
            System.out.println();
            System.out.print("Enter choise: ");
            int n = op.nextInt();

            switch(n){
                case 1:
                System.out.print("Provide element to insert: ");
                int add = op.nextInt();
                System.out.print("Specify index no: ");
                int i = op.nextInt();
                list.addWithIndex(add,i);
                break;

                case 2:
                System.out.print("Specify index no to delete: ");
                int j = op.nextInt();
                list.delWithIndex(j);
                break;

                case 3:
                list.display();
                break;

                case 4:
                System.out.println("----------Exited Successfully----------");
                System.out.println("Thank you, see you again.");
                isEnd = false;
                break;

                default:
                System.out.println("Invalid choice");
            }
        }
    }
 }