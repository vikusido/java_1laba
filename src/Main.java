public class Main {
    public static void main(String[] args) {
        Matrix matrix0 = new Matrix(3, 3);
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);
        Matrix matrix3 = new Matrix(3, 3);

        //set first matrix
        matrix0.setMatrix(0, 0, new Complex(1.0, 2.0));
        matrix0.setMatrix(0, 1, new Complex(3.0, 0.0));
        matrix0.setMatrix(0, 2, new Complex(6.0, -10.0));
        matrix0.setMatrix(1, 0, new Complex(4.0, -1.0));
        matrix0.setMatrix(1, 1, new Complex(6.0, 2.0));
        matrix0.setMatrix(1, 2, new Complex(2.0, 2.0));
        matrix0.setMatrix(2, 0, new Complex(5.0, 2.0));
        matrix0.setMatrix(2, 1, new Complex(4.0, -8.0));
        matrix0.setMatrix(2, 2, new Complex(-2.0, -3.0));
        System.out.println("First matrix");
        matrix0.print();
        System.out.println();

        //set second matrix
        matrix1.setMatrix(0, 0, new Complex(1.0, 1.0));
        matrix1.setMatrix(0, 1, new Complex(-3.0, 0.0));
        matrix1.setMatrix(0, 2, new Complex(-5.0, -1.0));
        matrix1.setMatrix(1, 0, new Complex(8.0, -1.0));
        matrix1.setMatrix(1, 1, new Complex(4.0, 2.0));
        matrix1.setMatrix(1, 2, new Complex(-4.0, -10.0));
        matrix1.setMatrix(2, 0, new Complex(3.0, 5.0));
        matrix1.setMatrix(2, 1, new Complex(1.0, -6.0));
        matrix1.setMatrix(2, 2, new Complex(-8.0, 7.0));
        System.out.println("Second matrix");
        matrix1.print();
        System.out.println();

        //set third matrix (imaginary part = 0)
        matrix2.setMatrix(0, 0, new Complex(1.0, 0.0));
        matrix2.setMatrix(0, 1, new Complex(2.0, 0.0));
        matrix2.setMatrix(0, 2, new Complex(3.0, 0.0));
        matrix2.setMatrix(1, 0, new Complex(4.0, 0.0));
        matrix2.setMatrix(1, 1, new Complex(5.0, 0.0));
        matrix2.setMatrix(1, 2, new Complex(6.0, 0.0));
        matrix2.setMatrix(2, 0, new Complex(7.0, 0.0));
        matrix2.setMatrix(2, 1, new Complex(8.0, 0.0));
        matrix2.setMatrix(2, 2, new Complex(9.0, 0.0));

        //set fourth matrix (imaginary part = 0)
        matrix3.setMatrix(0, 0, new Complex(1.0, 0.0));
        matrix3.setMatrix(0, 1, new Complex(-2.0, 0.0));
        matrix3.setMatrix(0, 2, new Complex(3.0, 0.0));
        matrix3.setMatrix(1, 0, new Complex(0.0, 0.0));
        matrix3.setMatrix(1, 1, new Complex(4.0, 0.0));
        matrix3.setMatrix(1, 2, new Complex(-1.0, 0.0));
        matrix3.setMatrix(2, 0, new Complex(5.0, 0.0));
        matrix3.setMatrix(2, 1, new Complex(0.0, 0.0));
        matrix3.setMatrix(2, 2, new Complex(0.0, 0.0));

        //calling all operations
        System.out.println("Result of addition matrix of first and second");
        matrix0.add(matrix1).print();
        System.out.println();
        System.out.println("Result of subtraction matrix of first and second");
        matrix0.sub(matrix1).print();
        System.out.println();
        System.out.println("Result of multiplication matrix of first and second");
        matrix0.mult(matrix1).print();
        System.out.println();
        System.out.println("Result of multiplication matrix of first and third");
        matrix0.mult(matrix2).print();
        System.out.println();
        System.out.println("Result of transpose matrix");
        matrix1.tran().print();
        System.out.println();
        System.out.println("Result of determination of first matrix");
        Complex deter1 = matrix0.det();
        System.out.println(deter1);
        System.out.println();
        System.out.println("Result of determination of third matrix");
        Complex deter3 = matrix2.det();
        System.out.println(deter3);
        System.out.println();
        System.out.println("Inverted matrix of fourth one");
        matrix3.inv().print();
        System.out.println();
        System.out.println("Division of third matrix by fourth");
        matrix2.mult(matrix3.inv()).print();
        System.out.println();
    }
}