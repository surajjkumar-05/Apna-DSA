
import java.util.ArrayList;
public class operation{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

         //Get item at any index O(1)
    int Getelement = list.get(1);
    System.out.println(Getelement);

    //DELETE item at any index O(n)
    list.remove(1);
    System.out.println(list);

    //SET item at any index O(n)
    list.set(1, 10);    
    System.out.println(list);

    //contains O(n) to check if element is present in the arraylist
    boolean check = list.contains(3);   
    System.out.println(check);
    }
   

}