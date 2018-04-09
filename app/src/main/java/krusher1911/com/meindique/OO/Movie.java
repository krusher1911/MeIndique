package krusher1911.com.meindique.OO;

import android.util.Log;

import org.json.JSONObject;

public class Movie {

    private String tittle;
    private String originalTitle;



    private int voteCount;
    private int idTmdb;
    private double voteAvg;
    private double popularity;
    private String posterPath;
    private String releaseYear;

    public Movie(JSONObject json) {
        try{
            this.tittle = json.getString("title");
            this.posterPath = "http://image.tmdb.org/t/p/w185/" + json.getString("poster_path").substring(1);
            this.originalTitle = json.getString("original_title");
            this.voteCount = Integer.parseInt(json.getString("vote_count"));
            this.idTmdb = Integer.parseInt(json.getString("id"));
            this.voteAvg = Double.parseDouble(json.getString("vote_average"));
            this.popularity = Double.parseDouble(json.getString("popularity"));
            this.releaseYear = json.getString("release_date").substring(0,4);

        } catch (Exception e){
            Log.e("Error", e.getMessage());
        }

    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public int getIdTmdb() {
        return idTmdb;
    }

    public void setIdTmdb(int idTmdb) {
        this.idTmdb = idTmdb;
    }

    public double getVoteAvg() {
        return voteAvg;
    }

    public void setVoteAvg(double voteAvg) {
        this.voteAvg = voteAvg;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
}
