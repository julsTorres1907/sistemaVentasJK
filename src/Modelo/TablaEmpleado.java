package Modelo;

public class TablaEmpleado {
    int idEmple;
    String cedEmple;
    String nombEmple;
    String telEmple;
    String estadoEmple;
    String nombUserEmple;
    String passEmple;
    
    public TablaEmpleado(){
    }
    
    public TablaEmpleado(int idEmple, String cedEmple, String nombEmple, String telEmple, String estadoEmple, String nombUserEmple, String passEmple) {
        this.idEmple = idEmple;
        this.cedEmple = cedEmple;
        this.nombEmple = nombEmple;
        this.telEmple = telEmple;
        this.estadoEmple = estadoEmple;
        this.nombUserEmple = nombUserEmple;
        this.passEmple = passEmple;
    }

    public int getIdEmple() {
        return idEmple;
    }

    public String getCedEmple() {
        return cedEmple;
    }

    public String getNombEmple() {
        return nombEmple;
    }

    public String getTelEmple() {
        return telEmple;
    }

    public String getEstadoEmple() {
        return estadoEmple;
    }

    public String getNombUserEmple() {
        return nombUserEmple;
    }

    public String getPassEmple(){
        return passEmple;
    }
    
    public void setIdEmple(int idEmple) {
        this.idEmple = idEmple;
    }

    public void setCedEmple(String cedEmple) {
        this.cedEmple = cedEmple;
    }

    public void setNombEmple(String nombEmple) {
        this.nombEmple = nombEmple;
    }

    public void setTelEmple(String telEmple) {
        this.telEmple = telEmple;
    }

    public void setEstadoEmple(String estadoEmple) {
        this.estadoEmple = estadoEmple;
    }

    public void setNombUserEmple(String nombUserEmple) {
        this.nombUserEmple = nombUserEmple;
    }
    
    public void setPassEmple(String passEmple){
        this.passEmple = passEmple;
    }
    
    
    
}
