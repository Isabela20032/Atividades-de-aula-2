package br.edu.iftm.javaempresax.bd;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private  static Connection connection;
    private static final String DRIVER = "com.msql.jdbc.Driver";
    private  static  final  String SERVIDOR = "127.0.0.1";
    private static  final String PORTA = "3306";
    private static final String BANCO = "empresaX";
    private static final  String URL = "jdbc:mysql://" + SERVIDOR + ":" + PORTA + "/" + BANCO;
    private static final String USUARIO = "root";
    private  static  final String SENHA = "";

    public Conexao(){

    }

    public static  synchronized Connection getConnection(){
        if(connection == null){
            try{
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL,USUARIO,SENHA);
            }catch(ClassNotFoundException e){
                System.out.println("Erro ao carregar a conexão");
            }
            catch(SQLException e){
                System.out.println("Erro ao carregar o drive de conexão\n");
            }
        }
        System.out.println("Conexão realizada com sucesso!");
        return connection;
    }
}
