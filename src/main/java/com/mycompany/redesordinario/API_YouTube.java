package com.mycompany.redesordinario;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class API_YouTube {

    YouTube videos = null;

    //String Responses
    public API_YouTube(String query) {
        String jsonText = Unirest.get("https://youtube-v2.p.rapidapi.com/search/?query="+query+"&lang=es&order_by=this_month&country=mx")
                .header("X-RapidAPI-Key", "bff3cd6433mshb86e67a5fbc7cdcp187fc8jsn08d7aedc5cbd")
                .header("X-RapidAPI-Hos", "youtube-v2.p.rapidapi.com")
                .asString()
                .getBody();
        System.out.println("Json Youtube: " + jsonText);
        JsonYouTube(jsonText);
    }

    //Conversion de String a formato JSON
    public void JsonYouTube(String jsonText) {
        Gson gson = new Gson();
        videos = gson.fromJson(jsonText, YouTube.class);
        //Test();
    }
    
    public List<String> toListString(){
        List<String> aux = new ArrayList<String>();
        aux.add("number_of_videos: " + videos.getNumber_of_videos());
        for (int i = 0; i < videos.getVideos().size(); i++) {
            aux.add(String.valueOf("Titulo del Video: "+videos.getVideos().get(i).getTitle()));
            aux.add("Descripcion: "+videos.getVideos().get(i).getDescription());
            aux.add("Duracion del Video: "+videos.getVideos().get(i).getVideo_length());
            aux.add("Autor: "+videos.getVideos().get(i).getAuthor());
            aux.add("Url del Video:"); 
            aux.add("https://www.youtube.com/watch?v="+videos.getVideos().get(i).getVideo_id());
        }
        return aux;
    }
    
    public void Test(){
        System.out.println("number_of_videos: " + videos.getNumber_of_videos());
        for (int i = 0; i < videos.getVideos().size(); i++) {
            System.out.println("Titulo del Video: "+videos.getVideos().get(i).getTitle());
            System.out.println("Descripcion: "+videos.getVideos().get(i).getDescription());
            System.out.println("Duracion del Video: "+videos.getVideos().get(i).getVideo_length());
            System.out.println("Autor: "+videos.getVideos().get(i).getAuthor());
            System.out.println("Url del Video: https://www.youtube.com/watch?v="+videos.getVideos().get(i).getVideo_id()); 
        }
    }
}
