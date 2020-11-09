/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

/**
 * Contiene los datos de un triángulo y permite calcular su área.
 * @author Sasha
 * @version 1.0
 */
public class Triangulo {
    private float altura, base;

    public Triangulo() {
    }

    public Triangulo(float altura, float base) {
        this.altura = altura;
        this.base = base;
    }
    
    /**
     * Este método devuelve el valor del área del triángulo.
     * @return área del triángulo.
     */
    public float calcularArea(){
        return (base*altura)/2;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    
    
}
