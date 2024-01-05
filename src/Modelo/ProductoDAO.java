package Modelo;

import Vistas.ProductoForm;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductoDAO implements CRUD{
    Conexion conex = new Conexion();
    Connection acceso;
    PreparedStatement preStat;
    ResultSet resultSet;
    
    int resp;
    
    //Según el idProduct se actualiza la columna asociada al stockProduct
    public int actualizarStock(int cantProduct, int idProduct){
        String sql = "UPDATE PRODUCTO SET stockProduct=? WHERE idProduct=?";
        
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            preStat.setInt(1, cantProduct);
            preStat.setInt(2, idProduct);
            resp = preStat.executeUpdate();
        } catch (Exception e) {
        }
        return resp;
    }
    
    //Se seleccionan todas las columnas de la tabla PRODUCTO según su idProduct
    public TablaProducto listarId(int idProduct){
        TablaProducto product = new TablaProducto();
        String sql = "SELECT * FROM PRODUCTO WHERE idProduct=?";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            preStat.setInt(1, idProduct);
            resultSet = preStat.executeQuery();
            while(resultSet.next()){
                product.setIdProduct(resultSet.getInt(1));
                product.setNombProduct(resultSet.getString(2));
                product.setPrecioProduct(resultSet.getDouble(3));
                product.setStockProduct(resultSet.getInt(4));
                product.setEstadoProduct(resultSet.getString(5));
            }
        } catch (Exception e) {
        }
        return product;
    }
    
    // Mantenimiento CRUD
    @Override
    public List listar() {
        List<TablaProducto> lista = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTO";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            resultSet = preStat.executeQuery();
            while(resultSet.next()){
                TablaProducto producto = new TablaProducto();
                producto.setIdProduct(resultSet.getInt(1));
                producto.setNombProduct(resultSet.getString(2));
                producto.setPrecioProduct(resultSet.getDouble(3));
                producto.setStockProduct(resultSet.getInt(4));
                producto.setEstadoProduct(resultSet.getString(5));
                lista.add(producto);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int agregar(Object[] obj) {
        int resp = 0;
        
        String sql = "INSERT INTO PRODUCTO(idProduct, nombProduct, precioProduct, stockProduct, estadoProduct)VALUES(?,?,?,?,?)";
        try{
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            preStat.setObject(1, obj[0]);
            preStat.setObject(2, obj[1]);
            preStat.setObject(3, obj[2]);
            preStat.setObject(4, obj[3]);
            preStat.setObject(5, obj[4]);
            resp = preStat.executeUpdate();
        } catch (Exception e){
            
        }
        return resp;
    }

    @Override
    public int actualizar(Object[] obj) {
        int resp = 0;
        String sql = "UPDATE PRODUCTO SET nombProduct=?, precioProduct=?, stockProduct=?, estadoProduct=? WHERE idProduct=?";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            preStat.setObject(1, obj[0]);
            preStat.setObject(2, obj[1]);
            preStat.setObject(3, obj[2]);
            preStat.setObject(4, obj[3]);
            preStat.setObject(5, obj[4]);
            resp = preStat.executeUpdate();
            
        } catch (Exception e) {
            
        }   
        return resp;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM PRODUCTO WHERE idProduct=?";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            preStat.setInt(1, id);
            preStat.executeUpdate();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el resgistro en la tabla 'PRODUCTO'");
        }
    }
    
}
