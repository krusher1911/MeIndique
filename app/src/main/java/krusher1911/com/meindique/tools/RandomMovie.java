package krusher1911.com.meindique.tools;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import krusher1911.com.meindique.OO.Movie;
import java.util.concurrent.ThreadLocalRandom;

public class RandomMovie {

    private String json;

    public RandomMovie(String json) {
        this.json = json;
    }

    public static Movie run(String json) throws JSONException {
        JSONArray arr = ParseJson.parse(json, "results");

        int randomNum = ThreadLocalRandom.current().nextInt(0, arr.length() + 1);
        JSONObject jsonObject = arr.getJSONObject(randomNum);
        Movie movie = new Movie(jsonObject);

        return movie;

    }

}
