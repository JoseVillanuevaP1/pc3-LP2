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
import tienda.modelo.bean.Empleado;

public class EmpleadoDAO {

    public static Empleado buscarEmpleadoID(int cod) {
        Empleado emp = null;
        String sql = "Select*from empleado where idempleado=?";
        Connection cn = Conexion.abrir();
        try {
            ResultSet rs;
            //asigar valor al parametro
            try (PreparedStatement ps = cn.prepareStatement(sql)) {
                //asigar valor al parametro
                ps.setInt(1, cod);
                rs = ps.executeQuery();
                if (rs.next()) {
                    emp = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                }
                //create objetos
            }
            cn.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }

    public static ArrayList<Empleado> getEmpleados() {

        ArrayList<Empleado> empleados = new ArrayList<>();

        String sql = "Select * from empleado";
        Connection cn = Conexion.abrir();
        try {
            ResultSet rs;
            try (PreparedStatement ps = cn.prepareStatement(sql)) {
                rs = ps.executeQuery();
                while (rs.next()) {
                    Empleado emp;
                    emp = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                    empleados.add(emp);
                }
            }
            cn.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return empleados;
    }

}
