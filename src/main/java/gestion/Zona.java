package gestion;
import zooAnimales.*;
import java.util.ArrayList;
public class Zona {
    private String nombre;
    private Zoologico zoo;
    private static ArrayList<Animal> animales = new ArrayList<>();

    public Zona(){
    }

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        Zona.animales = animales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }
    public int cantidadAnimales(){
        return animales.size();
    }
}
