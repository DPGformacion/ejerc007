package es.cic.ejerc007;

import java.util.List;

public interface Sala {

	public boolean comprobarAsientos(Venta venta);
	
	public int[] estadisticasSalaDia(List<Venta> lista, int sala);
	
	public int[] estadisticasSalaProyeccion(List<Venta> lista, int sala, String hora);
	
	public int obtenerHora(String hora);
}
