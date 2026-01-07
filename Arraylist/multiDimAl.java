
 import java.util.ArrayList;
public class multiDimAl{
    public static void main(String[] args) {
        // Creating a 2D ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Creating first inner ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // Creating second inner ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        // Adding inner ArrayLists to the main ArrayList
        mainList.add(list1);
        mainList.add(list2);

        // Printing the 2D ArrayList
        System.out.println("2D ArrayList: " + mainList);
        
        // printing all list which are availavle in mainList
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currentList = mainList.get(i);
            System.out.println();
            for(int j=0; j<currentList.size(); j++){
                System.out.print(currentList.get(j) + " ");
            }
        }
       
    }
}