/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

import java.util.Scanner;
// Este comentario es una prueba.
/**
 * Calcula el área de un triángulo.
 *
 * @author Sasha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo();
        System.out.println("¿Cuál es la altura del triángulo?");
        Scanner scanner = new Scanner(System.in);
        triangulo1.setAltura(scanner.nextFloat());

        System.out.println("¿Cuál es la base del triángulo?");
        scanner = new Scanner(System.in);
        triangulo1.setBase(scanner.nextFloat());

        float area = triangulo1.calcularArea();
        System.out.println("El área del triángulo es " + area);

        float alturaFija = 5;
        float baseFija = 4;

        Triangulo trianguloFijo = new Triangulo(alturaFija, baseFija);
        System.out.println("El área del triángulo fijado es: " + trianguloFijo.calcularArea());

    }

}
