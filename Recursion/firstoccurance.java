// time complexity = O(n)
// Space complexity = O(n)
public class firstoccurance{
    public static int firstOccurance(int arr[],int key, int idx){
        // base case
        if(idx == arr.length){
            return -1;
        }
      if(arr[idx]== key){
           return idx;
      }
         return firstOccurance(arr, key, idx+1);
    }
    public static void main (String [] args){
        int arr[]={8,47,7,8,3,9,3,9};
        System.out.println(firstOccurance(arr, 9, 0));
    }
}