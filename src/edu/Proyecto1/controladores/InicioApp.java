package edu.Proyecto1.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InicioApp {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:port/user";
		
		String usuario = "user";
		
		String contraseniaString="password";
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection conexionConnection= DriverManager.getConnection(url, usuario, contraseniaString);
			
			if(conexionConnection!=null) {
				System.out.println("Se ha hecho la conexion correctamente");
			}else {
				System.out.println("La conecxion no se ha heco bien");
			}
			
			conexionConnection.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
