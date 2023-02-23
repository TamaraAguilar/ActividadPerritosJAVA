package com.generation.objetos23febrero.models;

public class Computador {
     /*******************ATRIBUTOS**********************/
    public String modelo;
    public Double tamanio;
    public String color;
    public String tipo;
    public String marca;
    




    /*******************CONSTRUCTORES**********************/


    public Computador() {
    }


    public Computador(String modelo, Double tamanio, String color, String tipo, String marca) {
        this.modelo = modelo;
        this.tamanio = tamanio;
        this.color = color;
        this.tipo = tipo;
        this.marca = marca;
    }



    /*******************GETTERS Y SETTERS**********************/

    
    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
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


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    


    /*******************MÉTODOS**********************/

    public String jugar(){
        return "El computador está ejecutando el Stardew Valley";
    }


    public String programar(){
        return "El computador ejecuta VSCode y permite programar";
    }


    public String encender(){
        return "El computador se enciende";
    }


    public String apagar(){
        return "El computador se apaga";
    }


    public void prenderApagar(boolean estado){
        if(estado == true){
            System.out.println("Equipo encendido");
        }else{
            System.out.println("Equipo apagado");
        }
    }

    
    public String procesarTexto(){
        return "El equipo procesa texto";
    }


}
