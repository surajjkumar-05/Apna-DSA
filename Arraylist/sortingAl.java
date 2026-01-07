
import java.util.ArrayList;
import java.util.Collections;
public class sortingAl{
    public static void main(String[] args) {
        // Sorting an ArrayList in Java
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(8);
        System.out.println("Original ArrayList: " + list);
        // afer sorting araylist
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
    }
}