public class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex num) {
        double num_real = this.real + num.real;
        double num_imag = this.imag + num.imag;
        return new Complex(num_real, num_imag);
    }

    public Complex sub(Complex num) {
        double num_real = this.real - num.real;
        double num_imag = this.imag - num.imag;
        return new Complex(num_real, num_imag);
    }

    public Complex mult(Complex num) {
        double num_real = this.real * num.real - this.imag * num.imag;
        double num_imag = this.real * num.imag + this.imag * num.real;
        return new Complex(num_real, num_imag);
    }

    //    public Complex div(Complex num) {
//        double num_real = this.real * num.real - this.real * num.imag;
//        double num_imag = this.real * num.imag + this.imag * num.real;
//        return new Complex(num_real, num_imag);
//    }
    public String toString() {
        if (imag >= 0) {
            return real + "+" + imag + "i";
        } else {
            return real + "" + imag + "i";
        }
    }
}