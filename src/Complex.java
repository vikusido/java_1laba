public class Complex {
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    //addition for complex numbers
    public Complex add(Complex num) {
        double num_real = this.real + num.real;
        double num_imag = this.imag + num.imag;
        return new Complex(num_real, num_imag);
    }

    //subtraction
    public Complex sub(Complex num) {
        double num_real = this.real - num.real;
        double num_imag = this.imag - num.imag;
        return new Complex(num_real, num_imag);
    }

    //multiplication
    public Complex mult(Complex num) {
        double num_real = this.real * num.real - this.imag * num.imag;
        double num_imag = this.real * num.imag + this.imag * num.real;
        return new Complex(num_real, num_imag);
    }

    //division
    public Complex div(Complex num) {
        double denominator = num.real * num.real + num.imag * num.imag;
        double num_real = this.real * num.real + this.imag * num.imag;
        double num_imag = this.imag * num.real - this.real * num.imag;
        return new Complex(num_real / denominator, num_imag/denominator);
    }
//
//    public double abs() {
//        return Math.sqrt(real * real + imag * imag);
//    }
//
//    public static boolean greater(Complex num1, Complex num2) {
//        return num1.abs() > num2.abs();
//    }

    //right representation of a complex number
    public String toString() {
        if (imag >= 0) {
            return real + "+" + imag + "i";
        } else {
            return real + "" + imag + "i";
        }
    }
}