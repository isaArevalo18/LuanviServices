package com.example.menu_restaurante.Modelo;

public class Platillos {
    private int imgPlatillo;
    private String nombre;
    private String precio;
    private String descripcion;

    public Platillos() {

    }

    public Platillos(int imgPlatillo, String nombre, String precio, String descripcion) {
        this.imgPlatillo = imgPlatillo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getImgPlatillo() {
        return imgPlatillo;
    }

    public void setImgPlatillo(int imgPlatillo) {
        this.imgPlatillo = imgPlatillo;
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
