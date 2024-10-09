public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
        Matrix matrix1 = new Matrix(3, 3);

        //set first matrix
        matrix.setMatrix(0, 0, new Complex(1.0, 2.0));
        matrix.setMatrix(0, 1, new Complex(3.0, 0.0));
        matrix.setMatrix(0, 2, new Complex(6.0, -10.0));
        matrix.setMatrix(1, 0, new Complex(4.0, -1.0));
        matrix.setMatrix(1, 1, new Complex(6.0, 2.0));
        matrix.setMatrix(1, 2, new Complex(2.0, 2.0));
        matrix.setMatrix(2, 0, new Complex(5.0, 2.0));
        matrix.setMatrix(2, 1, new Complex(4.0, -8.0));
        matrix.setMatrix(2, 2, new Complex(-2.0, -3.0));
        System.out.println("First matrix");
        matrix.print();
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
        //set third matrix
        Matrix matrix3 = new Matrix(3, 3);
        matrix3.setMatrix(0, 0, new Complex(1.0, 0.0));
        matrix3.setMatrix(0, 1, new Complex(2.0, 0.0));
        matrix3.setMatrix(0, 2, new Complex(3.0, 0.0));
        matrix3.setMatrix(1, 0, new Complex(4.0, 0.0));
        matrix3.setMatrix(1, 1, new Complex(5.0, 0.0));
        matrix3.setMatrix(1, 2, new Complex(6.0, 0.0));
        matrix3.setMatrix(2, 0, new Complex(7.0, 0.0));
        matrix3.setMatrix(2, 1, new Complex(8.0, 0.0));
        matrix3.setMatrix(2, 2, new Complex(9.0, 0.0));
        //calling all operations
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
        System.out.println("Result of determination of first matrix");
        Complex deter1 = matrix.det(matrix);
        System.out.println(deter1);
        System.out.println();
        System.out.println("Result of determination of third matrix");
        Complex deter3 = matrix.det(matrix3);
        System.out.println(deter3);
        System.out.println();
    }
}