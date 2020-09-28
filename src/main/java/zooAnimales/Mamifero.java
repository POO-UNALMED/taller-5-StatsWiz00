package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal{
    private ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    public int caballos;
    public int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(){
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }


    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getLeones() {
        return leones;
    }

    public void setLeones(int leones) {
        this.leones = leones;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
