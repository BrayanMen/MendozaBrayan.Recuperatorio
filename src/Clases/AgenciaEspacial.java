package Clases;

import Excepcions.ExceptionNavesDuplicado;
import Excepcions.ExceptionNavesEmpty;
import Interfaces.Explorable;
import java.util.ArrayList;
import java.util.List;


public class AgenciaEspacial {

    private List<Nave>  naves;
    
    public AgenciaEspacial(){
        naves = new ArrayList<>();
    }

    public void agregarNave(Nave nave){
         for (Nave n : naves) {
            if (n.equals(nave)) {
                throw new ExceptionNavesDuplicado("La nave " + nave.getNombre() + ", ya existe.");
            }
        }
        naves.add(nave);
    }

    public void mostrarNaves(){
         if (naves.isEmpty()) {
            throw new ExceptionNavesEmpty();
        }
        for (Nave n : naves) {
            System.out.println(n);
            System.out.println("");
        }
    }

    public void iniciarExploracion() {
        for (Nave n : naves) {
            if (n instanceof Explorable explorable) {
                explorable.explorar();
                System.out.println("");
            } else {
                System.out.println("No puede participar en la exploracion el Crucero: " + n.getNombre());
            }
        }
    }
}
