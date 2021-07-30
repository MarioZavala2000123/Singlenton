package edu.uspg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SinglentonApplication<JdbcTemplate> implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SinglentonApplication.class, args);
		
	}
	
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO Estudiantes (Id, Nombre) VALUES ( "
				+ "1, 'Carlos'";
		
		int rows = jdbcTemplate.update(sql);
		if (rows > 0 ) {
			System.out.println("Se ha insertado un nuevo dato");
			
		}
	}
}

		
	//	Conexion c = Conexion.getInstancia();
		
	//	c.conectar();
	//	c.desconectar();
		
	//}

//}