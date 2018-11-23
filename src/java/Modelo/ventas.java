/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Labing
 */
public class ventas {
    private int idVentas;
    private int idConsecionario;
    private int idCarro;

    public ventas() {
    }

    public ventas(int idVentas, int idConsecionario, int idCarro) {
        this.idVentas = idVentas;
        this.idConsecionario = idConsecionario;
        this.idCarro = idCarro;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdConsecionario() {
        return idConsecionario;
    }

    public void setIdConsecionario(int idConsecionario) {
        this.idConsecionario = idConsecionario;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }
    
    
}
