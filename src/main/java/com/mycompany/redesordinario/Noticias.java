package com.mycompany.redesordinario;

import java.util.List;

public class Noticias {
    private String status;
    private int totalResults;
    private List <Articulos> articles;
    
    public Noticias (String status, int totalResults, List articles){
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<Articulos> getArticulos() {
        return articles;
    }

    public void setArticulos(List<Articulos> articulos) {
        this.articles = articulos;
    }
    
}
