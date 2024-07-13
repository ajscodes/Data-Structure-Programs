import java.util.LinkedList;

public class LLwithCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        // System.out.print(list);

        list.addLast("linked list.");
        //list.add() then it add at last position.
        list.addFirst("This");
        list.pop(); //it's for stack not list.
        list.addFirst("This");
        System.out.print(list);
        System.out.println();
        System.out.print(list.size());
        System.out.println();
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.print("null");
        System.out.println();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == "is"){
                System.out.println("Found");
            }
        }
        System.out.println();
        list.removeFirst();
        list.removeLast();
        System.out.print(list);
        System.out.println();
        list.remove(1); //remove from specified index.
        System.out.print(list);
        System.out.println();
        list.removeAll(list);
        System.out.print(list);
        
    }
}
