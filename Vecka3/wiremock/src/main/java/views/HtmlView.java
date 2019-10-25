package views;

import models.Movie;

public class HtmlView {

    public String renderHtml(Movie movie) {
        return
                "<h3>Du kan väl förfan se:</h3>" +
                "<h1>" + movie.getTitle() + " (" + movie.getYear() + ")" + "</h1>" +
                "för att najs personer som " + boldText(movie.getActors()) +
                " är med och den är ju från " + boldText(movie.getCountry());
    }

    private String boldText(String text) {
        return "<span style='font-weight: 700;'>" + text + "</span>";
    }
}
