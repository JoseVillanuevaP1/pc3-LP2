/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tienda.conexion.Conexion;
import tienda.modelo.bean.Articulo;

/**
 *
 * @author Dell
 */
public class ArticuloDAO {

    public static ArrayList<Articulo> getArticulo() {

        ArrayList<Articulo> articulos = new ArrayList<>();

        String sql = "Select * from articulo";
        Connection cn = Conexion.abrir();
        try {
            ResultSet rs;
            try ( PreparedStatement ps = cn.prepareStatement(sql)) {
                rs = ps.executeQuery();
                while (rs.next()) {
                    Articulo art;
                    art = new Articulo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), ArticuloDAO.getCategoriaArticulo(rs.getInt(6)));
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

    public static String getCategoriaArticulo(int id) {

        String categoria = null;
        //instruccion sql para buscar usuario
        String sql = "select * from categoria where idcategoria=?";
        //conexion a la bd
        Connection cn = Conexion.abrir();
        try {
            //ejecutar sql
            PreparedStatement ps = cn.prepareStatement(sql);
            //asignar parametros ?,?
            ps.setInt(1, id);
            //metodo que la ejecuta
            ResultSet rs = ps.executeQuery();
            //leer rs
            if (rs.next()) {
                categoria = rs.getString(2);
            }
            cn.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return categoria;
    }

}
