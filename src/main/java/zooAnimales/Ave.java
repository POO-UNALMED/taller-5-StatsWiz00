package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
    private Ave[] listado;
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave(){

    }

    public Ave(Ave[] listado, int halcones, int aguilas, String colorPlumas) {
        this.listado = listado;
        this.halcones = halcones;
        this.aguilas = aguilas;
        this.colorPlumas = colorPlumas;
    }

    public Ave[] getListado() {
        return listado;
    }

    public void setListado(Ave[] listado) {
        this.listado = listado;
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
