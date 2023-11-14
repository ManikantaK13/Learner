package Problems;

import java.util.*;

public class NbyNMatrixWithDiagonalElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer rows = scanner.nextInt();
		Integer columns = scanner.nextInt();
		int[][] array = new int[rows][columns];
		int value = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == i) {
					array[i][j] = value;
					value++;
				}
			}
		}
		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array[a].length; b++) {
				System.out.print(array[a][b] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
