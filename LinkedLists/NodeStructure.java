import java.util.Scanner;
public class NodeStructure {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Enter data: ");
        int data = op.nextInt();
        Node newnode = new Node(data);
        System.out.print(newnode.info+" "+newnode.link);

    }
}
class Node{
    int info;
    Node link;

    public Node(int data){
        this.info = data;
        this.link = null;
    }
}