package Modelo;

import java.util.List;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;


public class ClienteDAO implements CRUD{
    Conexion conex = new Conexion();
    Connection acceso;
    PreparedStatement preStat;
    ResultSet resultSet;

    public TablaCliente listarId(String cedCliente){
        TablaCliente cliente = new TablaCliente();
        String sql = "SELECT * FROM CLIENTE WHERE cedCliente=?";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            preStat.setString(1, cedCliente);
            resultSet = preStat.executeQuery();
            while(resultSet.next()){
                cliente.setIdCliente(resultSet.getInt(1));
                cliente.setCedCliente(resultSet.getString(2));
                cliente.setNombCliente(resultSet.getString(3));
                cliente.setDirecCliente(resultSet.getString(4));
                cliente.setEstadoCliente(resultSet.getString(5));
            }
            
        } catch (Exception e) {
        }
        return cliente;
    }
    
    
    //METODOS PARA CRUD
    @Override
    public List listar() {
        List<TablaCliente> lista = new ArrayList<>();
        String sql ="SELECT * FROM CLIENTE ";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            resultSet = preStat.executeQuery();
            while(resultSet.next()){
                TablaCliente cliente = new TablaCliente();
                cliente.setIdCliente(resultSet.getInt(1));
                cliente.setCedCliente(resultSet.getString(2));
                cliente.setNombCliente(resultSet.getString(3));
                cliente.setDirecCliente(resultSet.getString(4));
                cliente.setEstadoCliente(resultSet.getString(5));
                lista.add(cliente);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int agregar(Object[] object) {
        int resp = 0;
        
        String sql = "INSERT INTO CLIENTE(cedCliente,nombCliente,direcCliente,estadoCliente)VALUES(?,?,?,?)";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            preStat.setObject(1, object[0]);
            preStat.setObject(2, object[1]);
            preStat.setObject(3, object[2]);
            preStat.setObject(4, object[3]);
            resp = preStat.executeUpdate();
            
        } catch (Exception e) {
        }
        return resp;
    }

    @Override
    public int actualizar(Object[] object) {
        int resp = 0;
        String sql = "UPDATE CLIENTE SET cedCliente=?, nombCliente=?, direcCliente=?, estadoCliente=? WHERE idCliente=?";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            preStat.setObject(1, object[0]);  
            preStat.setObject(2, object[1]);
            preStat.setObject(3, object[2]);
            preStat.setObject(4, object[3]);
            preStat.setObject(5, object[4]);
            resp = preStat.executeUpdate();
        } catch (Exception e) {
        }
        return resp;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM CLIENTE WHERE idCliente=?";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            preStat.setInt(1, id);
            preStat.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
