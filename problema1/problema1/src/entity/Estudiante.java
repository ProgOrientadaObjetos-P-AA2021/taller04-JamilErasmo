/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author bitxanax
 */
public class Estudiante {

    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Estudiante(String nombre, double calificacion1, double calificacion2, double calificacion3) {
        this.nombre = nombre;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s \nCalificación 1: %.2f \nCalificación 2: %.2f \nCalificación 3: %.2f \nPromedio: %.2f", nombre, calificacion1, calificacion2, calificacion3, promedio);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public void establecerCalificacion1(double calificacion1) {
        calificacion1 = calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public void establecerCalificacion2(double calificacion2) {
        calificacion2 = calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public void establecerCalificacion3(double calificacion3) {
        calificacion3 = calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        this.promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

}
