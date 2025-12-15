public class RecursionBasic{
   public static void Printdec(int n){
    if(n==1){
        System.out.print(n);
        return;
    }
     System.out.print(n+"");
     Printdec(n-1);
   }
//  print  increasing order of number
        public static void printInc(int n){
            if(n==1){
                System.out.print(n);
                return;
            }
           
            printInc(n-1);
            System.out.print(n);

        }
    public static void main(String[] args) {
        int n = 10; 
        // Printdec(n); 
        printInc(n);
    }
}