package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    private ArrayList<Ave> listado = new ArrayList<>();
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave(){
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave crearHalcon(String nombre,int edad, String genero){
        halcones++;
        return new Ave(nombre, edad, "montañas", genero, "cafe glorioso");
    }
    public Ave crearAguila(String nombre,int edad, String genero){
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }
    public int cantidadAves(){
        return listado.size();
    }

    public ArrayList<Ave> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Ave> listado) {
        this.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    @Override
    public String movimiento(){
        return "volar";
    }
}
