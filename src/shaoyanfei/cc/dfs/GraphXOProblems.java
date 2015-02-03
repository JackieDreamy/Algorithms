package shaoyanfei.cc.dfs;

public class GraphXOProblems {

	public static void checkPath(int[][] matrixs, int i, int j) {
		int row = matrixs.length;
		int col = matrixs[0].length;
		if (i < 0 || i > row - 1) {
			return;
		}
		if (j < 0 || j > col - 1) {
			return;
		}

		if (matrixs[i][j] == 0 || matrixs[i][j] == -1) {
			return;
		}

		matrixs[i][j] = -1;
		checkPath(matrixs, i + 1, j);
		checkPath(matrixs, i - 1, j);
		checkPath(matrixs, i, j + 1);
		checkPath(matrixs, i, j - 1);
	}

	public static int graphXO(int[][] matrixs) {
		int count = 0;
		int row = matrixs.length;
		int col = matrixs[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrixs[i][j] == 1) {
					checkPath(matrixs, i, j);
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrixs = { { 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		System.out.println(graphXO(matrixs));
	}

}
