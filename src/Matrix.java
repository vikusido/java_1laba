public class Matrix {
    private Complex[][] matrix;

    public Matrix(int n, int m) {
        matrix = new Complex[n][m];
    }

    public void setMatrix(int n, int m, Complex numbers) {
        matrix[n][m] = numbers;
    }

    public Complex getMatrix(int n, int m) {
        return matrix[n][m];
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
