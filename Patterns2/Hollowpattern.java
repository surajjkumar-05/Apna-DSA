public class Hollowpattern{
    public void hollow_pattern(int totrows, int totalcols){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totalcols;j++){
                if(i==1 || i==totrows || j==1 || j==totalcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollowpattern pattern = new Hollowpattern();
        pattern.hollow_pattern(5, 5);
    }
}