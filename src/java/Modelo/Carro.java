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
public class Carro {
 private int idCarro;
 private String matricula;
 private String Color;
private String Marca;
private int precio;
private String tipo;

    public Carro() {
    }

    public Carro(int idCarro, String matricula, String Color, String Marca, int precio, String tipo) {
        this.idCarro = idCarro;
        this.matricula = matricula;
        this.Color = Color;
        this.Marca = Marca;
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


 
 
 
 
}
