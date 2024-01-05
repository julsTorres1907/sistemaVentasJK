package Modelo;


public class TablaCliente {
    int idCliente;
    String cedCliente;
    String nombCliente;
    String direcCliente;
    String estadoCliente;
    
    public TablaCliente(){
    
    }
    
    public TablaCliente(int idCliente, String cedCliente, String nombCliente, String direcCliente, String estadoCliente){
        this.idCliente = idCliente;
        this.cedCliente = cedCliente;
        this.nombCliente = nombCliente;
        this.direcCliente = direcCliente;
        this.estadoCliente = estadoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCedCliente() {
        return cedCliente;
    }

    public void setCedCliente(String cedCliente) {
        this.cedCliente = cedCliente;
    }

    public String getNombCliente() {
        return nombCliente;
    }

    public void setNombCliente(String nombCliente) {
        this.nombCliente = nombCliente;
    }

    public String getDirecCliente() {
        return direcCliente;
    }

    public void setDirecCliente(String direcCliente) {
        this.direcCliente = direcCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
    
}
