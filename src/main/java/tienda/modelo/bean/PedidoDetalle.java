
package tienda.modelo.bean;

public class PedidoDetalle {
    private int idPedidoDetalle;
    private int idPedido;
    private int idArticulo;
    private int precio;
    private int cantidad;
    private int subTotal;
    private String fecha;

    public PedidoDetalle(int idPedidoDetalle, int idPedido, int idArticulo, int precio, int cantidad, int subTotal) {
        this.idPedidoDetalle = idPedidoDetalle;
        this.idPedido = idPedido;
        this.idArticulo = idArticulo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public PedidoDetalle() {
    }

    public int getIdPedidoDetalle() {
        return idPedidoDetalle;
    }

    public void setIdPedidoDetalle(int idPedidoDetalle) {
        this.idPedidoDetalle = idPedidoDetalle;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }
    
        public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
