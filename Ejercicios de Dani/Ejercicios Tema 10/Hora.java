package Ejercicios;

import java.time.*;

public class Hora {

	// Atributos
	private int hora = LocalTime.now().getHour();
	private int minuto = LocalTime.now().getMinute();
	private int segundo = LocalTime.now().getSecond();

	// Constructores
	public Hora(int hora, int minuto, int segundo) {
		super();
		if (correcta(hora, minuto, segundo)) {
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;
		}
	}

	public Hora() {
		super();
	}

	// Comprueba que los datos son correctos
	private boolean correcta(int hora, int minuto, int segundo) {
		return hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59;
	}

	// ToString
	public String toString() {
		String hora = this.hora + "";
		if (hora.length() < 2) {
			hora = 0 + hora;
		}

		String minuto = this.minuto + "";
		if (minuto.length() < 2) {
			minuto = 0 + minuto;
		}

		String segundo = this.segundo + "";
		if (segundo.length() < 2) {
			segundo = 0 + segundo;
		}

		return hora + ":" + minuto + ":" + segundo;
	}

	// Operaciones

	// >
	public boolean mayorQue(Hora comparado) {
		return (hora > comparado.hora) || (hora == comparado.hora && minuto > comparado.minuto)
				|| (hora == comparado.hora && minuto == comparado.minuto && segundo > comparado.segundo);
	}

	// <
	public boolean menorQue(Hora comparado) {
		return (hora < comparado.hora) || (hora == comparado.hora && minuto < comparado.minuto)
				|| (hora == comparado.hora && minuto == comparado.minuto && segundo < comparado.segundo);
	}

	// <=
	public boolean menorOIgualQue(Hora comparado) {
		return !mayorQue(comparado);
	}

	// <=
	public boolean mayorOIgualQue(Hora comparado) {
		return !menorQue(comparado);
	}

	// ==
	public boolean igualA(Hora comparado) {
		return hora == comparado.hora && minuto == comparado.minuto && segundo == comparado.segundo;
	}

	// !=
	public boolean distintoA(Hora comparado) {
		return !igualA(comparado);
	}

	// Incrementar en una cantidad de tiempo determinada
	public void incrementar(int horas, int minutos, int segundos) {
		incrementarHoras(horas);
		incrementarMinutos(minutos);
		incrementarSegundos(segundos);
	}

	// Incrementar en una cantidad de segundos determinada
	private void incrementarSegundos(int segundos) {
		segundo += segundos;

		while (segundo >= 60) {
			segundo -= 60;
			minuto++;
		}

		while (minuto >= 60) {
			minuto -= 60;
			hora++;
		}

		while (hora >= 24) {
			hora -= 24;
		}
	}

	// Incrementar en una cantidad de minutos determinada
	private void incrementarMinutos(int minutos) {
		minuto += minutos;

		while (minuto >= 60) {
			minuto -= 60;
			hora++;
		}

		while (hora >= 24) {
			hora -= 24;
		}
	}

	// Incrementar en una cantidad de horas determinada
	private void incrementarHoras(int horas) {
		hora += horas;

		while (hora >= 24) {
			hora -= 24;
		}
	}

}
