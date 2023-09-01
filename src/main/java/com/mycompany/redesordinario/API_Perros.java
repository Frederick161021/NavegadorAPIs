package com.mycompany.redesordinario;

import com.google.gson.Gson;
import java.util.List;
import kong.unirest.Unirest;

public class API_Perros {
    Perros perros;
    
    public API_Perros(String raza) {
        String jsonText = Unirest.get("https://dog.ceo/api/breed/"+raza+"/images/random/20")
                .asString()
                .getBody();
        System.out.println("Json Perros: " + jsonText);
        JsonPerros(jsonText);
    }
    
    public void JsonPerros(String jsonText) {
        Gson gson = new Gson();
        perros = gson.fromJson(jsonText, Perros.class);
    }
    
    public List<String> toListString(){
        return perros.getPerro();
    }
}
