public class Matrix {
    private Complex[][] matrix;

    public Matrix(int n, int m) {
        matrix = new Complex[n][m];
    }

    public void setMatrix(int i, int j, Complex numbers) {
        matrix[i][j] = numbers;
    }

    public Complex getMatrix(int n, int m) {
        return matrix[n][m];
    }

    public Matrix add(Matrix matrix2) {
        int n = matrix.length;
        int m = matrix[0].length;
        Matrix new_matrix = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                new_matrix.setMatrix(i, j, this.getMatrix(i, j).add(matrix2.getMatrix(i, j)));
            }
        }
        return new_matrix;
    }

    public Matrix sub(Matrix matrix2) {
        int n = matrix.length;
        int m = matrix[0].length;
        Matrix new_matrix = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                new_matrix.setMatrix(i, j, this.getMatrix(i, j).sub(matrix2.getMatrix(i, j)));
            }
        }
        return new_matrix;
    }

    public Matrix mult(Matrix matrix2) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l = matrix2.matrix.length;
        int k = matrix2.matrix[0].length;
        if (m != l) {
            System.out.println("Multiplication is impossible");
        }
        Matrix new_matrix = new Matrix(n, k);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                Complex tmp = new Complex(0, 0);
                for (int t = 0; t < m; t++) {
                    tmp = tmp.add(this.getMatrix(i, t).mult(matrix2.getMatrix(t, j)));
                }
                new_matrix.setMatrix(i, j, tmp);
            }
        }
        return new_matrix;
    }

    public Matrix tran() {
        int n = matrix.length;
        int m = matrix[0].length;
        Matrix new_matrix = new Matrix(m, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                new_matrix.setMatrix(j, i, this.getMatrix(i, j));
            }
        }
        return new_matrix;
    }

    public void print() {
        for (Complex[] n : matrix) {
            for (Complex numbers : n) {
                System.out.print(numbers + "\t");
            }
            System.out.println();
        }
    }
}