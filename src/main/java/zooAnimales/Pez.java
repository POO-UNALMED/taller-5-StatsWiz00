package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal{
    private ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
        listado.add(this);
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public Pez crearSalmon(String nombre, int edad, String genero){
        return new Pez(nombre, edad, "oceano",genero,"rojo",6);
    }
    public Pez crearBacalao(String nombre, int edad, String genero){
        return new Pez(nombre, edad, "oceano",genero,"gris",6);
    }
    public int cantidadPeces(){
        return listado.size();
    }
    @Override
    public String movimiento(){
        return "nadar";
    }
}
