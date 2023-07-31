package es.cic.ejerc007;

import java.util.List;

public interface Sala {

	public boolean comprobarAsientos(Venta venta, int[][] proyecciones);
	
	public double[] estadisticasSalaDia(List<Venta> lista, int sala);
	
	public double[] estadisticasSalaProyeccion(List<Venta> lista, int sala, String hora);
	
	public int obtenerHora(String hora);
}
