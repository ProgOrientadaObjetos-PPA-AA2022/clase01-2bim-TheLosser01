/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {
    private String nombre;
    private Edificio [] edificios;
    private Vehiculo [] vehiculos;
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;
     
    
    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    
    public void establecerVehiculos(Vehiculo[] m){
        vehiculos = m;
    }
    
    public void establecerCostoBienesInmuebles(){
        double suma = 0;
        for(int i = 0; i < edificios.length; i++){
        suma = suma + edificios[i].obtenerCosto();
        }
        costoBienesInmuebles = suma;
    }
    
    public void establecerCostoVehiculos(){
        double suma = 0;
        for(int i = 0; i < vehiculos.length; i++){
        suma = suma + vehiculos[i].obtenerValor();
        }
        costoVehiculos = suma;
    }
    
    public void establecerCostoTotalBienes(){
        costoTotalBienes = costoBienesInmuebles +
                costoVehiculos;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    
    public Vehiculo[] obtenerVehiculos(){
        return vehiculos;
    }
    
    public double obtenerCostoBienesInmuebles(){
        return costoBienesInmuebles;
    }
    
    public double obtenerCostoVehiculos(){
        return costoVehiculos;
    }
    
    public double obtenerTotalBienes(){
        return costoTotalBienes;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("%s\nLista de Edificio\n", 
                obtenerNombre());
        for(int i = 0; 1 < edificios.length; i++){
            reporte = String.format("%s%d. %s (%.2f)\n", reporte,
                    i+1,
                    edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        reporte = String.format("%sTotal de Inmuebles: %.2f\n", 
                reporte,
                costoBienesInmuebles);
        String vehiculo = String.format("\nLista de Vehiculos\n");
        for(int i = 0; 1 < vehiculos.length; i++){
            vehiculo = String.format("(%s, %s%s, (%.2f)\n)",
                    i+1,
                    vehiculos[i].obtenerTipo(),
                    vehiculos[i].obtenerMatricula(),
                    vehiculos[i].obtenerValor());
        return vehiculo;
    }
    return reporte;
    }
}