package Modelo;

import java.util.List;

public interface CRUD {
    public List listar();
    public int agregar(Object[] obj);
    public int actualizar(Object[] obj);
    public void eliminar(int id);
    
}
