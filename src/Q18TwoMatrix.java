public class Q18TwoMatrix {
    public void sumOfTwoMatrix() {
        int[][] matrix1 = new int[][]{{2, 4, 5, 7}, {32, 45, 4, 2}};
        int[][] matrix2 = new int[][]{{23, 4, 3, 43}, {34, 34, 34, 3}};
        int[][] addition = new int[matrix1.length][4];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < 4; j++) {
                addition[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(addition[i][j]+" ");
            }
        }
        System.out.println();
    }
}