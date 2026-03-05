package com.example.app;

public class calc {
    public double add(double... num) {
        double sum = 0;
        for (double n : num) {
            sum += n;
        }
        return sum;
    }
    public double subtract(double... num) {
        double diff = 0;
        boolean first = true;
        for (double n : num) {
            if (first) {
                diff = n;
                first = false;
            } else {
                diff -= n;
            }
        }
        return diff;
    }
    public double multiply(double... num) {
        double product = 1;
        for (double n : num) {
            product *= n;
        }
        return product;
    }
    public double divide(double... num) {
        double quotient = 0;
        boolean first = true;
        for (double n : num) {
            if (first) {
                quotient = n;
                first = false;
            } else {
                if (n == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                quotient /= n;
            }
        }
        return quotient;
    }
    public double modulus(double... num) {
        if (num.length < 2) {
            throw new IllegalArgumentException("Modulus requires at least two operands");
        }
        double a = num[0];
        double b = num[1];
        if (b == 0) {
            throw new IllegalArgumentException("Cannot modulus by zero");
        }
        return a % b;
    }
}
