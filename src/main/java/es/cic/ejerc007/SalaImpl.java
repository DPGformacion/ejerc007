package es.cic.ejerc007;

import java.util.List;

public class SalaImpl implements Sala {

	@Override
	public boolean comprobarAsientos(Venta venta, int[][] proyecciones) {
		int convHora = 0, convSala = 0, asientosDisp = 0;
		
		convHora = obtenerHora(venta.getHora());
		
		switch (venta.getSala()) {
		case 1:
			convSala = 0;
			asientosDisp = 100;
			break;
		case 2:
			convSala = 1;
			asientosDisp = 50;
			break;
		case 3:
			convSala = 2;
			asientosDisp = 20;
			break;
		}	
		
		proyecciones[convSala][convHora] += venta.getEntradas();
		if (proyecciones[convSala][convHora] <= asientosDisp) {
			return true;
		}
		
		return false;
	}

	@Override
	public double[] estadisticasSalaDia(List<Venta> lista, int sala) {

		double[] stat = new double[2];
		for (Venta v : lista) {
			if (v.getSala() == sala) {
				stat[0] += (v.getPrecio() * v.getEntradas());
				stat[1] += v.getEntradas();
			}
		}
		return stat;
	}

	@Override
	public double[] estadisticasSalaProyeccion(List<Venta> lista, int sala, String hora) {

		double[] stat = new double[2];
		for (Venta v : lista) {
			if (v.getSala() == sala && v.getHora() == hora) {
				stat[0] += (v.getPrecio() * v.getEntradas());
				stat[1] += v.getEntradas();
			}
		}
		return stat;
	}

	@Override
	public int obtenerHora(String hora) {
		int get = 0;
		switch (hora) {
		case "17:00":
			get = 0;
			break;
		case "20:00":
			get = 1;
			break;
		case "22:30":
			get = 2;
			break;
		}
		return get;
	}

}
