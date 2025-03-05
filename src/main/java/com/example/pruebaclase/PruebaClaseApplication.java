package com.example.pruebaclase;
import javax.swing.*;
import java.awt.*;
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

    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arreglo[medio] == elemento) {
                return medio;
            }
            if (arreglo[medio] < elemento) {
                inicio = medio + 1;
            }
            else {
                fin = medio - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//      int n = 1000000 ;
//      criba(n);

        int[] arreglo = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 }; // Arreglo ordenado
        int elemento = 23; // Elemento a buscar

        int resultado = busquedaBinaria(arreglo, elemento);

        if (resultado == -1) {
            System.out.println("El elemento no se encuentra en el arreglo.");
        } else {
            System.out.println("El elemento se encuentra en la posición: " + resultado);
        }
    }
}
