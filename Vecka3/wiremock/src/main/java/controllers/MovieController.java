package controllers;

import models.Movie;
import services.OMDBService;
import spark.Request;
import spark.Response;
import views.HtmlView;

public class MovieController {

    private final OMDBService omdbService;
    private final HtmlView htmlView;

    public MovieController(OMDBService omdbService, HtmlView htmlView) {
        this.omdbService = omdbService;
        this.htmlView = htmlView;
    }

    public Object findRandomMovie(Request req, Response res) {
        Movie movie = omdbService.findRandomMovie();
        return htmlView.renderHtml(movie);
    }
}
