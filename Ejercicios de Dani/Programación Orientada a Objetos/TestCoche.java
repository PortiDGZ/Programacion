package ejerciciosTema9;

public class TestCoche {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		
		c1.setPrecio(25500);
		
		Coche c2 = new Coche("Modelo1", "Fabricante1", 80000, (byte) 16);
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.consulta();
		System.out.println();
		c2.consulta();
		System.out.println();
		
		c2.actualizarPrecio((byte) 50);
		c2.consulta();
	}

}
