package com.example.app;

import java.util.Scanner;

public class operand {
    Scanner sc = new Scanner(System.in);
    public double[] acceptOperands() {
        System.out.print("Enter the first operand: ");
        double operand1 = sc.nextDouble();
        System.out.print("Enter the second operand: ");
        double operand2 = sc.nextDouble();
        
        return new double[]{operand1, operand2};
    }
}
