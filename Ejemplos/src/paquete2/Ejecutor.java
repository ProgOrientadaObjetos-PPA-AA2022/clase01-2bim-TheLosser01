/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCostos(20000);
        Edificio edf2 = new Edificio("Edificio Norte");
        edf2.establecerCostos(30000);
        Edificio edf3 = new Edificio("Edificio Sur");
        edf3.establecerCostos(40000);
        Edificio edf4 = new Edificio("Edificio Secundario");
        edf4.establecerCostos(50000);
        
        
        Edificio[] listaEdificios= {edf1, edf2, edf3, edf4};
        //double c = listaEdificio[2].obtenerCosto(); 
        //System.out.println(c);
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("Empresa de Hojas");
        miempresa.establecerEdificios(listaEdificios);
        miempresa.establecerCostoBienesInmuebles();
        // Imprimir el costo de los bienes inmuebles de la empresa
        System.out.printf("%s\n", miempresa);
        
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo();
        Vehiculo v3 = new Vehiculo();
        Vehiculo v4 = new Vehiculo();
        Vehiculo v5 = new Vehiculo();
        v1.establecerTipo("Auto");
        v1.establecerMatricula("LBB0011");
        v1.establecerValor(10000);
        v2.establecerTipo("Camioneta");
        v2.establecerMatricula("LCB0011");
        v2.establecerValor(20000);
        v3.establecerTipo("Auto");
        v3.establecerMatricula("LBD0012");
        v3.establecerValor(6000);
        v4.establecerTipo("Camioneta");
        v4.establecerMatricula("LCC0011");
        v4.establecerValor(10000);
        v5.establecerTipo("Camioneta");
        v5.establecerMatricula("LDC0011");
        v5.establecerValor(25000);
        
    }
}
