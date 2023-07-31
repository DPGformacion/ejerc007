package es.cic.ejerc007;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class SalaImplTest {

	Sala sala = new SalaImpl();
	List<Venta> lista = new ArrayList<>();
	
	@Test
	public void testComprobarAsientos() {
		int[][] proyecciones = new int[3][3];
		Venta v = new Venta(5, 1, "17:00", 4);
		assertTrue(sala.comprobarAsientos(v, proyecciones));
		
		v = new Venta(5, 1, "17:00", 101);
		assertFalse(sala.comprobarAsientos(v, proyecciones));
	}	

	@Test
	public void testEstadisticasSalaDia() {
		Venta v = new Venta(5, 1, "17:00", 2);
		lista.add(v);
		v = new Venta(5, 1, "20:00", 3);
		lista.add(v);
		v = new Venta(5, 1, "22:30", 5);
		lista.add(v);		
		double[] stat = sala.estadisticasSalaDia(lista, 1);
		assertEquals(50, stat[0], 0.000001);
		assertEquals(10, stat[1], 0.000001);
	}

	@Test
	public void testEstadisticasSalaProyeccion() {
		Venta v = new Venta(5, 1, "17:00", 2);
		lista.add(v);
		v = new Venta(5, 1, "17:00", 3);
		lista.add(v);
		v = new Venta(5, 1, "17:00", 5);
		lista.add(v);		
		double[] stat = sala.estadisticasSalaProyeccion(lista, 1, "17:00");
		assertEquals(50, stat[0], 0.000001);
		assertEquals(10, stat[1], 0.000001);
	}

	@Test
	public void testObtenerHora() {
		assertEquals(1, sala.obtenerHora("20:00"), 0.000001);
	}

}
