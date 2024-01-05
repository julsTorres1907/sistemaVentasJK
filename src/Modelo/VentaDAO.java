package Modelo;

import java.net.ResponseCache;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class VentaDAO {
    Conexion conex = new Conexion();
    Connection acceso;
    PreparedStatement preStat;
    ResultSet resultSet;
    
    int resp=0;
    
    public String generarNumSer(){
        String numser = "";
        String sql = "SELECT max(numSerie) FROM VENTA";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            resultSet = preStat.executeQuery();
            while(resultSet.next()){
                numser = resultSet.getString(1);
            }
        } catch (Exception e) {
        }
        return numser;
    }
    
    public String idVentas(){
        String idVenta = "";
        String sql = "SELECT max(idVenta) FROM VENTA";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            resultSet = preStat.executeQuery();
            while(resultSet.next()){
                idVenta = resultSet.getString(1);
            }
        } catch (Exception e) {
        }
        return idVenta;
    }
    
    public int guardarVenta(Venta sale){
       Venta venta = new Venta();
       String sql = "INSERT INTO VENTA(idCliente, idEmple, numSerie, montoVenta, fechaVenta, estadoVenta)VALUES(?,?,?,?,?,?)";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            preStat.setInt(1, sale.getIdCliente());
            preStat.setInt(2, sale.getIdEmple());
            preStat.setString(3, sale.getNumSerie());
            preStat.setDouble(4, sale.getMontoVenta());
            preStat.setString(5, sale.getFechaVenta());
            preStat.setString(6, sale.getEstadoVenta());
            resp = preStat.executeUpdate();
        } catch (Exception e) {
        }
        return resp;
    }
    
    public int guardarFactura(TablaFactura factura){
        String sql = "INSERT INTO FACTURA(idVenta, idProduct, cantProductos, precioVenta)VALUES(?,?,?,?)";
        try {
            acceso = conex.conectarBD();
            preStat = acceso.prepareStatement(sql);
            preStat.setInt(1, factura.getIdVenta());
            preStat.setInt(2, factura.getIdProduct());
            preStat.setInt(3, factura.getCantProductos());
            preStat.setDouble(4, factura.getPrecioVenta());
            resp = preStat.executeUpdate();
        } catch (Exception e) {
        }
        return resp;
    }
}
