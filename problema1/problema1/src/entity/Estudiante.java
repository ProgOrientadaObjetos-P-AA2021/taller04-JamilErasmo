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
    private double calificaciondemateria1;
    private double calificaciondemateria2;
    private double calificaciondemateria3;
    private double promedio;

    public Estudiante(String nombre, double calificacion1, double calificacion2, double calificacion3) {
        this.nombre = nombre;
        this.calificaciondemateria1 = calificacion1;
        this.calificaciondemateria2 = calificacion2;
        this.calificaciondemateria3 = calificacion3;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s \nCalificación 1: %.2f \nCalificación "
                + "2: %.2f \nCalificación 3: %.2f \nPromedio: %.2f", nombre, 
                calificaciondemateria1, calificaciondemateria2, 
                calificaciondemateria3, promedio);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public double obtenerCalificacion1() {
        return calificaciondemateria1;
    }

    public void establecerCalificacion1(double calificacion1) {
        calificacion1 = calificaciondemateria1;
    }

    public double obtenerCalificacion2() {
        return calificaciondemateria2;
    }

    public void establecerCalificacion2(double calificacion2) {
        calificacion2 = calificaciondemateria2;
    }

    public double obtenerCalificacion3() {
        return calificaciondemateria3;
    }

    public void establecerCalificacion3(double calificacion3) {
        calificacion3 = calificaciondemateria3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        this.promedio = (calificaciondemateria1 + calificaciondemateria2 + 
                calificaciondemateria3) / 3;
    }

}
