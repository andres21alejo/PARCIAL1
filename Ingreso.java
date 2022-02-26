/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ingreso {
  static Scanner sc = new Scanner(System.in);
static int[] numeros = new int [10];

public void pedir_numero(){
    for (int a=0; a<10;a++){
    System.out.println("Ingrese 10 números");
    numeros [a]= sc.nextInt();
    }
    for (int a=0; a<10;a++){
        System.out.println(numeros[a]);
    }
}

public void menu(int eleccion){
    boolean salir = false;

    while(!salir){
    System.out.println("Seleccione qué acción desea realizar");
    System.out.println("1. Ordenar de forma ascendente");
    System.out.println("2. Ordenar de forma descendente");
    System.out.println("3. Salir");

    eleccion = sc.nextInt();
    switch (eleccion){
        case 1: mostrar_ascendente();
                break;
        case 2: mostrar_descendente();
                break;
        case 3: salir=true;
                break;
        case 4: default: System.out.println("Esta opción que seleccionó no existe, seleccione otra");
                break;
    }
    }
}

public void mostrar_ascendente(){
    System.out.println("Orden de forma ascendente:");
    ascendente(numeros);
    for (int orden:numeros){
        System.out.println(orden);
    }
    menu(0);
}
public void ascendente(int[] arreglo){
    for (int a = 0; a<arreglo.length - 1; a++){
        int min = a;

        for(int b = a+1; b<arreglo.length;b++){
            if(arreglo[b]<arreglo[min]){
                min=b;
            }
        }

        if (a !=min){
            int aux = arreglo[a];
            arreglo[a]=arreglo[min];
            arreglo[min]=aux;
        }
    }
}

public void mostrar_descendente(){
     System.out.println("Orden de forma descendente:");
    descendente(numeros);
    for (int orden:numeros){
        System.out.println(orden);
    }
}

public void descendente(int[] arreglo){
     for (int a = 0; a<arreglo.length - 1; a++){
        int max = a;

        for(int b = a+1; b<arreglo.length;b++){
            if(arreglo[b]>arreglo[max]){
                max=b;
            }
        }

        if (a !=max){
            int aux = arreglo[a];
            arreglo[a]=arreglo[max];
            arreglo[max]=aux;
        }
    }
}

}  

