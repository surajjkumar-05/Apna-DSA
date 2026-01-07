public class lastoccurance{
    public static int lastOccurance(int arr[],int key,int idx){
        // base case 
        if(idx  == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, idx+1);
        if(isFound == -1 && arr[idx] == key){
            return idx;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={5,7,9,4,8,9,4,6,7};
        System.out.println(lastOccurance(arr, 7, 0));
    }
}