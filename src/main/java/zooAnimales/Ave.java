package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(){
        listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public static Ave crearHalcon(String nombre,int edad, String genero){
        halcones++;
        return new Ave(nombre, edad, "monta" +"\u00f1" +"as", genero, "cafe glorioso");
    }
    public static Ave crearAguila(String nombre,int edad, String genero){
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }
    public static int cantidadAves(){
        return listado.size();
    }

    public ArrayList<Ave> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
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
