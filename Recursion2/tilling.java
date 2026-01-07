public class tilling{
    public static int tilingProblem(int n){//2xn (floor size) 
    //    bade case
     if(n==0 || n==1){
        return 1;
     }

   /*
    //  I have two choice
    //  vertical
    int verticalTiles = tilingProblem(n-1);
    //  horizontal
    int horizontalTiles = tilingProblem(n-2);
    int totalWay = verticalTiles + horizontalTiles;
    return  totalWay;
    
    */


       int totalWay = tilingProblem(n-1) + tilingProblem(n-2);
       return totalWay;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}