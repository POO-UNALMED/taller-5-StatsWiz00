package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal{
    private Reptil[] listado;
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

    public Reptil[] getListado() {
        return listado;
    }

    public void setListado(Reptil[] listado) {
        this.listado = listado;
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
