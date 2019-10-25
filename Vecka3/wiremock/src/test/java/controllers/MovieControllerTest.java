package controllers;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import services.OMDBService;
import spark.Request;
import spark.Response;
import utils.HttpClient;
import views.HtmlView;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class MovieControllerTest {

    private String BASE_URL = "http://localhost:8888/?";
    private MovieController movieController;

    @Rule
    public WireMockRule mockServer = new WireMockRule(options().port(8888));

    @Before
    public void setUp() {
        HttpClient httpClient = new HttpClient();
        OMDBService omdbService = new OMDBService(BASE_URL, httpClient);
        HtmlView htmlView = new HtmlView();
        movieController = new MovieController(omdbService, htmlView);
    }

    @Test
    public void randomMovieResponseContainsTitle() {
        Request request = mock(Request.class);
        Response response = mock(Response.class);
        mockServer.stubFor(get(urlMatching("\\/\\?i.*")).willReturn(aResponse().withBody("{\"Title\":\"Top Ten Santas\",\"Year\":\"2009\",\"Rated\":\"N/A\",\"Released\":\"22 Dec 2009\",\"Season\":\"N/A\",\"Episode\":\"N/A\",\"Runtime\":\"N/A\",\"Genre\":\"News\",\"Director\":\"N/A\",\"Writer\":\"N/A\",\"Actors\":\"Conor Knighton\",\"Plot\":\"N/A\",\"Language\":\"N/A\",\"Country\":\"N/A\",\"Awards\":\"N/A\",\"Poster\":\"N/A\",\"Ratings\":[],\"Metascore\":\"N/A\",\"imdbRating\":\"N/A\",\"imdbVotes\":\"N/A\",\"imdbID\":\"tt1613648\",\"seriesID\":\"N/A\",\"Type\":\"episode\",\"Response\":\"True\"}\n")));

        String controllerResponse = (String) movieController.findRandomMovie(request, response);

        assertTrue(controllerResponse.contains("<h1>Top Ten Santas (2009)</h1>"));
    }

    @Test
    public void randomMovieResponseContainsActor() {
        Request request = mock(Request.class);
        Response response = mock(Response.class);
        mockServer.stubFor(get(urlMatching("\\/\\?i.*")).willReturn(aResponse().withBody("{\"Title\":\"Top Ten Santas\",\"Year\":\"2009\",\"Rated\":\"N/A\",\"Released\":\"22 Dec 2009\",\"Season\":\"N/A\",\"Episode\":\"N/A\",\"Runtime\":\"N/A\",\"Genre\":\"News\",\"Director\":\"N/A\",\"Writer\":\"N/A\",\"Actors\":\"Conor Knighton\",\"Plot\":\"N/A\",\"Language\":\"N/A\",\"Country\":\"N/A\",\"Awards\":\"N/A\",\"Poster\":\"N/A\",\"Ratings\":[],\"Metascore\":\"N/A\",\"imdbRating\":\"N/A\",\"imdbVotes\":\"N/A\",\"imdbID\":\"tt1613648\",\"seriesID\":\"N/A\",\"Type\":\"episode\",\"Response\":\"True\"}\n")));

        String controllerResponse = (String) movieController.findRandomMovie(request, response);

        assertTrue(controllerResponse.contains("Conor Knighton"));
    }
}