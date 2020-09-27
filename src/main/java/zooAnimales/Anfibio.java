package zooAnimales;

import gestion.Zona;

public class  Anfibio extends Animal {
    private Anfibio[] listado;
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(Anfibio[] listado, int ranas, int salamandras, String colorPiel, boolean venenoso, int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.ranas = ranas;
        this.salamandras = salamandras;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }
}