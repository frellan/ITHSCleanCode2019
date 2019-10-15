import controller.CalculatorController;
import io.javalin.Javalin;

public class Server {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/plus", CalculatorController::performAdd);
        app.get("/minus", CalculatorController::performSubtraction);
        app.get("/times", CalculatorController::performMultiply);
        app.get("/divide", CalculatorController::performDivision);
    }
}