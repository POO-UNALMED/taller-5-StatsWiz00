package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class  Anfibio extends Animal {
    private ArrayList<Anfibio> listado = new ArrayList<>();
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }


    public int getRanas() {
        return ranas;
    }

    public void setRanas(int ranas) {
        this.ranas = ranas;
    }

    public int getSalamandras() {
        return salamandras;
    }

    public void setSalamandras(int salamandras) {
        this.salamandras = salamandras;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    @Override
    public String movimiento(){
        return "saltar";
    }
}
