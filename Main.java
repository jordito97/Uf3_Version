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


        System.out.println("Introduce 1 para ordenar de forma ascendente.");
        System.out.println("Introduce 2 para ordenar de forma descendente.");
        System.out.println(":");
        int numero = lector.nextInt();

        while (numero != 2 && numero != 1) {//Compruebo que este dentro de los valores
            System.out.println("Introduce 1 para ordenar de forma ascendente.");
            System.out.println("Introduce 2 para ordenar de forma descendente.");
            System.out.println(":");
            numero = lector.nextInt();

        }
        if (numero == 1) {
            vector2 = ascendente(vector2);//llamo a la funcion que ordena
        } else if (numero == 2) {
            vector2 = descendente(vector2);//llamo a la funcion que ordena
        }
        for (int i = 0; i < contador; i++) {
            Circuls circ = new Circuls(vector2[i]);//creo los objetos añadiendole el valor obtenido al principio
            miLista.add(i, circ);//los añado a la lista

        }

        for (int i = 0; i < miLista.size(); i++) {//imprimir los valores del radio
            System.out.println("Radios: ");
            System.out.printf("%.2f", miLista.get(i).getRadio());
            System.out.print(" | ");

        }
        for (int i = 0; i < miLista.size(); i++) {//imprimir los valroes del perimetro
            System.out.println();
            System.out.print("Perimetros: ");
            System.out.printf("%.2f", miLista.get(i).perimetro());
            System.out.print(" | ");
        }
        for (int i = 0; i < miLista.size(); i++) {//imprimir los valores del area
            System.out.println();
            System.out.print("Areas: ");
            System.out.printf("%.2f", miLista.get(i).area());
            System.out.print(" | ");
        }
    }
}
