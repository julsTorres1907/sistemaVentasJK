package Modelo;

public class Venta {
    int idVenta;
    int idCliente;
    int idEmple;
    String numSerie;
    double montoVenta;
    String fechaVenta;
    String estadoVenta;
    
    public Venta(){
        
    }

    public Venta(int idVenta, int idCliente, int idEmple, String numSerie, double montoVenta, String fechaVenta, String estadoVenta) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.idEmple = idEmple;
        this.numSerie = numSerie;
        this.montoVenta = montoVenta;
        this.fechaVenta = fechaVenta;
        this.estadoVenta = estadoVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmple() {
        return idEmple;
    }

    public void setIdEmple(int idEmple) {
        this.idEmple = idEmple;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(String estadoVenta) {
        this.estadoVenta = estadoVenta;
    }
}
