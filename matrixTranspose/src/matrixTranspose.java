import java.util.Scanner;

public class matrixTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row of the matrix : ");
        int row = input.nextInt();
        System.out.print("Enter the column of the matrix : ");
        int column = input.nextInt();
        System.out.println();

        int[][] matrix = new int[row][column];
        int[][] transposeMatrix = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the row " + i + " and column " + j + " : ");
                matrix[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("Matrix : ");
        for (int[] matrixRow: matrix) {
            for (int matrixColumn: matrixRow) {
                System.out.print(matrixColumn + "\t");
            }
            System.out.println();
        }

        System.out.println("Transpose");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transposeMatrix[i][j] = matrix[j][i];
                System.out.print(transposeMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
