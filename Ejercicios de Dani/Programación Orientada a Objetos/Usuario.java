package ejerciciosTema9;

public class Usuario {
	
	// Atributos
	
	private String email = "";
	private String password = "";
	
	// Constructores
	
	// Constructor no-arg
	public Usuario() {
	}
	
	public Usuario(String em, String pass) {
		email = em;
		password = pass;
	}
	
	// Getters
	
	public String getEmail() {
		return email;
	}
	
	// Setters
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// Override toString
	@Override
	public String toString() {
		return "Usuario [email=" + email + ", password=" + password + "]";
	}
	
	// Validar: comprueba que la contraseña es correcta
	public boolean validar(String pass) {
		return pass.equals(password);
	}

}
