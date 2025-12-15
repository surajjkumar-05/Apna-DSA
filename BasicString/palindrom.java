//   time complexity O(n)
public class palindrom{

public static boolean isPalindrom(String str){
  int n =str.length();
 for(int i=0; i<n/2; i++){
    // check not a  palindrom

    /* if(str.charAt(i)==str.charAt(n-1-i)){
        return false;
    }*/
    if(str.charAt(i)==str.charAt(n-1)){
        return true;
    }
}
return  false;
}
    public static void main(String[] args) {
        String str="racecar";
       System.out.println(" "+isPalindrom(str)); 
    }
} 