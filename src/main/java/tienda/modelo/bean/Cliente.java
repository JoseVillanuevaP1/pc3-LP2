/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.modelo.bean;

/**
 *
 * @author jose
 */
public class Cliente {

    private int idCliente;
    private String apellidos;
    private String nombres;
    private String email;
    private int idPais;

    public Cliente() {

    }

    public Cliente(int idCliente, String apellidos, String nombres, String email, int idPais) {
        this.idCliente = idCliente;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.email = email;
        this.idPais = idPais;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

}
