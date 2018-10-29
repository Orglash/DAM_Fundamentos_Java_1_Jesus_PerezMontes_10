package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variable booleana para el bucle while de mas adelante
        boolean condicion=false;
        int numero;
        //Pedimos el numero y lo asignamos a la variable
        System.out.println("Introduzca un número entre 0 y 9.999:\n");
        Scanner sc=new Scanner(System.in);
        numero=sc.nextInt();
        //Comprobamos que el numero introducido esta en el rango que hemos definido, y si no lo esta, volvemos a pedir un numero por consola
        while(numero<0||numero>9999) {
            System.out.println("Introduzca un número entre 0 y 9.999:\n");
            numero = sc.nextInt();
        }
        //Variable para comparar con el numero introducido
        double compara=10;
        //Variable contador, para tener el numero de cifras segun itere el bucle while.
        int contador=1;
        //Con este bucle while comparamos nuestro numero con contador, y en caso de que el numero sea mayor, incrementamos contador y multiplicamos compara por 10
        while (condicion==false){
            if(numero>=compara){
                compara=compara*10;
                contador++;
            }else{
                System.out.printf("El numero tiene %d cifras.", contador);
                condicion=true;
            }
        }

    }
}
