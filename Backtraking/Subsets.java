public class Subsets{
    public static void findSubset(String str, int i, String ans){
        // base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        // Yes choice
        findSubset(str, i+1, ans+str.charAt(i));
        // No choice
        findSubset(str, i+1, ans);
    }
    public static void main(String[] args) {
         String str = "abc";
         findSubset(str, 0,"" );
    }
}