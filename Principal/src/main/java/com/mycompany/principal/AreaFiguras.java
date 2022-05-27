/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Administrador
 */
public class AreaFiguras {

    double area;

    /*Métodos que permiten calcular las areas, estos reciben
      como parámetros el lado, base, altura y radio, dependiendo cada caso.
     */
    public double areaCuadrado(double lado) {
        area = lado * lado;
        return area;
    }

    public double areaRectangulo(double base, double altura) {
        area = base * altura;
        return area;
    }

    public double areaTriangulo(double base, double altura) {
        area = (base * altura) / 2;
        return area;
    }

    public double areaCirculo(double radio) {
        area = Math.PI * radio * radio;
        return area;
    }
}
