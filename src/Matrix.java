public class Matrix {
    private Complex[][] matrix;

    //create matrix
    public Matrix(int n, int m) {
        matrix = new Complex[n][m];
    }

    //set matrix with numbers
    public void setMatrix(int i, int j, Complex numbers) {
        matrix[i][j] = numbers;
    }

    //get matrix
    public Complex getMatrix(int n, int m) {
        return matrix[n][m];
    }

    //addition for matrix
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

    //subtraction
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

    //multiplication
    public Matrix mult(Matrix matrix2) {
        int n = matrix.length; //rows of first
        int m = matrix[0].length; //cols of first
        int l = matrix2.matrix.length; //rows of second
        int k = matrix2.matrix[0].length; //cols of second
        //checking if it is possible to mult
        if (m != l) {
            System.out.println("Multiplication is impossible");
        }
        Matrix new_matrix = new Matrix(n, k); //result matrix
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

    //transpose
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

    //determination with Gauss's method
    public Complex det() {
        int n = matrix.length;
        int m = matrix[0].length;
        if (n != m) {
            System.out.println("The matrix should be square");
        }
        Complex[][] tmp_matrix = new Complex[n][n];
        Complex det = new Complex(1, 0);
        //finding the biggest number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tmp_matrix[i][j] = this.getMatrix(i, j);
            }
        }
        for (int i = 0; i < n; i++) {
            if (tmp_matrix[i][i].real == 0 && tmp_matrix[i][i].imag == 0) {
                boolean check = false;
                for (int k = i + 1; k < n; k++) {
                    if (tmp_matrix[k][i].real != 0 || tmp_matrix[k][i].imag != 0) {
                        Complex[] tmp_row = tmp_matrix[i];
                        tmp_matrix[i] = tmp_matrix[k];
                        tmp_matrix[k] = tmp_row;
                        check = true;
                        det = det.mult(new Complex(-1, 0));
                        break;
                    }
                }
                if (!check) return new Complex(0, 0);
            }
            //for rows lower than the current row
            for (int k = i + 1; k < n; k++) {
                Complex factor = tmp_matrix[k][i].div(tmp_matrix[i][i]);
                for (int j = i; j < n; j++) {
                    tmp_matrix[k][j] = tmp_matrix[k][j].sub(tmp_matrix[i][j].mult(factor));
                }
            }
        }
        //det as multiplication of diagonal numbers
        for (int i = 0; i < n; i++) {
            det = det.mult(tmp_matrix[i][i]);
        }
        return det;
    }

    //inverse matrix with extended matrix Gauss's method
    public Matrix inv() {
        int n = matrix.length;
        int m = matrix[0].length;
        if (n != m) {
            System.out.println("The matrix should be square");
        }
        Matrix matrix_ext = new Matrix(n, 2 * n);
        Complex deter = det();

        //set extended matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix_ext.setMatrix(i, j, this.getMatrix(i, j));
            }
            for (int j = n; j < 2 * n; j++) {
                if (i == j - n) {
                    matrix_ext.setMatrix(i, j, new Complex(1, 0));
                } else {
                    matrix_ext.setMatrix(i, j, new Complex(0, 0));
                }
            }
        }

        //method
        for (int i = 0; i < n; i++) {
            //checking if the result of determination is zero
            if (deter.equals(new Complex(0, 0))) {
                System.out.println("There is no inverse matrix");
                return null;
            }
            Complex det = matrix_ext.getMatrix(i, i);
            for (int j = 0; j < 2 * n; j++) {
                matrix_ext.setMatrix(i, j, matrix_ext.getMatrix(i, j).mult(det.conjugated_number()).mult(new Complex(1 / det.mod(), 0)));
            }
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    Complex factor = matrix_ext.getMatrix(j, i).conjugated_number();
                    for (int k = 0; k < 2 * n; k++) {
                        matrix_ext.setMatrix(j, k, matrix_ext.getMatrix(j, k).sub(matrix_ext.getMatrix(i, k).mult(factor)));
                    }
                }
            }
        }

        //getting inverted matrix
        Matrix inv_matrix = new Matrix(n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inv_matrix.setMatrix(i, j, matrix_ext.getMatrix(i, j + n));
            }
        }
        return inv_matrix;
    }

    //print
    public void print() {
        for (Complex[] n : matrix) {
            for (Complex numbers : n) {
                System.out.print(numbers + "\t");
            }
            System.out.println();
        }
    }
}