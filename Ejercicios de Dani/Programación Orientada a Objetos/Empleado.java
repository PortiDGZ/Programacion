package ejerciciosTema9;

public class Empleado {
	
	// Atributos de clase
	
	private static double sueldoHoraExtra;
	
	// Atributos
	
	private String nif = "";
	private String nombre = "";
	private double sueldo;
	private int horasExtra;
	private double irpf;
	private boolean casado;
	private int hijos;
	
	// Constructores
	
	public Empleado() {
		super();
	}

	public Empleado(String nif) {
		super();
		this.nif = nif;
	}

	// Getters y setters
	
	public static double getSueldoHoraExtra() {
		return sueldoHoraExtra;
	}

	public static void setSueldoHoraExtra(double sueldoHoraExtra) {
		Empleado.sueldoHoraExtra = sueldoHoraExtra;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}
	
	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	//Override toString
	@Override
	public String toString() {
		return nif + " " + nombre + "\nSueldo Base: " + sueldo + "\nHoras Extras: " + horasExtra
				+ "\nTipo IRPF: " + irpf + "\nCasado: " + (casado?"Sí":"No") + "\nNúmero de Hijos: " + hijos;
	}
	
	// Complemento: devuelve el salario por las horas extra
	public double complemento() {
		return horasExtra * sueldoHoraExtra;
	}

	// SueldoBruto: devuelve el sueldo con las horas extra incluidas
	public double sueldoBruto() {
		return sueldo + complemento();
	}
	
	// Retenciones: devuelve las retenciones del IRPF sobre el sueldo bruto
	public double retenciones() {
		double reten = irpf;
		
		if (casado) {
			reten--;
		}
		
		reten -= hijos;
		
		reten = Math.max(0, reten);
		
		reten /= 10;
		
		reten *= sueldoBruto();
		
		return reten;
	}
	
}
