/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;

import profesor.Profesor;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Jamil";
        String apellido = "Quituizaca";
        double sueldoBasico = 400;
        int cedula = 1105595985;
        Profesor profesor = new Profesor(nombre, apellido, sueldoBasico, cedula);
        profesor.calcularSueldoT();
        System.out.printf("%s\n", profesor);
    }

}
