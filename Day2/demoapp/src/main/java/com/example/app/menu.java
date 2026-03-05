package com.example.app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class menu {

    class expr {
        double operand1;
        String operator;
        double operand2;

        public expr(double operand1, String operator, double operand2) {
            this.operand1 = operand1;
            this.operator = operator;
            this.operand2 = operand2;
        }
    }
    Scanner sc = new Scanner(System.in);
    public void GUIMenu() {

        // grid layout for buttons
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        JTextField  textField = new JTextField();
        textField.setSize(300, 30);
        textField.setLocation(50, 20);
        textField.setEditable(false);
        frame.add(textField);

        for (int i = 0; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setSize(50, 50);
            button.setLocation(50 + (i % 5) * 60, 50 + (i / 5) * 60);
            button.addActionListener(e -> textField.setText(textField.getText() + button.getText()));
            frame.add(button);
        }

        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        JButton modulusButton = new JButton("%");

        JButton[] buttons = {addButton, subtractButton, multiplyButton, divideButton, modulusButton};
        for (int i = 0; i < buttons.length; i++) {
            JButton button = buttons[i];
            button.setSize(50, 30);
            button.setLocation(50 + (i % 5) * 50, 170 + (i / 5) * 40);
            System.out.println(button.getLocation().toString());
            button.addActionListener(e -> textField.setText(textField.getText() + " " + button.getText() + " "));
            frame.add(button);
        }

        JButton equalsButton = new JButton("=");
        equalsButton.setSize(50, 30);
        equalsButton.setLocation(300, 170);
        equalsButton.addActionListener(e -> {
                String expression = textField.getText();
                List<String> p = Arrays.asList(expression.split(" "));

                Map<Integer, expr> map = new HashMap<>();
                p.stream().filter(s -> s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%"))
                    .forEach(s -> {
                        int index = p.indexOf(s);
                        map.put(index, new expr(Double.parseDouble(p.get(index - 1)), s, Double.parseDouble(p.get(index + 1))));
                    });
                
                String operator = p.get(1).trim();

                calc calculator = new calc();
                double result = 0;
                switch (operator) {
                    case "+":
                        result = calculator.add(Double.parseDouble(p.get(0)), Double.parseDouble(p.get(2)));
                        break;
                    case "-":
                        result = calculator.subtract(Double.parseDouble(p.get(0)), Double.parseDouble(p.get(2)));
                        break;
                    case "*":
                        result = calculator.multiply(Double.parseDouble(p.get(0)), Double.parseDouble(p.get(2)));
                        break;
                    case "/":
                        result = calculator.divide(Double.parseDouble(p.get(0)), Double.parseDouble(p.get(2)));
                        break;
                    case "%":
                        result = calculator.modulus(Double.parseDouble(p.get(0)), Double.parseDouble(p.get(2)));  
                        break;
                }
                textField.setText(String.valueOf(result));
        });

        JButton clearButton = new JButton("C");
        clearButton.setSize(50, 30);
        clearButton.setLocation(350, 50);
        clearButton.addActionListener(e -> {
            textField.setText(""); 
        });
        frame.add(clearButton);
        frame.add(equalsButton);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public int displayMenu() {
        System.out.println("\nCalculator:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("0. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        operand op = new operand();
        calc calculator = new calc();
        menu obj = new menu();
        obj.GUIMenu();
        
        /*while (true) {
            menu obj = new menu();
            int choice = obj.displayMenu();
            switch (choice) {
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                case 1:
                    int[] operands = op.acceptOperands();
                    System.out.println("Sum: " + calculator.add(operands[0], operands[1]));
                    break;
                case 2:
                    operands = op.acceptOperands();
                    System.out.println("Difference: " + calculator.subtract(operands[0], operands[1])); 
                    break;
                case 3:
                    int[] operand = op.acceptOperands();
                    System.out.println("Product: " + calculator.multiply(operand[0], operand[1]));
                    break;
                case 4:
                    operands = op.acceptOperands();
                    System.out.println("Quotient: " + calculator.divide(operands[0], operands[1]));
                    break;
                case 5:
                    operands = op.acceptOperands();
                    System.out.println("Remainder: " + calculator.modulus(operands[0], operands[1]));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }*/
    }
}
