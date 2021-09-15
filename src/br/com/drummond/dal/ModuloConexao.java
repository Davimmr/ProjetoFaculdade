/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.drummond.dal;

import java.sql.*;

/*data acess learn*
 *
 * @author Miticos
 */
public class ModuloConexao {
//metodo responsavel por estabelecer a conexao com o bd

    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver
        //qual o tipo de bd
        String driver = "com.mysql.jdbc.Driver";
        //qual o caminho e o nome do bd e dps qual usuario pode acessar o bd q
        // q seria do xampp o root e sem senha
        // armazenando informacoes referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbTIO";
        String user = "root";
        String password = "";
        //estabelecendo a conexao com o banco
        // vai exe a linha do drive, obtendo conexao pelo caminho usuario e senha
        // para poder ligar o bd com o java e entao returna a conexao ""
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } 
        catch (Exception e) 
        {
            //System.out.println(e);
            return null;
        }
        
    }
}
