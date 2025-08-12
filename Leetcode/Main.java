public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {3, 1, 2},
            {2, 3, 1}
        };

        // Display the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // // Check validity (logic inline)
        // int r = matrix.length;
        // int c = matrix[0].length;
        // boolean isValid = true;

        // for (int i = 0; i < r - 1; i++) {
        //     for (int j = 0; j < c - 1; j++) {
        //         if (matrix[i][j] == matrix[i + 1][j + 1]) {
        //             isValid = false;
        //             break;
        //         }
        //     }
        //     if (!isValid) break;
        // }

        // System.out.println("Is matrix valid? " + isValid);
    }
}
