public class Main {
    public static void main(String[] args) {
//        Complex num1 = new Complex(3.0, 0);
//        Complex num2 = new Complex(-1, 5);
//        Complex sum = num1.add(num2);
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println("Sum " + sum);
        Matrix matrix = new Matrix(2, 2);
        Matrix matrix1 = new Matrix(2, 2);
        matrix.setMatrix(0, 0, new Complex(1.0, 2.0));
        matrix.setMatrix(0, 1, new Complex(3.0, 0.0));
        matrix.setMatrix(1, 0, new Complex(4.0, -1.0));
        matrix.setMatrix(1, 1, new Complex(6.0, 2.0));
        matrix.print();
        System.out.println();
        matrix1.setMatrix(0, 0, new Complex(1.0, 1.0));
        matrix1.setMatrix(0, 1, new Complex(-3.0, 0.0));
        matrix1.setMatrix(1, 0, new Complex(8.0, -1.0));
        matrix1.setMatrix(1, 1, new Complex(4.0, 2.0));
        matrix1.print();
    }
}