package controller;

import io.javalin.http.BadRequestResponse;
import io.javalin.http.Context;
import models.Calculator;
import view.HTMLView;

public class CalculatorController {
    public static void performAdd(Context ctx) {
        int firstNumber = getIntegerFromQueryParameter(ctx, "n1");
        int secondNumber = getIntegerFromQueryParameter(ctx, "n2");
        int result = new Calculator(firstNumber, secondNumber).add();
        String viewResult = HTMLView.renderHtmlMessage("green", "add", result);
        ctx.html(viewResult);
    }

    public static void performSubtraction(Context ctx) {
        int firstNumber = getIntegerFromQueryParameter(ctx, "n1");
        int secondNumber = getIntegerFromQueryParameter(ctx, "n2");
        int result = new Calculator(firstNumber, secondNumber).subtract();
        String viewResult = HTMLView.renderHtmlMessage("red", "subtract", result);
        ctx.html(viewResult);
    }

    public static void performMultiply(Context ctx) {
        int firstNumber = getIntegerFromQueryParameter(ctx, "n1");
        int secondNumber = getIntegerFromQueryParameter(ctx, "n2");
        int result = new Calculator(firstNumber, secondNumber).multiply();
        String viewResult = HTMLView.renderHtmlMessage("yellow", "multiply", result);
        ctx.html(viewResult);
    }

    public static void performDivision(Context ctx) {
        int firstNumber = getIntegerFromQueryParameter(ctx, "n1");
        int secondNumber = getIntegerFromQueryParameter(ctx, "n2");
        int result = new Calculator(firstNumber, secondNumber).divide();
        String viewResult = HTMLView.renderHtmlMessage("blue", "division", result);
        ctx.html(viewResult);
    }

    private static int getIntegerFromQueryParameter(Context ctx, String key) {
        int number;
        try {
            String rawNumber = ctx.queryParam(key);
            if (rawNumber == null) throw new BadRequestResponse(key + " cannot be null");
            number = Integer.parseInt(rawNumber);
        } catch (NumberFormatException e) {
            throw new BadRequestResponse("Invalid number parameters");
        }
        return number;
    }
}
