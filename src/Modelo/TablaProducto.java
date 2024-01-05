package Modelo;

public class TablaProducto{
    int idProduct;
    String nombProduct;
    double precioProduct;
    int stockProduct;
    String estadoProduct;
    
    public TablaProducto(){
        
    }
    
    public TablaProducto(int idProduct, String nombProduct, double precioProduct, int stockProduct, String estadoProduct){
        this.idProduct = idProduct;
        this.nombProduct = nombProduct;
        this.precioProduct = precioProduct;
        this.stockProduct = stockProduct;
        this.estadoProduct = estadoProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNombProduct() {
        return nombProduct;
    }

    public void setNombProduct(String nombProduct) {
        this.nombProduct = nombProduct;
    }

    public double getPrecioProduct() {
        return precioProduct;
    }

    public void setPrecioProduct(double precioProduct) {
        this.precioProduct = precioProduct;
    }

    public int getStockProduct() {
        return stockProduct;
    }

    public void setStockProduct(int stockProduct) {
        this.stockProduct = stockProduct;
    }

    public String getEstadoProduct() {
        return estadoProduct;
    }

    public void setEstadoProduct(String estadoProduct) {
        this.estadoProduct = estadoProduct;
    }
    
}
