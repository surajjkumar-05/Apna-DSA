public  class  InvertedStar{
    public static void main(String[] args) {
       /* for(int line=5; line>=1; line--){
        //  inner loop for printing spaces
            for(int star=1; star<=line; star++){
                System.out.print("* ");
            } 
            System.out.println();
        }*/

       for (int line=1; line<=5; line++){
              for(int star=5; star>=line; star--){
                System.out.print("* ");
              }
              System.out.println();
       }
    }
}