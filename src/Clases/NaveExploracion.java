package Clases;

import Enums.Mision;
import Interfaces.Explorable;

public class NaveExploracion extends Nave implements Explorable{
    private Mision mision;

    public NaveExploracion(String nombre, int capacidadTripulacion, int anioLanzamiento, Mision mision) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.mision = mision;
    }

    @Override
    public String toString() {
        return super.toString() + ", mision: " + mision;
    }
    

    @Override
    public void explorar() {
        System.out.println("Iniciando mision de exploracion para la Nave de Exploracion: " + getNombre());
    }
    
}
