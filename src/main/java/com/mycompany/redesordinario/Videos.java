package com.mycompany.redesordinario;

public class Videos {
    private String video_id, title, author, video_length, description, number_of_views;
    
    public Videos(String video_id, String title, String author, String video_length, String description, String number_of_views){
        this.video_id = video_id;
        this.title = title;
        this.author = author;
        this.video_length = video_length;
        this.description = description;
        this.number_of_views = number_of_views;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getVideo_length() {
        return video_length;
    }

    public void setVideo_length(String video_length) {
        this.video_length = video_length;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber_of_views() {
        return number_of_views;
    }

    public void setNumber_of_views(String number_of_views) {
        this.number_of_views = number_of_views;
    }
    
}
