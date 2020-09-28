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
    }

    public int getHalcones() {
        return halcones;
    }

    public void setHalcones(int halcones) {
        this.halcones = halcones;
    }

    public int getAguilas() {
        return aguilas;
    }

    public void setAguilas(int aguilas) {
        this.aguilas = aguilas;
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
