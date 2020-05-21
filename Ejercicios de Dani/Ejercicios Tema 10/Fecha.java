package Ejercicios;

public class Fecha {

	// Atributos
	private int dia;
	private int mes;
	private int año;
	private final static String[] SEMANA = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
	private final static int[] DIASPORMES = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// Constructores
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	// Devuelve el día de la semana que corresponde
	public String diaSemana() {
		double y = ultimosDos();
		double c = primerosDos();
		int w = (int) (dia + (double) (13 * (mesCambiado() + 1)) / 5 + y + (y / 4) + (c / 4) - 2 * c);
		w %= 7;
		return SEMANA[w];
	}

	// Dato para el cálculo del día de la semana
	// Devuelve los primeros dos dígitos del año
	private int primerosDos() {
		String y = Integer.toString(año);
		if (y.length() <= 2) {
			return año;
		}
		y = y.substring(0, 1);
		return Integer.parseInt(y);
	}

	// Dato para el cálculo del día de la semana
	// Devuelve los últimos dos dígitos del año
	private int ultimosDos() {
		String y = Integer.toString(año);
		if (y.length() <= 2) {
			return año;
		}
		y = y.substring(y.length() - 2);
		return Integer.parseInt(y);
	}

	// Dato para el cálculo del día de la semana
	// Devuleve el mes, salvo para Enero, que devuelve 13, y Febrero, que devuelve
	// 14
	private int mesCambiado() {
		switch (mes) {
		case 1:
			return 13;
		case 2:
			return 14;
		}
		return mes;
	}

	// Devuelve la fecha que corresponde al día siguiente
	public Fecha diaSiguiente() {
		int maxDias = diasMes();

		int d = dia + 1;
		int m = mes;
		int a = año;

		if (d > maxDias) {
			d -= maxDias;
			m++;
		}

		if (m > 12) {
			m -= 12;
			a++;
		}
		
		return new Fecha(d, m, a);
	}

	// Devulve el último día del mes actual
	private int diasMes() {
		int maxDias = DIASPORMES[mes - 1];
		if (mes == 2 && esBisiesto()) {
			maxDias = 29;
		}
		return maxDias;
	}

	// True si el año es divisible entre 4, salvo que sea divisible entre 100 y no
	// entre 400
	private boolean esBisiesto() {
		if ((año % 400 == 0) || ((año % 4 == 0) && (año % 100 != 0))) {
			return true;
		}

		return false;
	}

	// ToString
	public String toString() {
		return dia + "/" + mes + "/" + año;
	}

	// Muestra la fecha en formato dd/mm/aaaa
	public void verFecha() {
		String d = dia + "/";
		while (d.length() <= 2) {
			d = 0 + d;
		}

		String m = mes + "/";
		while (m.length() <= 2) {
			m = 0 + m;
		}

		String a = año + "";
		while (a.length() <= 3) {
			a = 0 + a;
		}

		System.out.println(d + m + a);
	}

	// Devuelve true si la fecha es correcta
	public boolean esFechaCorrecta() {
		if (dia < 1 || mes < 1 || mes > 12) {
			return false;
		}

		int maxDias = diasMes();

		if (dia > maxDias) {
			return false;
		}

		return true;
	}

	// Devuelve la fecha que corresponde al mes siguiente
	public Fecha mesSiguiente() {
		int m = mes + 1;
		int a = año;

		if (m > 12) {
			m = 1;
			a++;
		}

		Fecha siguiente = new Fecha(dia, m, a);
		siguiente.corregirDia();
		return siguiente;

	}

	// Establece el día al máximo del mes si lo sobrepasa
	private void corregirDia() {
		dia = Math.min(dia, diasMes());
	}

	// Devuelve una nueva fecha que corresponde a la fecha después de avanzar n dias
	public Fecha avanzaDias(int dias) {
		Fecha fechaFinal = this;
		
		for (int i = 1; i <= dias; i++) {
			fechaFinal = fechaFinal.diaSiguiente();
		}
		
		return fechaFinal;
	}

	// Devuelve true si esta fecha es posterior a la pasada por parámetro
	public boolean fechaMayor(Fecha otraFecha) {
		int resultado = año - otraFecha.año;
		if (resultado == 0) {
			resultado = mes - otraFecha.mes;
			if (resultado == 0) {
				resultado = dia - otraFecha.dia;
				return resultado > 0;
			} else {
				return resultado > 0;
			}
		} else {
			return resultado > 0;
		}
	}

	// Devuelve true si esta fecha es anterior a la pasada por parámetro
	public boolean fechaMenor(Fecha otraFecha) {
		int resultado = año - otraFecha.año;
		if (resultado == 0) {
			resultado = mes - otraFecha.mes;
			if (resultado == 0) {
				resultado = dia - otraFecha.dia;
				return resultado < 0;
			} else {
				return resultado < 0;
			}
		} else {
			return resultado < 0;
		}
	}
	
	// Devuelve true si esta fecha es igual a la pasada por parámetro
	public boolean fechaIgual(Fecha otraFecha) {
		return año == otraFecha.año && mes == otraFecha.mes && dia == otraFecha.dia;
	}

}
