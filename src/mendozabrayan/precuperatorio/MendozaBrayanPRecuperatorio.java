package mendozabrayan.precuperatorio;

import Clases.AgenciaEspacial;
import Clases.Carguero;
import Clases.CruceroEstelar;
import Clases.Nave;
import Clases.NaveExploracion;
import Enums.Mision;
import Excepcions.ExceptionNavesDuplicado;

public class MendozaBrayanPRecuperatorio {

    public static void main(String[] args) {
        AgenciaEspacial agencia = new AgenciaEspacial();
        try {
            Nave naveExploracion1 = new NaveExploracion("Explorador1", 10, 2020, Mision.INVESTIGACION);
            NaveExploracion naveExploracion2 = new NaveExploracion("Explorador2", 12, 2018, Mision.CARTOGRAFIA);
            Nave naveExploracion3 = new NaveExploracion("Explorador3", 15, 2019, Mision.CONTACTO);
            Nave naveExploracion4 = new NaveExploracion("Explorador4", 8, 2021, Mision.INVESTIGACION);
            NaveExploracion naveExploracion5 = new NaveExploracion("Explorador5", 20, 2022, Mision.CARTOGRAFIA);

            Nave carguero1 = new Carguero("Galactica", 15, 2018, 300);
            Carguero carguero3 = new Carguero("Carguero3", 25, 2019, 400);
            Nave carguero4 = new Carguero("Carguero4", 10, 2020, 150);
            Nave carguero5 = new Carguero("Carguero5", 18, 2022, 500);
            Carguero carguero2 = new Carguero("Galactica", 15, 2018, 300);

            Nave crucero1 = new CruceroEstelar("Crucero1", 50, 2019, 200);
            CruceroEstelar crucero2 = new CruceroEstelar("Crucero2", 60, 2020, 300);
            Nave crucero3 = new CruceroEstelar("Crucero3", 70, 2021, 400);
            CruceroEstelar crucero4 = new CruceroEstelar("Crucero4", 80, 2018, 250);
            Nave crucero5 = new CruceroEstelar("Crucero5", 100, 2022, 500);

            agencia.agregarNave(naveExploracion1);
            agencia.agregarNave(naveExploracion2);
            agencia.agregarNave(naveExploracion3);
            agencia.agregarNave(naveExploracion4);
            agencia.agregarNave(naveExploracion5);
        
            agencia.agregarNave(carguero1);
            agencia.agregarNave(carguero3);
            agencia.agregarNave(carguero4);
            agencia.agregarNave(carguero5);

            agencia.agregarNave(crucero1);
            agencia.agregarNave(crucero2);
            agencia.agregarNave(crucero3);
            agencia.agregarNave(crucero4);
            agencia.agregarNave(crucero5);

            System.out.println("Mostrando todas las naves:");
            agencia.mostrarNaves();

            System.out.println("\nIniciando exploracion:");
            agencia.iniciarExploracion();
            agencia.agregarNave(carguero2);

        } catch (ExceptionNavesDuplicado e) {
            System.err.println(e.getMessage());
        }
    }
}
