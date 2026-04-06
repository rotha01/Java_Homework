import java.util.Scanner;

class MatrixOperation {

    // Function to input matrix
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

    // Function to display matrix
    public static void printMatrix(int[][] matrix, String name) {
        System.out.println(name + " is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function for addition
    public static void addMatrix(int[][] a, int[][] b) {
        System.out.println("------ Sum ------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    // Function for subtraction
    public static void subtractMatrix(int[][] a, int[][] b) {
        System.out.println("------ Minus ------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print((a[i][j] - b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    // Function for multiplication
    public static void multiplyMatrix(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            System.out.println("Matrix multiplication not possible!");
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------- Matrix Array -----------");

        System.out.print("Enter rows for array 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns for array 1: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows for array 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns for array 2: ");
        int c2 = sc.nextInt();

        if (r1 != r2 || c1 != c2) {
            System.out.println("Addition/Subtraction not possible (different sizes)");
        }

        int[][] arr1 = inputMatrix(sc, r1, c1, "Array1");
        int[][] arr2 = inputMatrix(sc, r2, c2, "Array2");

        printMatrix(arr1, "Array1");
        printMatrix(arr2, "Array2");

        if (r1 == r2 && c1 == c2) {
            addMatrix(arr1, arr2);
            subtractMatrix(arr1, arr2);
        }

        multiplyMatrix(arr1, arr2);
    }
}