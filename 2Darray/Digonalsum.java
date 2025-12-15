public class Digonalsum{
    public static int digonalSum(int matrix[][]) {
    int sum = 0;
    int N = matrix.length;

    for (int i = 0; i < N; i++) {
        // Add primary diagonal element (i, i)
        sum += matrix[i][i];

        // Add secondary diagonal element (i, N - 1 - i)
        // Check to make sure it's not the same element (center of odd-sized matrix)
        if (i != N - 1 - i) {
            sum += matrix[i][N - 1 - i];
        }
    }
    return sum;
}
    public static void main(String[] args) {
        int matrix[][]={ {1,2,3,4},
            {5,6,7,8}, {9,10,11,12},
            {13,14,15,16}};
      System.out.println("Digonalsum is:"+  digonalSum(matrix));
    }
}