package com.generation.objetos23febrero.models;

public class Radio {
     /*******************ATRIBUTOS**********************/

    public String modelo;
    public String marca;
    public String forma;
    public Double tamanio;
    public String color;
    







    /*******************CONSTRUCTORES**********************/


    public Radio() {
    }
    public Radio(String modelo, String marca, String forma, Double tamanio, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.forma = forma;
        this.tamanio = tamanio;
        this.color = color;
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
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
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






    /*******************MÉTODOS**********************/

    public String escucharMusica(){
        return "La radio permite escuchar música";
    }

    public String captarSenial(){
        return "La radio puede captar señal";
    }

    public String cambiardeEmisora(){
        return "La radio permite cambiar de emisora";
    }


    public String encender(){
        return "La radio se enciende";
    }


    public String apagar(){
        return "La radio se apaga";
    }




}
