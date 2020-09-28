package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Reptil extends Animal{
    private ArrayList<Reptil> listado = new ArrayList<>();
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){

    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }


    public int getIguanas() {
        return iguanas;
    }

    public void setIguanas(int iguanas) {
        this.iguanas = iguanas;
    }

    public int getSerpientes() {
        return serpientes;
    }

    public void setSerpientes(int serpientes) {
        this.serpientes = serpientes;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
    @Override
    public String movimiento(){
        return "reptar";
    }
}
