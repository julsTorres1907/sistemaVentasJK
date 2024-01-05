package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//Esta clase establece la conexion entre el proyecto 'sistemaVentasJK' y la base de datos local 'proyectoFinalJava'
public class Conexion {
    Connection acces;
    String driver = "com.mysql.cj.jdbc.Driver";
    String bd = "sistemaVentasJK";
    String url = "jdbc:mysql://localhost:3308/";
    String user = "root";
    String pass = "";
    public Conexion(){
        
    }
    public Connection conectarBD(){
        try {
            Class.forName(driver);
            acces = DriverManager.getConnection(url+bd, user, pass);
        } catch (ClassNotFoundException | SQLException  ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "NO SE PUDO CONECTAR A LA BASE DE DATOS "+ bd + " "+ ex.toString());
        }
        /*try {
            Class.forName(driver);
            acces = DriverManager.getConnection(url+bd, user, pass);
            System.out.println("CONECTADO a BD: "+bd);
        } catch (Exception e){
            System.out.println("NO SE PUDO ESTABLECER LA CONEXION CON LA BASE DE DATOS '"+bd+"'");
        }*/
        return acces;
    }
}
