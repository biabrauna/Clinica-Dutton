package br.com.Clinica.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
        
public class Conexao {
    private static final String urlBase = "jdbc:mysql://localhost/clinica";
    private static final String usuario = "root";
    private static final String senha = "ifgoiano";
    
    public static Connection getConexao(){
        Connection conexao = null;

       
        try {
            conexao= DriverManager.getConnection(urlBase, usuario, senha);
        if(conexao!= null)
            JOptionPane.showMessageDialog(null, "conexão efetuada com êxito");
       
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
       return conexao;
       
        
    }
         
    
    }
  
 


