package com.mycompany.redesordinario;

import java.util.List;

public class Perros {
    List<String> message;
    
    public Perros(List<String> perro){
        this.message = perro;
    }

    public List<String> getPerro() {
        return message;
    }

    public void setPerro(List<String> perro) {
        this.message = perro;
    }
    
    
}
