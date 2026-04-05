import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[][] arr1 ={
//                {1,2},
//                {3,4}
//        };
//        int[][] arr2 = {
//                {5,6},
//                {7,8}
//        };

        int[][] arr1 ;
        int[][] arr2 ;
        //User input
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- Matrix Array -----------");
        System.out.print("Please enter the size of the array 1(row) :");
        int sizeOfarr1Row = sc.nextInt();
        System.out.print("Please enter the size of the array 1(column) : ");
        int sizeOfarr1Colmn = sc.nextInt();

        System.out.print("Please enter the size of the array 2(row) : ");
        int sizeOfarr2Row = sc.nextInt();
        System.out.print("Please enter the size of the array 2(column) : ");
        int sizeOfarr2Colmn = sc.nextInt();

        arr1 = new int[sizeOfarr1Row][sizeOfarr1Colmn];
        arr2 = new int[sizeOfarr2Row][sizeOfarr2Colmn];



        if(arr1.length != arr2.length){
            System.out.println("The arrays are not equal");

        }else{
            System.out.println("Please enter numbers for first array:");
            for (int i = 0; i < sizeOfarr1Row; i++) {
                for (int j = 0; j < sizeOfarr1Colmn; j++) {
                    System.out.print("Enter number for first array[" + i + "][" + j + "]: ");
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Array 1 is ");
            for(int i = 0 ; i < arr1.length ; i++){
                for(int j = 0 ; j < arr1[i].length ; j++){
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("--------------------------------");

            System.out.println("Please enter numbers for second array:");
            for (int i = 0; i < sizeOfarr2Row; i++) {
                for (int j = 0; j < sizeOfarr2Colmn; j++) {
                    System.out.print("Enter number for second array[" + i + "][" + j + "]: ");
                    arr2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Array 2 is ");
            for(int i = 0 ; i < arr2.length ; i++){
                for(int j = 0 ; j < arr2[i].length ; j++){
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println();
            }

            int[][] sum = new int[sizeOfarr1Row][sizeOfarr1Colmn];

            System.out.println("-----------sum------------");
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    sum[i][j] = arr1[i][j] + arr2[i][j];
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("-----------minus------------");
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    sum[i][j] = arr1[i][j] - arr2[i][j];
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }

            if (arr1[0].length != arr2.length) {
                System.out.println("Matrix multiplication not possible!");
                return;
            }else{
                System.out.println("-----------multiply------------");

                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr2[0].length; j++) {
                        sum[i][j] = 0; // initialize

                        for (int k = 0; k < arr1[0].length; k++) {
                            sum[i][j] += arr1[i][k] * arr2[k][j];
                        }

                        System.out.print(sum[i][j] + " ");
                    }
                    System.out.println();
                }
                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr2[0].length; j++) {
                        sum[i][j] = 0; // initialize

                        for (int k = 0; k < arr1[0].length; k++) {
                            sum[i][j] += arr1[i][k] * arr2[k][j];
                        }

                        System.out.print(sum[i][j] + " ");
                    }
                    System.out.println();
                }


            }

        }
    }
}
