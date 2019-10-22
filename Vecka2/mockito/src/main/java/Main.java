import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        AccountController accountController = new AccountController();
        get("/hello", accountController::handle);
    }
}
