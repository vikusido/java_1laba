public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 2);
        Matrix matrix1 = new Matrix(2, 2);
        matrix.setMatrix(0, 0, new Complex(1.0, 2.0));
        matrix.setMatrix(0, 1, new Complex(3.0, 0.0));
        matrix.setMatrix(1, 0, new Complex(4.0, -1.0));
        matrix.setMatrix(1, 1, new Complex(6.0, 2.0));
        System.out.println("First matrix");
        matrix.print();
        System.out.println();
        matrix1.setMatrix(0, 0, new Complex(1.0, 1.0));
        matrix1.setMatrix(0, 1, new Complex(-3.0, 0.0));
        matrix1.setMatrix(1, 0, new Complex(8.0, -1.0));
        matrix1.setMatrix(1, 1, new Complex(4.0, 2.0));
        System.out.println("Second matrix");
        matrix1.print();
        System.out.println();
        System.out.println("Result of addition matrix");
        matrix.add(matrix1).print();
        System.out.println();
        System.out.println("Result of subtraction matrix");
        matrix.sub(matrix1).print();
        System.out.println();
        System.out.println("Result of multiplication matrix");
        matrix.mult(matrix1).print();
        System.out.println();
        System.out.println("Result of transpose matrix");
        matrix.tran().print();
        System.out.println();
    }
}