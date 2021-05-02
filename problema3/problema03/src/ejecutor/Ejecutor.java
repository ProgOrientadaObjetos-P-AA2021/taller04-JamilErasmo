/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;

import vehiculo.Vehiculo;


/**
 *
 * @author jamil
 */
    public class Ejecutor {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("1105595985","toyota",2019,30000);
        vehiculo.establecerValorMatricula();
        
        Vehiculo vehiculo1 = new Vehiculo("1105595985","toyota",2019,30000);
        vehiculo1.establecerValorMatricula();
        
        System.out.println(vehiculo + "\n" + vehiculo1 );
    }
}


