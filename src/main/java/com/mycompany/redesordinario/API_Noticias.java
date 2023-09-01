package com.mycompany.redesordinario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import com.google.gson.*;
import java.util.ArrayList;
import java.util.List;
import kong.unirest.Unirest;

public class API_Noticias {
    
    private String URL_API;
    Noticias  noticias = null;
    private String textoJson = "";

    public API_Noticias(String consulta){
        String jsonText = Unirest.get("https://newsapi.org/v2/everything?q=" + consulta + "&from=2022&sortBy=publishedAt&apiKey=43726ab5a22a44dab5659e1aae5c3fe7")
                .asString()
                .getBody();
        System.out.println("Json Noticias: " + jsonText);
        JsonNoticias(jsonText);
    }
    
    //Conversion de String a formato JSON
    public void JsonNoticias(String text){
        Gson gson = new Gson();
        noticias = gson.fromJson(text, Noticias.class);
        //Test();
    }
    
    public List<String> toListString(){
        List<String> aux = new ArrayList<String>();
        aux.add("Total de resultados: "+noticias.getTotalResults());
        for (int i = 0; i <  noticias.getArticulos().size(); i++) {
            aux.add("Titulo: "+noticias.getArticulos().get(i).getTitle());
            aux.add("Autor: "+noticias.getArticulos().get(i).getAuthor());
            aux.add("Descripcion: "+noticias.getArticulos().get(i).getDescription());
            aux.add("URL:");
            aux.add(noticias.getArticulos().get(i).getUrl());
        }
        return aux;
    }
    
    //Test
    public void Test(){
        System.out.println("Estatus: " + noticias.getStatus());
        System.out.println("Total de Resulatado: " + noticias.getTotalResults());
        System.out.println("Artiuculos:");
        for (int i = 0; i < noticias.getArticulos().size(); i++) {
            System.out.println("Titulo: "+noticias.getArticulos().get(i).getTitle());
            System.out.println("Autor: "+noticias.getArticulos().get(i).getAuthor());
            System.out.println("Descripcion: "+noticias.getArticulos().get(i).getDescription());
            System.out.println("URL: "+noticias.getArticulos().get(i).getUrl());
        }
    }
    
}
