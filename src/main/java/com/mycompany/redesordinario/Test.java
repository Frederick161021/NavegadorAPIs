package com.mycompany.redesordinario;
import java.util.Scanner;

public class Test {

    public static Noticias news;
    
    public static void Noticias(){
        Scanner s = new Scanner(System.in);
        String tema = "";
        do {
            System.out.println("Digite el tema que quiere Buscar:");
            tema = s.next();
            if (!tema.equalsIgnoreCase("salir")) {
                API_Noticias n = new API_Noticias(tema);
            }
        }while(!tema.equalsIgnoreCase("salir"));
    }
    
    public static void Youtube(){
        API_YouTube y = new API_YouTube("The beatles");
    }

    public static void main(String[] args){
        //API_Perros p = new API_Perros("pitbull");
        Noticias();
        Youtube();
    }
}
