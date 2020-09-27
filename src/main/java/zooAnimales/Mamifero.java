package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal{
    private Mamifero[] listado;
    public int caballos;
    public int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(Mamifero[] listado, int caballos, int leones, boolean pelaje, int patas, int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.caballos = caballos;
        this.leones = leones;
        this.pelaje = pelaje;
        this.patas = patas;
    }
}
