package main;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculoNotas {

	 private ArrayList<Nota> notas;

	    public CalculoNotas() {
	        notas = new ArrayList<>();
	    }

	    public ArrayList<Nota> getNotas() {
	    	return notas;
	    }
	    
	    
	    public boolean agregarAlumno(Nota nota) { 
	        if (buscarNotaPorId(nota.getId()) != null) {
	            System.out.println("El ID ya existe");
	            return false; 
	        }
	        
	        notas.add(nota);
	        return true;
	    }
	    
	    public void mostrarNotas() {
	        for (Nota nota : notas) {
	            System.out.println(nota);
	        }
	    }
 
	    public Nota buscarNotaPorId(int id) {
	        for (Nota nota : notas) {
	            if (nota.getId() == id) {
	                return nota;
	            }
	        }
	        return null;
	    }

	    public double calcularMedia(int id) {
	        Nota nota = buscarNotaPorId(id);
	        if (nota != null) {
	            double suma = nota.getNotaExamen() + nota.getNotaTrabajo() + nota.getNotaActitud();
	            return suma / 3;
	        } else {
	            System.out.println("El alumno no existe");
	            return 0;
	        }
	    }

	    public boolean todasAprobadas(int id) {
	        Nota nota = buscarNotaPorId(id);
	        try {
	        	boolean si = nota.getNotaExamen() >= 5.0 && nota.getNotaTrabajo() >= 5.0 && nota.getNotaActitud() >= 5.0; 
	        	 return si;
			} catch (java.lang.Exception e) {
				System.out.println("El alumno no existe");
	            return false; 
			}
	    }

	    public String calcularNotaFinal(int id) {
	        double notaFinal;
	    	if (todasAprobadas(id)) {
	            notaFinal = calcularMedia(id);
	            return "Aprobado " + notaFinal;
	        } else {
	        	notaFinal = calcularMedia(id);
	            return "A la recu, uno de los 3 apartados esta suspendido";
	        }
	    }
	  
   
}
