package tienda.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tienda.conexion.Conexion;
import tienda.modelo.bean.Articulo;
import tienda.modelo.bean.PedidoDetalle;

public class ConsultasDao {

    //obtener Articulo por IdCategoria
    public static List<Articulo> getArtByCategoria(int idCat) {
        List<Articulo> articulos = new ArrayList<>();
        String sql = "select * from articulo where idcategoria=? ";
        Connection cn = Conexion.abrir();
        try {
            ResultSet rs;
            //asigar valor al parametro
            try ( PreparedStatement ps = cn.prepareStatement(sql)) {

                ps.setInt(1, idCat);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Articulo art = new Articulo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6));
                    articulos.add(art);
                }

            }
            cn.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return articulos;
    }

    //obtener idCategoria por Nombre de la categoria
    public static int getIdCategoria(String categoria) {
        String sql = "select * from categoria where categoria=? ";
        Connection cn = Conexion.abrir();
        try {
            ResultSet rs;
            //asigar valor al parametro
            try ( PreparedStatement ps = cn.prepareStatement(sql)) {
                //asigar valor al parametro
                ps.setString(1, categoria);
                rs = ps.executeQuery();
                if (rs.next()) {
                    return rs.getInt("idcategoria");
                }
            }
            cn.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    //obtener idEmpleado por nombre
    public static int getIdEmpleado(String empleado) {
        String sql = "select idempleado from empleado where nombre=? ";
        Connection cn = Conexion.abrir();
        try {
            ResultSet rs;

            try ( PreparedStatement ps = cn.prepareStatement(sql)) {

                ps.setString(1, empleado);
                rs = ps.executeQuery();
                if (rs.next()) {
                    return rs.getInt("idempleado");
                }
            }
            cn.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error al obtener idEmpleado: " + e);
        }

        return 0;
    }

    //obtener pedidos por empleado
    public static List<PedidoDetalle> getPedidosByEmpleado(int idEmpleado) {

        List<PedidoDetalle> pedidos = new ArrayList<>();
        String sql = "select * from pedido_detalle pd, pedido_encabezado pe "
                + "where pe.idpedido = pd.idpedido and pe.idempleado = ?";
        Connection cn = Conexion.abrir();
        try {
            ResultSet rs;
            //asigar valor al parametro
            try ( PreparedStatement ps = cn.prepareStatement(sql)) {

                ps.setInt(1, idEmpleado);
                rs = ps.executeQuery();
                while (rs.next()) {
                    PedidoDetalle ped = new PedidoDetalle(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
                    pedidos.add(ped);
                }

            }
            cn.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error al obtener Pedidos por Empleado: " + e);
        }

        return pedidos;
    }

    //obtener pedidos entre fechas
    public static List<PedidoDetalle> getPedidosByDate(String f_inicial, String f_final) {
        List<PedidoDetalle> pedidos = new ArrayList<>();
        String sql = "select * from pedido_detalle pd, pedido_encabezado pe "
                + " where pe.idpedido = pd.idpedido and pe.fecha between ? and ?;";

        Connection cn = Conexion.abrir();
        try {
            ResultSet rs;
            //asigar valor al parametro
            try ( PreparedStatement ps = cn.prepareStatement(sql)) {

                ps.setString(1, f_inicial);
                ps.setString(2, f_final);
                rs = ps.executeQuery();
                while (rs.next()) {
                    PedidoDetalle ped = new PedidoDetalle(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
                    ped.setFecha(rs.getString(8));
                    pedidos.add(ped);
                }

            }
            cn.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error al obtener Pedidos por Fechas: " + e);
        }

        return pedidos;
    }

    //obtener Articulo por Empleado
    public static List<Articulo> getArtByEmpleado(int idEmpleado) {
        List<Articulo> articulos = new ArrayList<>();
        String sql = "select a.idarticulo, a.nombre, a.descripcion, a.precio, a.foto, a.idcategoria "
                + "from articulo a, pedido_detalle pd, pedido_encabezado pe "
                + "where a.idarticulo = pd.idarticulo and pd.idpedido = pe.idpedido and pe.idempleado = ?;";
        Connection cn = Conexion.abrir();
        try {
            ResultSet rs;
            //asigar valor al parametro
            try ( PreparedStatement ps = cn.prepareStatement(sql)) {

                ps.setInt(1, idEmpleado);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Articulo art = new Articulo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6));
                    articulos.add(art);
                }

            }
            cn.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return articulos;
    }
    
    //obtener el articulo con mayor precio
    public static Articulo getMaxPrecio(){
        Articulo articulo = null;
        String sql = "select * from articulo order by precio desc limit 1;";
        Connection cn = Conexion.abrir();
        try {
            ResultSet rs;

            try ( PreparedStatement ps = cn.prepareStatement(sql)) {
                rs = ps.executeQuery();
                if (rs.next()) {
                    articulo = new Articulo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6));
                }
            }
            cn.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error al obtener idEmpleado: " + e);
        }
        return articulo;
    }
}
