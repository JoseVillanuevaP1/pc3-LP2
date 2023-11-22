/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.modelo.bean;

/**
 *
 * @author jose
 */
public class Pais {

    private int idPais;
    private String pais;

    public Pais() {
    }

    public Pais(int idPais, String pais) {
        this.idPais = idPais;
        this.pais = pais;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
