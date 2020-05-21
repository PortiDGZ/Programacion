package Ejercicios;

public class Fecha {

	// Atributos
	private int dia;
	private int mes;
	private int a�o;
	private final static String[] SEMANA = { "Lunes", "Martes", "Mi�rcoles", "Jueves", "Viernes", "S�bado", "Domingo" };
	private final static int[] DIASPORMES = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// Constructores
	public Fecha(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	// Devuelve el d�a de la semana que corresponde
	public String diaSemana() {
		double y = ultimosDos();
		double c = primerosDos();
		int w = (int) (dia + (double) (13 * (mesCambiado() + 1)) / 5 + y + (y / 4) + (c / 4) - 2 * c);
		w %= 7;
		return SEMANA[w];
	}

	// Dato para el c�lculo del d�a de la semana
	// Devuelve los primeros dos d�gitos del a�o
	private int primerosDos() {
		String y = Integer.toString(a�o);
		if (y.length() <= 2) {
			return a�o;
		}
		y = y.substring(0, 1);
		return Integer.parseInt(y);
	}

	// Dato para el c�lculo del d�a de la semana
	// Devuelve los �ltimos dos d�gitos del a�o
	private int ultimosDos() {
		String y = Integer.toString(a�o);
		if (y.length() <= 2) {
			return a�o;
		}
		y = y.substring(y.length() - 2);
		return Integer.parseInt(y);
	}

	// Dato para el c�lculo del d�a de la semana
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

	// Devuelve la fecha que corresponde al d�a siguiente
	public Fecha diaSiguiente() {
		int maxDias = diasMes();

		int d = dia + 1;
		int m = mes;
		int a = a�o;

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

	// Devulve el �ltimo d�a del mes actual
	private int diasMes() {
		int maxDias = DIASPORMES[mes - 1];
		if (mes == 2 && esBisiesto()) {
			maxDias = 29;
		}
		return maxDias;
	}

	// True si el a�o es divisible entre 4, salvo que sea divisible entre 100 y no
	// entre 400
	private boolean esBisiesto() {
		if ((a�o % 400 == 0) || ((a�o % 4 == 0) && (a�o % 100 != 0))) {
			return true;
		}

		return false;
	}

	// ToString
	public String toString() {
		return dia + "/" + mes + "/" + a�o;
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

		String a = a�o + "";
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
		int a = a�o;

		if (m > 12) {
			m = 1;
			a++;
		}

		Fecha siguiente = new Fecha(dia, m, a);
		siguiente.corregirDia();
		return siguiente;

	}

	// Establece el d�a al m�ximo del mes si lo sobrepasa
	private void corregirDia() {
		dia = Math.min(dia, diasMes());
	}

	// Devuelve una nueva fecha que corresponde a la fecha despu�s de avanzar n dias
	public Fecha avanzaDias(int dias) {
		Fecha fechaFinal = this;
		
		for (int i = 1; i <= dias; i++) {
			fechaFinal = fechaFinal.diaSiguiente();
		}
		
		return fechaFinal;
	}

	// Devuelve true si esta fecha es posterior a la pasada por par�metro
	public boolean fechaMayor(Fecha otraFecha) {
		int resultado = a�o - otraFecha.a�o;
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

	// Devuelve true si esta fecha es anterior a la pasada por par�metro
	public boolean fechaMenor(Fecha otraFecha) {
		int resultado = a�o - otraFecha.a�o;
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
	
	// Devuelve true si esta fecha es igual a la pasada por par�metro
	public boolean fechaIgual(Fecha otraFecha) {
		return a�o == otraFecha.a�o && mes == otraFecha.mes && dia == otraFecha.dia;
	}

}
