package ejerciciosHerencia;

public class EmpleadoMain {
	
	public static void main(String[] args) {
		// Crear empleados
		Empleado e = new Empleado("4586987D", "Lucía Jiménez Santos", "Avda. Magnolia 2 B", "+0034 854 96 54 25");
		Empleado p = new Programador("45215896F", "Miguel Pérez Martínez", "C/ Madrid 23", "+0034 857 12 54 78", "Alto", null);
		Empleado a =  new Administrativo("4586785H", "Manuel Santos de la Torre", "C/ Abedul 2 C", "+0034 866 14 54 25", "", null);
		Profesor pf = new Profesor("47521422L", "Miguel Gómez Iradi", "C/ Madrid 45", "+0034 857 77 54 76", 8, null);
		
		// Mostrar empleados
		System.out.println(e);
		System.out.println(p);
		System.out.println(a);
		System.out.println(pf);
	}

}
