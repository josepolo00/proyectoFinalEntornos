/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Principal {

    public static void main(String[] args) {
        AreaFiguras af = new AreaFiguras(); //Instanciamos la clase "AreaFiguras"
        Scanner sc = new Scanner(System.in); //Instanciamos la clase Scanner

        double lado, altura, base, radio; //Variables de tipo double
        System.out.print("Ingrese el lado del cuadrado: "); //Pedimos el lado por teclado
        lado = sc.nextDouble(); //Almacenamos el lado en la variable lado
        System.out.print("Ingrese la base del triangulo: ");
        base = sc.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        altura = sc.nextDouble();
        System.out.print("Ingrese la base del rectangulo: ");
        base = sc.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura = sc.nextDouble();
        System.out.print("Ingrese el radio del circulo: ");
        radio = sc.nextDouble();
        /*
         * En las siguientes lineas invocamos los diferentes métodos que
         * trae nuestro objeto "af" y mostramos el resultado por consola.
         */
        System.out.println("------------------------------------------");
        System.out.println("El area del cuadrado es: " + af.areaCuadrado(lado));
        System.out.println("El area del triangulo es: " + af.areaTriangulo(base, altura));
        System.out.println("El area del rectangulo es: " + af.areaRectangulo(base, altura));
        System.out.println("El area del circulo es: " + af.areaCirculo(radio));
    }
}
