package com.generation.objetos23febrero.models;

public class Perro {
    //cuando nosotros creamos atributos de objetos, en este caso, un perro
    //podemos determinar si el atributo es privado o público
    //esto va a depender de la sensibilidad de datos
    /******************ATRIBUTOS**********************/
    public String raza;
    public String color;
    public Double tamanio;
    public String pelaje;
    public char sexo;
    private Integer chip; //Integer es el objeto de int



    /******************CONSTRUCTORES**********************/

    //CONSTRUCTOR POR DEFECTO
    public Perro() {
    }

    //CONSTRUCTOR DE OBJETO COMPLETO
    //este también debe estar en TODAS las clases que crremos
    public Perro(String raza, String color, Double tamanio, String pelaje, char sexo, Integer chip) {
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
        this.pelaje = pelaje;
        this.sexo = sexo;
        this.chip = chip;
    }

    

    public Perro(String razaPerro, String colorPerro, Double tamanioPerro, String pelajePerro, String sexoPerro,
            Integer chipPerro) {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Integer getChip() {
        return chip;
    }

    public void setChip(Integer chip) {
        this.chip = chip;
    }




    /******************FUNCIONALIDADES**********************/
    public void ladrar(){
        System.out.println("Guau Guau");
    }
 
    public String romperCosas(boolean meRetaron){
        if(meRetaron == true){
            return "Destrozo";
        }else{
            return "No destrozo";
        }
    }

    public String cavar(){
        return "El perro cavó un hoyo en el patio";
    }

    @Override
    public String toString() {
        return "Perro [raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + ", pelaje=" + pelaje + ", sexo="
                + sexo + ", chip=" + chip + "]";
    }
        

    

}