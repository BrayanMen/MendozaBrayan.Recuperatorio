package Clases;

import Interfaces.Explorable;

public class Carguero extends Nave implements Explorable {

    private int capacidadCarga;
    private final int CARGA_MAX = 500;
    private final int CARGA_MIN = 100;

    public Carguero(String nombre, int capacidadTripulacion, int anioLanzamiento, int capacidadCarga) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        if (capacidadCarga > CARGA_MAX || capacidadCarga < CARGA_MIN) {
            throw new IllegalArgumentException("Carga fuera de Rango");
        }
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacidadCarga=" + capacidadCarga;
    }

    @Override
    public void explorar() {
         System.out.println("Iniciando mision de exploracion para el carguero: " + getNombre());
    }

}
