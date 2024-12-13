package pio.daw.jagd.encriptador;

public class PwServiceTandiaTest {
	public static void main(String[] args) {
		PwServiceTandia servicio = new PwServiceTandia();
		String password = "miSuperPassword";
		String passwordEncriptada = servicio.encriptarContrasena(password);
		System.out.println("Prueba del alumno Aly");
		System.out.println("La contraseña encriptada es: " +passwordEncriptada);
		
		//vamos a verificarlo
		boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
		System.out.println("La contraseña encriptada es válida: " +esValida);
	}

}
