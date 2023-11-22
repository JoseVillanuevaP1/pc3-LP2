/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.modelo.bean;

import java.util.Date;

public class PedidoEncabezado {
    private int idPedidoEncabezado;
    private Date fecha;
    private int total;
    private int idEmpleado;
    private int idCliente;

    public PedidoEncabezado() {
    }

    public PedidoEncabezado(int idPedidoEncabezado, Date fecha, int total, int idEmpleado, int idCliente) {
        this.idPedidoEncabezado = idPedidoEncabezado;
        this.fecha = fecha;
        this.total = total;
        this.idEmpleado = idEmpleado;
        this.idCliente = idCliente;
    }

    public int getIdPedidoEncabezado() {
        return idPedidoEncabezado;
    }

    public void setIdPedidoEncabezado(int idPedidoEncabezado) {
        this.idPedidoEncabezado = idPedidoEncabezado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
