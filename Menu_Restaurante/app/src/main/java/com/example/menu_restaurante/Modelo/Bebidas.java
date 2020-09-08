package com.example.menu_restaurante.Modelo;

public class Bebidas {
    private int imgBebida;
    private String nombre;
    private String precio;
    private String descripcion;

    public Bebidas() {

    }

    public Bebidas(int imgBebida, String nombre,String precio,String descripcion) {
        this.imgBebida = imgBebida;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion=descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImgBebida() {
        return imgBebida;
    }


    public String getNombre() {
        return nombre;
    }


    public String getPrecio() {
        return precio;
    }


}
