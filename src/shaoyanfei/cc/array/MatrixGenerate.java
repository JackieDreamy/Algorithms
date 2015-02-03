package shaoyanfei.cc.array;

public class MatrixGenerate {

	public static int[][] generateMatrix(int[][] matrix) {
		int[][] result = new int[matrix.length][matrix[0].length];
		int mult = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				for (int k = 0; k < matrix.length; k++) {
					mult *= matrix[k][j];

				}
				for (int k = 0; k < matrix.length; k++) {
					mult *= matrix[i][k];

				}
				if (mult > 0) {
					result[i][j] = 1;

				} else if (mult < 0) {
					result[i][j] = -1;
				} else {
					result[i][j] = 0;
				}
				mult = 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3, 1 }, { 1, 0, -1, 2 }, { -1, 1, 1, 1 } };
		generateMatrix(matrix);
	}

}
