package com.example.pruebaclase;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaClaseApplication {
    /*
    Autor : Gabriel Alejandro Choque Callizaya
     */
    public static void criba(int n){
        boolean[] esPrimo = new boolean[n+1];
        esPrimo[0] = esPrimo[1] = true;
        for(int i = 2 ; i * i <= n; i++){
            if (!esPrimo[i]){
                for (int j = i * i ; j <= n; j+=i){
                    esPrimo[j] = true;
                }
            }
        }

        for (int i = 2 ; i <= n ; i++ ){
            if (!esPrimo[i]){
                System.out.print(" " + i);
            }
        }
    }
    public static void main(String[] args) {
      int n = 1000000 ;
      criba(n);
    }
}
