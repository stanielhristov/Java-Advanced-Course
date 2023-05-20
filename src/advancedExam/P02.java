package advancedExam;

import java.util.Scanner;

public class P02 {

    static int movesCounter = 0;
    static int touchedOpponents = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");
        int rowSize = Integer.parseInt(dimensions[0]);
        int columnSize = Integer.parseInt(dimensions[1]);
        char[][] matrix = new char[rowSize][columnSize];

        for (int i = 0; i < rowSize; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < columnSize; j++) {
                matrix[i][j] = line[j].toCharArray()[0];
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("Finish") && touchedOpponents != 3) {
            switch (command) {
                case "up":
                    moveUp(matrix);
                    break;
                case "down":
                    moveDown(matrix);
                    break;
                case "right":
                    moveRight(matrix);
                    break;
                case "left":
                    moveLeft(matrix);
                    break;
            }


            command = scanner.nextLine();
        }

        System.out.println("Game over!");
        System.out.print("Touched opponents: " + touchedOpponents + " ");
        System.out.print("Moves made: " + movesCounter);
    }

    private static void moveUp(char[][] matrix) {
        Dimensions dimensionsOfB = findB(matrix);
        Dimensions nextMove = new Dimensions(dimensionsOfB.row - 1, dimensionsOfB.col);

        if (outOfMatrixOrOnObstical(matrix, nextMove)) {
            return;
        }

        if (matrix[nextMove.row][nextMove.col] == 'P') {
            touchedOpponents++;
        }

        movesCounter++;

        matrix[dimensionsOfB.row][dimensionsOfB.col] = '-';
        matrix[dimensionsOfB.row - 1][dimensionsOfB.col] = 'B';
    }

    private static void moveDown(char[][] matrix) {
        Dimensions dimensionsOfB = findB(matrix);
        Dimensions nextMove = new Dimensions(dimensionsOfB.row + 1, dimensionsOfB.col);

        if (outOfMatrixOrOnObstical(matrix, nextMove)) {
            return;
        }

        if (matrix[nextMove.row][nextMove.col] == 'P') {
            touchedOpponents++;
        }

        movesCounter++;

        matrix[dimensionsOfB.row][dimensionsOfB.col] = '-';
        matrix[dimensionsOfB.row + 1][dimensionsOfB.col] = 'B';
    }

    private static void moveRight(char[][] matrix) {
        Dimensions dimensionsOfB = findB(matrix);
        Dimensions nextMove = new Dimensions(dimensionsOfB.row, dimensionsOfB.col + 1);

        if (outOfMatrixOrOnObstical(matrix, nextMove)) {
            return;
        }

        if (matrix[nextMove.row][nextMove.col] == 'P') {
            touchedOpponents++;
        }

        movesCounter++;


        matrix[dimensionsOfB.row][dimensionsOfB.col] = '-';
        matrix[dimensionsOfB.row][dimensionsOfB.col + 1] = 'B';
    }

    private static void moveLeft(char[][] matrix) {
        Dimensions dimensionsOfB = findB(matrix);
        Dimensions nextMove = new Dimensions(dimensionsOfB.row, dimensionsOfB.col-1);

        if (outOfMatrixOrOnObstical(matrix, nextMove)) {
            return;
        }

        if (matrix[nextMove.row][nextMove.col] == 'P') {
            touchedOpponents++;
        }

        movesCounter++;

        matrix[dimensionsOfB.row][dimensionsOfB.col] = '-';
        matrix[dimensionsOfB.row][dimensionsOfB.col - 1] = 'B';
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static boolean outOfMatrixOrOnObstical(char[][] matrix, Dimensions nextMove) {

        if (nextMove.row >= matrix.length || nextMove.row < 0 || nextMove.col >= matrix[nextMove.row].length || nextMove.col < 0) {
            return true;
        }

        if (matrix[nextMove.row][nextMove.col] == 'O') {
            return true;
        }

        return false;
    }

    private static Dimensions findB(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 'B') {
                    return new Dimensions(row, col);
                }
            }
        }
        return null;
    }

    private static class Dimensions {
        int row;
        int col;

        public Dimensions(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
