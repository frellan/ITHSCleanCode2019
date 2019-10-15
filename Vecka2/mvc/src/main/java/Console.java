import models.Calculator;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter a number:");
        String operation = "PLUS";
        int n2 = sc.nextInt();
        Calculator model = new Calculator(n1, n2);
        int result = 0;
        switch (operation) {
            case "PLUS":
                result = model.add();
                break;
            case "SUB":
                result = model.subtract();
                break;
            case "MULT":
                result = model.multiply();
                break;
            case "DIV":
                result = model.divide();
                break;
        }
        System.out.println("Your result was: " + result);
    }
}
