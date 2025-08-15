package DB;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Maique
 */
public class CONEXAO_JAVA_MYSQL {
     // Ajuste a URL/USER/PASSWORD conforme seu ambiente
    private static final String URL = "jdbc:mysql://localhost:3306/PROJETO_DE_LP_SCRIPT_DO_BANCO";
    private static final String USER = "root";
    private static final String PASSWORD = "2201";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Erro na conexão com o banco de dados: " + e.getMessage());
            return null;
        }
    }
}

