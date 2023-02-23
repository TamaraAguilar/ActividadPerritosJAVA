package com.generation.objetos23febrero.models;

public class Celular {
     /*******************ATRIBUTOS**********************/
     public String modelo;
     public String marca;
     public Double tamanio;
     public String color;
     public String forma;
   












    /*******************CONSTRUCTORES**********************/


    public Celular() {
    }


    public Celular(String modelo, String marca, Double tamanio, String color, String forma) {
        this.modelo = modelo;
        this.marca = marca;
        this.tamanio = tamanio;
        this.color = color;
        this.forma = forma;
    }




    /*******************GETTERS Y SETTERS**********************/

    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public Double getTamanio() {
        return tamanio;
    }


    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getForma() {
        return forma;
    }


    public void setForma(String forma) {
        this.forma = forma;
    }





    /*******************MÉTODOS**********************/


    public String jugar(){
        return "El celular está ejecutando el Stardew Valley";
    }


    public String tomarFotos(){
        return "El celular abre la aplicación de Cámara y toma fotos";
    }

    public String navegarInternet(){
        return "El celular abre el navegador y permite navegar Internet";
    }

    public String encender(){
        return "El celular se enciende";
    }


    public String apagar(){
        return "El celular se apaga";
    }

}
