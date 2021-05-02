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

    public Vehiculo(String cedulad, String marcaVehi, int anoFabric, double valorV) {
        cedulaDueno = cedulad;
        marcaVehiculo = marcaVehi;
        anoFabricante = anoFabric;
        valorVehiculo = valorV;
    }

    public void establecerCedulaDueno(String cd) {
        cedulaDueno = cd;
    }

    public void establecerMarcaVehiculo(String mv) {
        marcaVehiculo = mv;
    }

    public void establecerAnoFabricante(int af) {
        anoFabricante = af;
    }

    public void establecerValorVehiculo(double vh) {
        valorVehiculo = vh;
    }

    public void establecerValorMatricula() {
        valorMatricula = valorVehiculo * 0.002;
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
    public String toString() {
        return "cedula Dueño:" + this.cedulaDueno + "\nMarca Vehiculo:"
                + this.marcaVehiculo + "\n año Fabricantes:"
                + this.marcaVehiculo + "\nvalor Vehiculo:"
                + this.valorVehiculo + "\nvalor Matricula:"
                + this.valorMatricula + "\n";

    }
}
