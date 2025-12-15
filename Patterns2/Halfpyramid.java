public class Halfpyramid{
public void half_pyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public void half_pyramid_number(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Halfpyramid pattern = new Halfpyramid();
        pattern.half_pyramid(5);

        pattern.half_pyramid_number(5);
    }
}