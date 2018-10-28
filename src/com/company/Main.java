package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean condicion=false;
        double numero;
        System.out.println("Introduzca un número entre 0 y 9.999:\n");
        Scanner sc=new Scanner(System.in);
        numero=sc.nextInt();

        while(numero<0||numero>9999) {
            System.out.println("Introduzca un número entre 0 y 9.999:\n");
            numero = sc.nextInt();
        }
        double variable=10;
        int contador=1;
        while (condicion==false){
            if(numero>=variable){
                variable=variable*10;
                contador++;
            }else{
                System.out.printf("El numero tiene %d cifras.", contador);
                condicion=true;
            }
        }

    }
}
