package Modelo;

public class TablaFactura {
    int idFactura;
    int idVenta;
    int idProduct;
    int cantProductos;
    double precioVenta;
    
    public TablaFactura(){
        
    }

    public TablaFactura(int idFactura, int idVenta, int idProduct, int cantProductos, double precioVenta) {
        this.idFactura = idFactura;
        this.idVenta = idVenta;
        this.idProduct = idProduct;
        this.cantProductos = cantProductos;
        this.precioVenta = precioVenta;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
}
