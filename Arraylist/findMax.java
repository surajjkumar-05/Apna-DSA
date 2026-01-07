
import java.util.ArrayList;

public class findMax{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(5);
        list.add(8);
        list.add(20);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            // max = Math.max(max, list.get(i));
            if(list.get(i) > max){
                max = list.get(i);
            }
        }  
        System.out.println("Maximum element in the ArrayList: " + max); 
    }
}