package Matrix_multi;

import java.util.Scanner;

public class main {
	
	public static boolean possibleMul(int row1, int col2) {
        return row1 == col2;
    }
	
	public static int[][] createArray(Scanner scan, int row, int col, String name) {
        int[][] array = new int[row][col];
        System.out.println("Enter values for the " + name + " array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        return array;
    }
	
	public static int[][] multiplyArray(int[][] arr1, int[][] arr2){
		int row1 = arr1.length;
		int col1 = arr1[0].length;
		int col2 = arr2[0].length;
		int [][] result = new int[row1][col2];
		for(int i=0; i<row1; i++) {
			for(int j=0; j<col2; j++) {
				for(int k=0; k<col1; k++) {
					result[i][j] += (arr1[i][k] * arr2[i][j]);
				}
			}
		}
		return result;
	}
	
	public static void printArray(int[][] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				System.out.println(array[i][j] + " ");
			}
			//turn to a new row
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row1, row2, col1, col2;
		System.out.print("Enter number of rows for the first array: ");
        row1 = scan.nextInt();
        System.out.print("Enter number of columns for the first array: ");
        col1 = scan.nextInt();

        System.out.print("Enter number of rows for the second array: ");
        row2 = scan.nextInt();
        System.out.print("Enter number of columns for the second array: ");
        col2 = scan.nextInt();
        
        while(!possibleMul(col1,row2)) {
        	System.out.println("");
        	System.out.println("Matrix Multiplication is not possible");
        	System.out.print("Enter number of rows for the first array: ");
            row1 = scan.nextInt();
            System.out.print("Enter number of columns for the first array: ");
            col1 = scan.nextInt();

            System.out.print("Enter number of rows for the second array: ");
            row2 = scan.nextInt();
            System.out.print("Enter number of columns for the second array: ");
            col2 = scan.nextInt();
        }
        //get value for the first and second array
        int[][] arr1 = createArray(scan, row1, col1, "first");;
        int[][] arr2 = createArray(scan, row2, col2, "second");
        
        //multiply the array
        int[][] result = multiplyArray(arr1, arr2);
        printArray(result);
	}
	
}
