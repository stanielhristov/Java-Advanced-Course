package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        char[][] matrixOne = new char[rows][columns];
        char[][] matrixTwo = new char[rows][columns];
        IntStream.range(0, rows).forEach(r -> {
            String string = scanner.nextLine().trim().replace(" ", "");
            matrixOne[r] = string.toCharArray();
        });
        for (int r = 0; r < rows; r++) {
            String string = scanner.nextLine().trim().replace(" ", "");
            matrixTwo[r] = string.toCharArray();
        }
        char[][] matrixC = new char[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (matrixOne[r][c] == matrixTwo[r][c]) {
                    matrixC[r][c] = matrixOne[r][c];
                } else {
                    matrixC[r][c] = '*';
                }
            }
        }
        Arrays.stream(matrixC).forEach(x -> {
            for (char y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        });

    }
}