package factory.exemplo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			String banco = System.getenv("banco");
			Connection conexao = DriverManager.getConnection("jdbc:" + banco + "://localhost:3306/banco", "usuario",
					"senha");
			return conexao;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
