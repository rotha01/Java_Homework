import java.util.Scanner;

 class MatrixProgram {

    // Input matrix
    public static int[][] inputMatrix(Scanner sc, int rows, int cols, String name) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter values for " + name + ":");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(name + "[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    // Print matrix
    public static void printMatrix(int[][] matrix, String name) {
        System.out.println(name + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Addition
    public static void addMatrix(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Addition not possible!");
            return;
        }

        System.out.println("------ Sum ------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    // Subtraction
    public static void subtractMatrix(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Subtraction not possible!");
            return;
        }

        System.out.println("------ Minus ------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print((a[i][j] - b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    // Multiplication
    public static void multiplyMatrix(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            System.out.println("Multiplication not possible!");
            return;
        }

        int[][] result = new int[a.length][b[0].length];

        System.out.println("------ Multiply ------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Transpose
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Matrix Program -----");

        // Input size
        System.out.print("Enter rows for matrix 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns for matrix 1: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows for matrix 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns for matrix 2: ");
        int c2 = sc.nextInt();

        int[][] arr1 = inputMatrix(sc, r1, c1, "Matrix1");
        int[][] arr2 = inputMatrix(sc, r2, c2, "Matrix2");

        printMatrix(arr1, "Matrix1");
        printMatrix(arr2, "Matrix2");

        // Menu
        int choice;

        do {
            System.out.println("\n===== Matrix Menu =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Transpose Matrix1");
            System.out.println("5. Transpose Matrix2");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addMatrix(arr1, arr2);
                    break;

                case 2:
                    subtractMatrix(arr1, arr2);
                    break;

                case 3:
                    multiplyMatrix(arr1, arr2);
                    break;

                case 4:
                    int[][] t1 = transposeMatrix(arr1);
                    printMatrix(t1, "Transpose Matrix1");
                    break;

                case 5:
                    int[][] t2 = transposeMatrix(arr2);
                    printMatrix(t2, "Transpose Matrix2");
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);
    }
}