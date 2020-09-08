package com.example.menu_restaurante.Modelo;

public class Postres {
    private int imgPostre;
    private String nombre;
    private String precio;
    private String descripcion;

    public Postres() {

    }

    public Postres(int imgPostre, String nombre, String precio, String descripcion) {
        this.imgPostre = imgPostre;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getImgPostre() {
        return imgPostre;
    }

    public void setImgPostre(int imgPostre) {
        this.imgPostre = imgPostre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
