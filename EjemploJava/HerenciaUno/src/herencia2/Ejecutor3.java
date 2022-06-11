/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudiantePresencial;
import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Que tipo de estudiante desea ingresar:");
        System.out.println("1 - Estudiante Presencial\n"
                + "2 - Estudiante Distancia");
        int estudiante = entrada.nextInt();
        if (estudiante > 2 || estudiante < 1) {
            System.out.println("Opcion Incorrecta");
        } else {
            entrada.nextLine();
            System.out.println("Ingrese nombres: ");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos: ");
            String apellidos = entrada.nextLine();
            System.out.println("Ingrese identificacion: ");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese edad: ");
            int edad = entrada.nextInt();
            switch (estudiante) {
                case (1):
                    entrada.nextLine();
                    System.out.println("Estudiante Presencial");
                    System.out.println("Ingrese numero asignaturas: ");
                    int asignaturas = entrada.nextInt();
                    System.out.println("Ingrese costo asignaturas: ");
                    double costoAsignatura = entrada.nextDouble();
                    EstudianteDistancia ed1 = new EstudianteDistancia();
                    ed1.establecerNombresEstudiante(nombres);
                    ed1.establecerApellidoEstudiante(apellidos);
                    ed1.establecerIdentificacionEstudiante(identificacion);
                    ed1.establecerEdadEstudiante(edad);
                    ed1.establecerNumeroAsginaturas(asignaturas);
                    ed1.establecerCostoAsignatura(costoAsignatura);
                    ed1.calcularMatriculaDistancia();

                    System.out.printf("%s\n", ed1);
                    break;
                case (2):
                    entrada.nextLine();
                    System.out.println("Estudiante Distancia");
                    System.out.println("Ingrese numero creditos: ");
                    int numeroCreditos = entrada.nextInt();
                    System.out.println("Ingrese costo creditos: ");
                    double costoCredito = entrada.nextDouble();
                    EstudiantePresencial ep1 = new EstudiantePresencial();
                    ep1.establecerNombresEstudiante(nombres);
                    ep1.establecerApellidoEstudiante(apellidos);
                    ep1.establecerIdentificacionEstudiante(identificacion);
                    ep1.establecerEdadEstudiante(edad);
                    ep1.establecerNumeroCreditos(numeroCreditos);
                    ep1.establecerCostoCredito(costoCredito);
                    ep1.calcularMatriculaPresencial();

                    System.out.printf("%s\n", ep1);
                    break;

            }
        }
    }

}
