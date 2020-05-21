package ejerciciosTema9;

public class CuentaMain {

	public static void main(String[] args) {
		// Cuenta en 0
		Cuenta c0 = new Cuenta("Jose");
		
		// Mostrar que la cuenta está en 0
		System.out.println(c0.getTitular() + " está en " + c0.getCantidad());
		
		// Cuenta en 200
		Cuenta c200 = new Cuenta("Manuel", 200);
		
		// Mostrar que la cuenta está en 200
		System.out.println(c200.getTitular() + " está en " + c200.getCantidad());
		
		// Ingresar 50
		c200.ingresar(50);
		
		// Mostrar que los 50 se han ingresado
		System.out.println(c200.getTitular() + " está en " + c200.getCantidad());
		
		// Intentar ingresar -70
		c200.ingresar(-70);
		
		// Mostrar que los -70 no se han ingresado
		System.out.println(c200.getTitular() + " está en " + c200.getCantidad());
		
		// Retirar 70
		c200.retirar(70);
		
		// Mostrar que los 70 se han retirado
		System.out.println(c200.getTitular() + " está en " + c200.getCantidad());
		
		// Intentar retirar 500
		c200.retirar(500);
		
		// Mostrar que solo se ha retirado hasta 0
		System.out.println(c200.getTitular() + " está en " + c200.getCantidad());
	}

}
