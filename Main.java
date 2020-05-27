package com.company;

import java.util.*;

public class Main {
    public static double getRandom(double min, double max) {//funcion para obtener el random
        double x = (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    public static double[] ascendente(double[] vec) {//funcion para ordenar de forma ascendente
        Arrays.sort(vec);
        return vec;
    }

    public static double[] descendente(double[] vec2) {//funcion para ordenar de forma descendente
        Arrays.sort(vec2);
        for (int i = 0, j = vec2.length - 1; i < j; i++, j--) {
            double tmp = vec2[(int) i];
            vec2[i] = vec2[j];
            vec2[j] = tmp;
        }
        return vec2;

    }

    public static double[] traspasar(double[] vec2, double[] vec1) {//funcion para pasar los radios al vector con el tamaño total definido

        for (int i = 0; i < vec2.length; i++) {
            vec2[i] = vec1[i];
        }
        return vec2;
    }

    public static void main(String[] args) {
        //VARIABLES

        Scanner lector = new Scanner(System.in);
        double vector[] = new double[50];//vector inicial para guardar los valores
        double min = -4.9, max = 3.0;//defino previamente los max y min del rano,
        boolean comprobar = false;//booleano para comprobacion
        ArrayList<Circuls> miLista = new ArrayList<Circuls>();//lista
        double x;//Variable donde guardar el random
        int contador = 0;

        //

        while (!comprobar) {
            x = getRandom(min, max);
            vector[contador] = x;
            contador++;//contador para saber el tamaño de la lista
            if (x < 0.1) comprobar = true;//Compara el numero dado si es menor y en caso afirmativo devuelve true
        }

        double vector2[] = new double[contador];//creo nuevo vector con el tamaño definido gracias al contador anterior
        vector2 = traspasar(vector2, vector);//llamo a la funcion para pasarle los valores



    }
}
