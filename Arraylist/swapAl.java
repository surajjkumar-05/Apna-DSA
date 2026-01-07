import java.util.ArrayList;
public class swapAl{


    public static void main(String[] args) {
     ArrayList<Integer>list = new ArrayList<>();
     list.add(1);
     list.add(2);   
     list.add(3);
     list.add(4);
     list.add(5);   
        System.out.println("Original ArrayList: " + list);
        // Swapping elements at index 1 and 3
        int index1 = 1;
        int index2 = 3;
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
        System.out.println("After swap: " + list);  
        
    }
}