package Modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
// En esta clase se crean los métodos para la extraccion de datos de la base de datos 'proyectoFinalJava'
//DAO -->Data Acces Object
public class EmpleadoDAO implements CRUD{
    PreparedStatement pS;
    ResultSet rS;
   
    Conexion conex = new Conexion();
    Connection acceso;
    
    //Método que valida los datos ingresados en el formulario del Login
    public TablaEmpleado validarEmpleado(String passEmple, String user){
        TablaEmpleado tabEmple = new TablaEmpleado();
        String consultSql = "SELECT * FROM EMPLEADO WHERE passEmple=? AND userEmple=?";
        try {
            acceso = conex.conectarBD();
            pS = acceso.prepareStatement(consultSql);
            pS.setString(1, passEmple);
            pS.setString(2, user);
            rS = pS.executeQuery();
            while(rS.next()){
                tabEmple.setIdEmple(rS.getInt(1));
                tabEmple.setCedEmple(rS.getString(2));
                tabEmple.setNombEmple(rS.getString(3));
                tabEmple.setTelEmple(rS.getString(4));
                tabEmple.setEstadoEmple(rS.getString(5));
                tabEmple.setNombUserEmple(rS.getString(6));
                tabEmple.setPassEmple(rS.getString(7));
            }
        } catch (Exception e) {
        }
        return tabEmple;
    }

    @Override
    public List listar() {
        List<TablaEmpleado> lista = new ArrayList<>();
        String sql = "SELECT * FROM EMPLEADO";
        try {
            acceso = conex.conectarBD();
            pS = acceso.prepareStatement(sql);
            rS = pS.executeQuery();
            while (rS.next()) {                
                TablaEmpleado empleado = new TablaEmpleado();
                empleado.setIdEmple(rS.getInt(1));
                empleado.setCedEmple(rS.getString(2));
                empleado.setNombEmple(rS.getString(3));
                empleado.setTelEmple(rS.getString(4));
                empleado.setEstadoEmple(rS.getString(5));
                empleado.setNombUserEmple(rS.getString(6));
                empleado.setPassEmple(rS.getString(7));
                lista.add(empleado);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int agregar(Object[] obj) {
        int resp=0;
        String sql = "INSERT INTO EMPLEADO(cedEmple, nombEmple, telEmple, estadoEmple, userEmple, passEmple)VALUES(?,?,?,?,?,?)";
        
        try {
            acceso = conex.conectarBD();
            pS = acceso.prepareStatement(sql);
            pS.setObject(1, obj[0]);
            pS.setObject(2, obj[1]);
            pS.setObject(3, obj[2]);
            pS.setObject(4, obj[3]);
            pS.setObject(5, obj[4]);
            pS.setObject(6, obj[5]);
            resp = pS.executeUpdate();
        } catch (Exception e) {
        }
        return resp;
    }

    @Override
    public int actualizar(Object[] obj) {
        int resp=0;
        String sql = "UPDATE EMPLEADO SET cedEmple=?, nombEmple=?, telEmple=?, estadoEmple=?, userEmple=?, passEmple=? WHERE idEmple=?";
        try {
            acceso = conex.conectarBD();
            pS = acceso.prepareStatement(sql);
            pS.setObject(1, obj[0]);
            pS.setObject(2, obj[1]);
            pS.setObject(3, obj[2]);
            pS.setObject(4, obj[3]);
            pS.setObject(5, obj[4]);
            pS.setObject(6, obj[5]);
            pS.setObject(7, obj[6]);
            resp = pS.executeUpdate();
        }catch(Exception e){
            
        }
        return resp;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM EMPLEADO WHERE idEmple=?";
        try {
            acceso = conex.conectarBD();
            pS = acceso.prepareStatement(sql);
            pS.setInt(1, id);
            pS.executeUpdate();
        } catch (Exception e) {
        }
    }
}
