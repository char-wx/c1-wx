package task1;

public class Move {
    int n;
    int[][] matrix = new int[n][n];

    public int getN() {
        return n;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void move() {
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            int k = n - 1;
            int j = 0;
            while (j < n && k >= 0) {
                b[i][j] = matrix[k][i];
                j++;
                k--;
            }

        }
        for (int m = 0; m < n; m++) {
            for (int l = 0; l < n; l++)
                System.out.printf("%4d", b[m][l]);
            System.out.printf("\n");
        }
    }

}
