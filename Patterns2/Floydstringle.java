public class Floydstringle{
    public void floyd_tringle(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();

        }
    }

    // 0-1 tringle
    public void zero_one_tringle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Floydstringle pattern = new Floydstringle();
        pattern.floyd_tringle(5); 
        pattern.zero_one_tringle(5);
    }
}   