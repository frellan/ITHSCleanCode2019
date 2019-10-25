package services;

import com.google.gson.Gson;
import models.Movie;
import utils.HttpClient;

public class OMDBService {

    private String baseUrl;
    private HttpClient httpClient;

    public OMDBService(String baseUrl, HttpClient httpClient) {
        this.baseUrl = baseUrl;
        this.httpClient = httpClient;
    }

    public Movie findRandomMovie() {
        try {
            String randomImdbId = getRandomImdbId();
            String response = httpClient.getString(baseUrl + "i=tt" + randomImdbId);
            return packageResponse(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private String getRandomImdbId() {
        return padNumber((int) Math.floor((Math.random() * 2155529) + 1), 7);
    }

    private String padNumber(int input, int length) {
        StringBuilder str = new StringBuilder("" + input);
        while (str.length() < length) {
            str.insert(0, '0');
        }
        return str.toString();
    }

    private Movie packageResponse(String response) {
        Gson gson = new Gson();
        Movie movie = gson.fromJson(response, Movie.class);
        return movie;
    }
}
