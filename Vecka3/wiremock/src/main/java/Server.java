import controllers.MovieController;
import services.OMDBService;
import utils.HttpClient;
import views.HtmlView;

import static spark.Spark.get;

public class Server {
    private static String BASE_URL = "http://www.omdbapi.com/?apikey=5b937cef&";

    private static HttpClient httpClient = new HttpClient();
    private static OMDBService omdbService = new OMDBService(BASE_URL, httpClient);
    private static HtmlView htmlView = new HtmlView();
    private static MovieController movieController = new MovieController(omdbService, htmlView);

    public static void main(String[] args) {
        get("/search", movieController::findRandomMovie);
    }
}
