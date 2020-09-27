package gestion;
import zooAnimales.*;
public class Zona {
    private String nombre;
    private Zoologico[] zoo;
    private Animal[] animales;

    public Zona(){

    }
    public Zona(String nombre, Zoologico[] zoo, Animal[] animales) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
    }
    public void agregarAnimales(Animal animal){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico[] getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico[] zoo) {
        this.zoo = zoo;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }
}
