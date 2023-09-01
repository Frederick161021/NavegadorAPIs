package com.mycompany.redesordinario;

import java.util.List;

public class YouTube {
    private int number_of_videos;
    private String query, country,lang,timezone,continuation_token;
    private List <Videos> videos;
    
    public YouTube(int number_of_videos,String query, String country, String lang, String timezone, String continuation_token,List videos){
        this.number_of_videos = number_of_videos;
        this.query = query;
        this.country = country;
        this.lang = lang;
        this.timezone = timezone;
        this.continuation_token = continuation_token;
        this.videos = videos;
    }

    public int getNumber_of_videos() {
        return number_of_videos;
    }

    public void setNumber_of_videos(int number_of_videos) {
        this.number_of_videos = number_of_videos;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getContinuation_token() {
        return continuation_token;
    }

    public void setContinuation_token(String continuation_token) {
        this.continuation_token = continuation_token;
    }

    public List<Videos> getVideos() {
        return videos;
    }

    public void setVideos(List<Videos> videos) {
        this.videos = videos;
    }
    
    
}
