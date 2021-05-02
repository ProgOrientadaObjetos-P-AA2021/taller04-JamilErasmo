/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author jamil
 */
public class Vehiculo {

    /**
     * @param args the command line arguments
     */
    
    private String cedulaDueno;
    private String marcaVehiculo;
    private int anoFabricante;
    private double valorVehiculo;
    private double valorMatricula;
    
    public Vehiculo(){
        cedulaDueno = "1104803620";
        marcaVehiculo = "Toyota";
        anoFabricante = 2015;
        valorVehiculo = 30000;
    }
    
    public void establecerCedulaDueno(String CD) {
       cedulaDueno = CD;
    }

    public void establecerMarcaVehiculo(String MV) {
        marcaVehiculo = MV;
    }

    public void establecerAnoFabricante(int AF) {
        anoFabricante = AF;
    }

    public void establecerValorVehiculo(double VH) {
        valorVehiculo = VH;
    }

    public void establecerValorMatricula() {
        valorMatricula =  anoFabricante * valorVehiculo * 0.002 ;
    }

    public String obtenerCedulaDueno() {
        return cedulaDueno;
    }

    public String obtenererMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAnoFabricante() {
        return anoFabricante;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString(){
        String cadena = "Jamil ";
        return cadena; 
    }

        public void calcularValorMatricula() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    

