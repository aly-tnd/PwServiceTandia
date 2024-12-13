package pio.daw.jagd.encriptador;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServiceTandia {
	
	private BasicPasswordEncryptor passwordEncryptor;
	
	public PwServiceTandia() {
	
	this.passwordEncryptor = new BasicPasswordEncryptor(); 
	}
		
	public String encriptarContrasena(String contrasena) { 
		
	return passwordEncryptor.encryptPassword(contrasena);
	}	
	
	public boolean verificarContrasena(String  contrasena, String contrasenaEncriptada) {
			return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
	}

	@Override
	public String toString() {
		return "PwServiceTandia [passwordEncryptor=" + passwordEncryptor + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
