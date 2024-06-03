package Vista;

import java.util.ArrayList;
import java.util.Scanner;

import main.CalculoNotas;
import main.Nota;

public class Menu {
	public static void main(String [] args) {
		menu();
	}
	public static void menu() {
	        Scanner escanea = new Scanner(System.in);
	        CalculoNotas cn = new CalculoNotas();

	        int opcion;
	   
	        

	        do {
	            System.out.println("----- Menu -----");
	            System.out.println("1. Agregar alumno");
	            System.out.println("2. Calcular nota final de un alumno");
	            System.out.println("3. Mostrar todas las notas");
	            System.out.println("4. Salir");
	            System.out.print("Selecciona una opcion: ");
	            opcion = escanea.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.print("Introduce el ID: ");
	                    int id = escanea.nextInt();

	                    System.out.print("Introduce el nombre: ");
	                    String nombre = escanea.next();

	                    System.out.print("Introduce la nota del examen: ");
	                    double notaExamen = escanea.nextDouble();

	                    System.out.print("Introduce la nota de los trabajos: ");
	                    double notaTrabajos = escanea.nextDouble();

	                    System.out.print("Introduce la nota de la actitud: ");
	                    double notaActitud = escanea.nextDouble();

	                    cn.agregarAlumno(new Nota(id, nombre, notaExamen, notaTrabajos, notaActitud));
	                  
	                    break; 

	                case 2:
	                    System.out.print("Introduce el ID: ");
	                    int idNotaFinal = escanea.nextInt();
	                    System.out.println(cn.calcularNotaFinal(idNotaFinal));
	                    break;

	                case 3:
	                    cn.mostrarNotas();
	                    break;

	                case 4:
	                    System.out.println("ADIOS");
	                    break;

	                default:
	                    System.out.println("Son solo 4 numeros");
	                    break;
	            }
	        } while (opcion != 4);

	        escanea.close(); 
	    }
}
