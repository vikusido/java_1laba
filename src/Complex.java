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
        return new Complex(num_real / denominator, num_imag / denominator);
    }

    //check if equal
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Сравнение с самим собой
        }
        if (obj instanceof Complex) {
            Complex other = (Complex) obj;
            return Double.compare(this.real, other.real) == 0 && Double.compare(this.imag, other.imag) == 0;
        }
        return false;
    }

    //getting the conjugated number
    public Complex conjugated_number() {
        return new Complex(real, -imag);
    }

    //modulus squared
    public double mod() {
        return real * real + imag * imag;
    }

    //right representation of a complex number
    public String toString() {
        if (imag >= 0) {
            return real + "+" + imag + "i";
        } else {
            return real + "" + imag + "i";
        }
    }
}