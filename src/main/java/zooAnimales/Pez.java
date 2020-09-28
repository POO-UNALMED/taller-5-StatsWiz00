package zooAnimales;

import gestion.Zona;

public class Pez extends Animal{
    private Pez[] listado;
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
    }

    public Pez(Pez[] listado, int salmones, int bacalaos, String colorEscamas, int cantidadAletas, int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.salmones = salmones;
        this.bacalaos = bacalaos;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public Pez[] getListado() {
        return listado;
    }

    public void setListado(Pez[] listado) {
        this.listado = listado;
    }

    public int getSalmones() {
        return salmones;
    }

    public void setSalmones(int salmones) {
        this.salmones = salmones;
    }

    public int getBacalaos() {
        return bacalaos;
    }

    public void setBacalaos(int bacalaos) {
        this.bacalaos = bacalaos;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
    @Override
    public String movimiento(){
        return "nadar";
    }
}
