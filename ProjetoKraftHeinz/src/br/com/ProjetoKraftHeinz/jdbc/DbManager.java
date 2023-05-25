package br.com.ProjetoKraftHeinz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {

    public static Connection obterConexao(){
        Connection conexao = null;

        try{
            //registra driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //abre conexão
            conexao = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","RM97177","150889"
            );

        }catch (SQLException e){
            System.err.println("Não foi possível conectar com o banco");
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            System.err.println("O Driver JDBC não foi encontrado");
            e.printStackTrace();
        }
        return conexao;
    }
}
