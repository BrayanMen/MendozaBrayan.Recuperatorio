package Clases;

import java.util.Objects;

public abstract class Nave {

    private String nombre;
    private int capacidadTripulacion;
    private int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nave: " + "nombre: " + nombre + ", capacidadTripulacion: " + capacidadTripulacion + ", anioLanzamiento: " + anioLanzamiento;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Nave n = (Nave) obj;
        
        return nombre.equals(n.nombre) && anioLanzamiento == n.anioLanzamiento ;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nombre, anioLanzamiento);
    }
    
    
}
