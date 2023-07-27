package es.cic.ejerc007;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.mockito.*;

import org.junit.jupiter.api.Test;

class SalaImplTest {

	Sala sala = new SalaImpl();
	List<Venta> lista = new ArrayList<>();
	
	@Test
	public void testComprobarAsientos() {
		Venta v = new Venta();
		assertTrue(sala.comprobarAsientos(v));
		
		v = new Venta();
		assertFalse(sala.comprobarAsientos(v));
	}	

	@Test
	public void testEstadisticasSalaDia() {
		
	}

	@Test
	public void testEstadisticasSalaProyeccion() {

	}

	@Test
	public void testObtenerHora() {
		assertEquals(1, sala.obtenerHora("20:00"), 0.000001);
	}

}
