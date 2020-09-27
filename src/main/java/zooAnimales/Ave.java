package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
    private Ave[] listado;
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave(){

    }
    public Ave(Ave[] listado, int halcones, int aguilas, String colorPlumas,int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.halcones = halcones;
        this.aguilas = aguilas;
        this.colorPlumas = colorPlumas;
    }
}
