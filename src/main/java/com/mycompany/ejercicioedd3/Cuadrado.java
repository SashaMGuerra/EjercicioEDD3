/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

/**
 * Contiene los datos de un cuadrado y permite calcular su área.
 * @author Sasha
 */
public class Cuadrado {
    private float base, altura;

    public Cuadrado() {
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calcularArea(){
        return (base*altura);
    }
    
}
