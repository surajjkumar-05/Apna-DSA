
import java.util.LinkedList;

public class javaCollections {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(6);
        ll.addFirst(8);
        ll.addLast(9);
        ll.addLast(8);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
      
    }
}
