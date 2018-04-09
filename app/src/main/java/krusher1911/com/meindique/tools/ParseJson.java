package krusher1911.com.meindique.tools;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import krusher1911.com.meindique.OO.Movie;

public class ParseJson {

    private String json;

    private ParseJson(String json){
        this.json = json;
    }


    public static JSONArray parse(String json, String atribute){
        try{
            JSONObject obj = new JSONObject(json);
            return obj.getJSONArray(atribute);
        }catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
