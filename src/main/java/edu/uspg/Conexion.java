package edu.uspg;

public class Conexion {
	
	private static Conexion instancia;
	
	private Conexion() {}
	
	public static Conexion getInstancia() {
		
		if (instancia == null) {
			
			instancia = new Conexion();
		}
		return instancia;
	}
	
	public void conectar() {
		
		System.out.println("------------------------------------------");
		System.out.println("Se conectó a la Base de Datos");
		System.out.println("------------------------------------------");
	}
	
	public void desconectar() {
		
		System.out.println("------------------------------------------");
		System.out.println("Se desconectó de la Base de Datos");
		System.out.println("------------------------------------------");
	}
	
}
