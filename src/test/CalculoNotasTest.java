package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.CalculoNotas;
import main.Nota;

public class CalculoNotasTest {


	@Test
	public void testCalculoNotas() {
	Nota nota = new Nota(1,"paco",5,7,6);
	CalculoNotas cn = new CalculoNotas();
	cn.agregarAlumno(nota);
	
	assertEquals("[Nota [id=1, nombre=paco, NotaExamen=5.0, NotaTrabajo=7.0, NotaActitud=6.0]]", cn.getNotas().toString());
	} 


	@Test
	public void testGetNotas() {
	Nota nota = new Nota(1,"paco",5,7,6);
	CalculoNotas cn = new CalculoNotas();
	cn.agregarAlumno(nota);
	
	assertEquals("[Nota [id=1, nombre=paco, NotaExamen=5.0, NotaTrabajo=7.0, NotaActitud=6.0]]", cn.getNotas().toString());
	} 

	@Test
	public void testAgregarAlumno() {
		Nota nota = new Nota(1,"paco",5,7,6);
		CalculoNotas cn = new CalculoNotas();
		cn.agregarAlumno(nota);
		Nota nota2 = new Nota(1,"paco",5,7,6);
		cn.agregarAlumno(nota);
		
		assertFalse(false); 
	}

//	@Test
//	public void testMostrarNotas() {
//		Nota nota = new Nota(3,"paco",6,7,3);
//		CalculoNotas cn = new CalculoNotas();
//		cn.agregarAlumno(nota);
//		assertEquals("Nota [id=3, nombre=paco, NotaExamen=6.0, NotaTrabajo=7.0, NotaActitud=3.0]", cn.mostrarNotas());
//	}

	@Test
	public void testCalcularMedia() {
		Nota nota = new Nota(3,"paco",6,6,6);
		CalculoNotas cn = new CalculoNotas();
		cn.agregarAlumno(nota);
        nota = cn.buscarNotaPorId(3);
       
        assertEquals(6.0, cn.calcularMedia(3),0.01);
	}
	@Test
	public void testCalcularMediaNo() {
		Nota nota = new Nota(3,"paco",6,6,6);
		CalculoNotas cn = new CalculoNotas();
		cn.agregarAlumno(nota);
        nota = cn.buscarNotaPorId(4);

        assertEquals(0, cn.calcularMedia(4),0.01);
	}

	@Test
	public void testTodasAprobadas() {
		Nota nota = new Nota(3,"paco",6,6,6);
		CalculoNotas cn = new CalculoNotas();
		cn.agregarAlumno(nota);
        nota = cn.buscarNotaPorId(3);

        assertTrue(cn.todasAprobadas(3));
	}
	
	public void testTodasNoAprobadas() {
		Nota nota = new Nota(3,"paco",6,4,6);
		CalculoNotas cn = new CalculoNotas();
		cn.agregarAlumno(nota);
        nota = cn.buscarNotaPorId(3);

        assertFalse(cn.todasAprobadas(3));
	}

	@Test
	public void testCalcularNotaFinal() {
		fail("Not yet implemented");
	}

}
